package com.example.BusHop.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;


import com.example.BusHop.Models.Reservation;


public interface reservationRepository extends JpaRepositoryImplementation<Reservation,String> {

	@Query("SELECT t from Reservation t WHERE busId=%?1% AND bookedSeat=%?2%")
	List<Reservation> findByIdAndSeat(String busId,int no);
	
	@Query(value="SELECT t FROM Reservation t WHERE userId=%?1%",nativeQuery=false)
	List<Reservation>findHistoryByUserId(Long userId);


}
