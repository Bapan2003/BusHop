package com.example.BusHop.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BusHop.Models.Reservation;
import com.example.BusHop.Repository.reservationRepository;

@RestController
@RequestMapping("/api")
public class ReservationController {

	
	@Autowired
	private reservationRepository rs;
	@PostMapping("/seat/book")
	 public Reservation newReservation(@RequestBody Reservation reservation) {
		String id=reservation.getBusId();
		int no=reservation.getBookedSeat();
		String date=reservation.getJourneyDate();
		List<Reservation> cur=rs.findByIdAndSeat(id, no,date);
		if(cur.size()==0) {
			return rs.save(reservation);
			
		}
		
		return new Reservation();
		
	}
	@GetMapping("/seat/bus/{busId}")
	public List<Reservation> checkSeatByBusId(@PathVariable("busId")String busId){
		List<Reservation> cur=rs.findSeatByBusId(busId);
		return cur;
	}
	@GetMapping("/seat/check/{id}/{no}/{date}")
	public List<Reservation> checkBookedOrNot(@PathVariable("id")String id, @PathVariable("no")int no,@PathVariable("date") String date) {
		List<Reservation> cur=rs.findByIdAndSeat(id, no,date);
		return cur;
		
	}
	@GetMapping("/seat/{busId}/{date}")
	public List<Reservation> getBusByBusIdandDate(@PathVariable("busId")String busId, @PathVariable("date")String date) {
		List<Reservation> cur=rs.findBusByBusIdAndDate(busId, date);
		return cur;
		
	}
	
	
	@GetMapping("/seat/history/{userId}")
	public List<Reservation> getHistory(@PathVariable("userId") Long userId){
		List<Reservation> cur=rs.findHistoryByUserId(userId);
		return cur;
	}
}
