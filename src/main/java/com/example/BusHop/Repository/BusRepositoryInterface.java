package com.example.BusHop.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;


import com.example.BusHop.Models.Bus;


public interface BusRepositoryInterface extends JpaRepositoryImplementation<Bus,String>{

	
	@Query("select t from Bus t where srcdst like %?1%")
	List<Bus> findBySrcDst(String srcdst);
	
}
