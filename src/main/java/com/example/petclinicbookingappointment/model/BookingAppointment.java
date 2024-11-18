package com.example.petclinicbookingappointment.model;


import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookingAppointment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer petId;
	private Timestamp appointmentDateTime;
	private String reason;
	private String additionalNotes;
	public BookingAppointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingAppointment(Integer id, Integer petId, Timestamp appointmentDateTime, String reason, String additionalNotes) {
		super();
		this.id = id;
		this.petId = petId;
		this.appointmentDateTime = appointmentDateTime;
		this.reason = reason;
		this.additionalNotes = additionalNotes;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPetId() {
		return petId;
	}
	public void setPetId(Integer petId) {
		this.petId = petId;
	}
	public Timestamp getAppointmentDateTime() {
		return appointmentDateTime;
	}
	public void setAppointmentDate(Timestamp appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getAdditionalNotes() {
		return additionalNotes;
	}
	public void setAdditionalNotes(String additionalNotes) {
		this.additionalNotes = additionalNotes;
	}
	@Override
	public String toString() {
		return "BookingAppointment [id=" + id + ", petId=" + petId + ", appointmentDateTime=" + appointmentDateTime
				+ ", reason=" + reason + ", additionalNotes=" + additionalNotes + "]";
	}
	
}
