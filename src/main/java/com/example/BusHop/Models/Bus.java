package com.example.BusHop.Models;


import java.util.List;



import jakarta.persistence.*;
@Entity
@Table
public class Bus {

	
	
	@Id
	private String busId;
	private String busName;
	private String source;
	private String destination;
	private String distance;
	private String srcdst;
	private String departTime;
	private String deptDate;
	private String arrivalTime;
	private String fare;
	private String totalSeats;
//	@OneToMany(cascade = CascadeType.ALL)
//    private List<Reservation> reservationList = new ArrayList<>();
	
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bus(String busId, String busName, String source, String destination, String distance, String srcdst,
		String departTime, String deptDate, String arrivalTime, String fare, String totalSeats) {
	super();
	this.busId = busId;
	this.busName = busName;
	this.source = source;
	this.destination = destination;
	this.distance = distance;
	this.srcdst = srcdst;
	this.departTime = departTime;
	this.deptDate = deptDate;
	this.arrivalTime = arrivalTime;
	this.fare = fare;
	this.totalSeats = totalSeats;
}

	public Bus(String busId, String busName, String source, String destination, String distance, String departTime,
			String arrivalTime, String fare,String totalSeats) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.departTime = departTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
		this.totalSeats=totalSeats;
	}
	
	
	public Bus(String busId, String busName, String source, String destination, String distance, String departTime,
			String arrivalTime, String fare, String totalSeats, List<Reservation> reservationList) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.departTime = departTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
		this.totalSeats = totalSeats;
//		this.reservationList = reservationList;
	}
	
	public Bus(String busId, String busName, String source, String destination, String distance, String srcdst,
			String departTime, String arrivalTime, String fare, String totalSeats, List<Reservation> reservationList) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.srcdst = srcdst;
		this.departTime = departTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
		this.totalSeats = totalSeats;
//		this.reservationList = reservationList;
	}
	public String getBusId() {
		return busId;
	} 
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
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
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getDepartTime() {
		return departTime;
	}
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}
	public String getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(String totalSeats) {
		this.totalSeats = totalSeats;
	}
//	public List<Reservation> getReservationList() {
////		return reservationList;
//	}
//	public void setReservationList(List<Reservation> reservationList) {
//		this.reservationList = reservationList;
//	}
	public String getSrcdst() {
		return srcdst;
	}
	public void setSrcdst(String srcdst) {
		this.srcdst = srcdst;
	}

	public String getDeptDate() {
		return deptDate;
	}

	public void setDeptDate(String deptDate) {
		this.deptDate = deptDate;
	}
	
	
	
}
