package com.Tyao.SpringBoot.Controller;

import java.security.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Tyao.SpringBoot.Repository.FlightRepo;
import com.Tyao.SpringBoot.flight.entities.Flight;

@Controller
public class FlightController {
	
	
	@Autowired
	FlightRepo repo;
	@RequestMapping("/fregister")
	public String fregister() {
		return "FlightDetails";
		
	}

	@RequestMapping(value ="/tyao")
	public String saveFlight(@ModelAttribute Flight flight) {
		System.out.println(flight.getOperatingAirlines());
		/* repo.save(flight); */
	
	return "FlightDetails";

	}

	@RequestMapping(value = "/findFlights", method = RequestMethod.POST)
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("dateOfDepatrure") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOfDepatrure, ModelMap map) {

		//List<Flight> flights = repo.findByArrivalCity(to);
		List<Flight> flights = repo.findByFlights(from, to, dateOfDepatrure);

		System.out.println(from + " " + to + " " + dateOfDepatrure);
		
		
		for (Flight f : flights) {
			System.out.println(f.getArrivalCity());
		}
		map.addAttribute("flights", flights);

		return "dispalyFlights";

	}
}
