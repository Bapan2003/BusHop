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
    private String date;
    private String time;
    private Long userId;
    private String busId;
    private String source;
    private String destination;
    private String journeyDate;
    private Integer bookedSeat;
    private Integer fare;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(Integer reservationID, String status, String date, String time, String source,
			String destination, String journeyDate, Integer bookedSeat, Integer fare) {
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
	
	public Reservation(Integer reservationID, String status, String date, String time, String busId,
			String source, String destination, String journeyDate, Integer bookedSeat, Integer fare,Long userId) {
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
		this.userId=userId;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
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
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
    
    

}
