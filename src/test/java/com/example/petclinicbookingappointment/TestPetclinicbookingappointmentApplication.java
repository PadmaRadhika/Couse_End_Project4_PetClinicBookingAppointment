package com.example.petclinicbookingappointment;

import org.springframework.boot.SpringApplication;

public class TestPetclinicbookingappointmentApplication {

	public static void main(String[] args) {
		SpringApplication.from(PetclinicbookingappointmentApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
