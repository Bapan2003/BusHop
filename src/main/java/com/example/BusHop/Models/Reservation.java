package com.example.BusHop.Models;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Reservation {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reservationID;
    private String status;
    private LocalDate date;
    private LocalTime time;
    private String busId;
    private String source;
    private String destination;
    private LocalDate journeyDate;
    private Integer bookedSeat;
    private Integer fare;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(Integer reservationID, String status, LocalDate date, LocalTime time, String source,
			String destination, LocalDate journeyDate, Integer bookedSeat, Integer fare) {
		super();
		this.reservationID = reservationID;
		this.status = status;
		this.date = date;
		this.time = time;
		this.source = source;
		this.destination = destination;
		this.journeyDate = journeyDate;
		this.bookedSeat = bookedSeat;
		this.fare = fare;
	}
	
	public Reservation(Integer reservationID, String status, LocalDate date, LocalTime time, String busId,
			String source, String destination, LocalDate journeyDate, Integer bookedSeat, Integer fare) {
		super();
		this.reservationID = reservationID;
		this.status = status;
		this.date = date;
		this.time = time;
		this.busId = busId;
		this.source = source;
		this.destination = destination;
		this.journeyDate = journeyDate;
		this.bookedSeat = bookedSeat;
		this.fare = fare;
	}
	public Integer getReservationID() {
		return reservationID;
	}
	public void setReservationID(Integer reservationID) {
		this.reservationID = reservationID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	public Integer getBookedSeat() {
		return bookedSeat;
	}
	public void setBookedSeat(Integer bookedSeat) {
		this.bookedSeat = bookedSeat;
	}
	public Integer getFare() {
		return fare;
	}
	public void setFare(Integer fare) {
		this.fare = fare;
	}
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
    
    

}
