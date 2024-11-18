package com.example.petclinicbookingappointment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petclinicbookingappointment.model.BookingAppointment;

public interface BookingAppointmentRepository extends JpaRepository<BookingAppointment, Integer>{

}
