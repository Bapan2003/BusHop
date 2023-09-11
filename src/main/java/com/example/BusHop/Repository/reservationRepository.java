package com.example.BusHop.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;


import com.example.BusHop.Models.Reservation;


public interface reservationRepository extends JpaRepositoryImplementation<Reservation,String> {

	@Query(value="SELECT t from Reservation t WHERE busId=%?1% AND bookedSeat=%?2% AND journeyDate=%?3%",nativeQuery=false)
	List<Reservation> findByIdAndSeat(String busId,int no,String date);
	
	@Query(value="SELECT t FROM Reservation t WHERE userId=%?1%",nativeQuery=false)
	List<Reservation>findHistoryByUserId(Long userId);
	
	@Query(value="SELECT t FROM Reservation t WHERE busId=%?1%",nativeQuery=false)
	List<Reservation>findSeatByBusId(String busId);
	
	@Query(value="SELECT t FROM Reservation t WHERE busId=%?1% AND journeyDate=%?2%",nativeQuery=false)
	List<Reservation>findBusByBusIdAndDate(String busId,String date);
}
