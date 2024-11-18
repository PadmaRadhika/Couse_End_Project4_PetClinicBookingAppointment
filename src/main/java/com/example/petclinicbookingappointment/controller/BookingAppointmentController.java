package com.example.petclinicbookingappointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.example.petclinicbookingappointment.model.BookingAppointment;
import com.example.petclinicbookingappointment.model.Pet;
import com.example.petclinicbookingappointment.service.BookingAppointmentService;

import reactor.core.publisher.Mono;
@RestController
@Configuration
@CrossOrigin(origins = "http://localhost:4200") // Allow CORS from Angular app
@RequestMapping(value = "/bookingAppointment")
public class BookingAppointmentController {
	private WebClient webClient;
	@Autowired
	private BookingAppointmentService bookingAppointmentService;
	@Autowired
	private WebClient.Builder webClientBuilder;
	@PostMapping
	public ResponseEntity<?> createBookingAppointment(@RequestBody BookingAppointment bookingAppointment) {
		
		webClient = webClientBuilder.baseUrl("http://localhost:8086").build();		
        Mono<Pet> petMono =  webClient.get()
                .uri("/pet/{id}", bookingAppointment.getPetId())
                .retrieve()                
              .bodyToMono(Pet.class);
        //BookingAppointment createdBookingAppointment = null;
        try {
        	Pet pet = petMono.block();
        	BookingAppointment createdBookingAppointment= bookingAppointmentService.saveBookingAppointment(bookingAppointment);
        	return ResponseEntity.status(HttpStatus.CREATED).body(createdBookingAppointment);
        }catch (WebClientResponseException.NotFound e) {
            // Handle "Pet not found" scenario - 404 error if the owner does not exist
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Pet with ID " + bookingAppointment.getPetId() + " not found");
        } catch (Exception e) {
            // Handle other errors, e.g., network issues, unexpected errors, etc.
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request: " + e.getMessage());
        }
        
        
    }
}
