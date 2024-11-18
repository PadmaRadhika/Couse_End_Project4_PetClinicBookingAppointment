package com.example.petclinicbookingappointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petclinicbookingappointment.dao.BookingAppointmentRepository;
import com.example.petclinicbookingappointment.model.BookingAppointment;
@Service
public class BookingAppointmentServiceImpl implements BookingAppointmentService{
	@Autowired
	private BookingAppointmentRepository bookingAppointmentServiceRepository;

	@Override
	public BookingAppointment saveBookingAppointment(BookingAppointment bookingAppointment) {
		// TODO Auto-generated method stub
		return bookingAppointmentServiceRepository.save(bookingAppointment);
	}

}
