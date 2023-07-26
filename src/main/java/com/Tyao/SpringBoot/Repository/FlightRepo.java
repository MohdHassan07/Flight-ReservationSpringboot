package com.Tyao.SpringBoot.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Tyao.SpringBoot.flight.entities.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long> {

	
	  @Query("from Flight where depatureCity=:depatureCity and arrivalCity=:arrivalCity and dateOfDepatrure=:dateOfDepatrure"
	  ) 
	  List<Flight> findByFlights(@Param("depatureCity") String from, 
	  @Param("arrivalCity") String to,
	  
	  @Param("dateOfDepatrure") Date dateOfDepatrure);
	 
//	List<Flight> findByArrivalCity(String arrivalCity);

}
