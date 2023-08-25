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
	 public String newReservation(@RequestBody Reservation reservation) {
		String id=reservation.getBusId();
		int no=reservation.getBookedSeat();
		List<Reservation> cur=rs.findByIdAndSeat(id, no);
		if(cur.size()==0) {
			rs.save(reservation);
			return "Successfully Booked";
		}
		
		return "Already Reserved";
		
	}
	@GetMapping("/seat/check/{id}/{no}")
	public List<Reservation> checkBookedOrNot(@PathVariable("id")String id, @PathVariable("no")int no) {
		List<Reservation> cur=rs.findByIdAndSeat(id, no);
		return cur;
		
	}
	
	@GetMapping("/seat/history/{userId}")
	public List<Reservation> getHistory(@PathVariable("userId") Long userId){
		List<Reservation> cur=rs.findHistoryByUserId(userId);
		return cur;
	}
}
