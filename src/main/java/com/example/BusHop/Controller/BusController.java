package com.example.BusHop.Controller;

import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import com.example.BusHop.Models.Bus;
import com.example.BusHop.Repository.BusRepositoryInterface;

import jakarta.persistence.EntityManager;



@RestController
@RequestMapping("/api")
public class BusController {

	
	@Autowired
	BusRepositoryInterface bs;
	

	
	@PostMapping("/admin/bus/add")
	public Bus addNewBus(@RequestBody Bus bus) {
		return bs.save(bus);	
    }
	
	@PutMapping("/admin/bus/update/{id}")
	public Bus updateBus(@PathVariable("id") String id,@RequestBody Bus bus) {
		
		Bus setBus=bs.findById(id).orElseThrow();
		setBus.setArrivalTime(bus.getArrivalTime());
		setBus.setBusName(bus.getBusName());
		setBus.setDepartTime(bus.getDepartTime());
		setBus.setFare(bus.getFare());
		
		return bs.save(setBus);
		
	}
	
	
	@GetMapping("/bus/{id}")
	public List<Bus> getPlaces(@PathVariable("id")String id) {
		List<Bus>results =bs.findBySrcDst(id);
        return results;
    }
	
	@GetMapping("/bus/{srcdst}/{date}")
	public List<Bus> getBuses(@PathVariable("srcdst")String srcdst,@PathVariable("date")String date){
		List<Bus> res=bs.findByDateAndBusId(srcdst, date);
		return res;
	}
	
}


//{
//    "busId":"wb 29",
//	"busName":"Laxmi",
//	"source":"Kolkata",
//	"destination":"Midnapore",
//	"distance":"100km",
//	"srcdst":"kolkatamidnapore",
//	"departTime":"11.00 pm",
//	"arrivalTime":"2.00 AM",
//	"fare":"160",
//    "totalSeats":"60"
//}