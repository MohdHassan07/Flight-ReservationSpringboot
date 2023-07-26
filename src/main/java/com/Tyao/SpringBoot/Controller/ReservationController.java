package com.Tyao.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Tyao.SpringBoot.Repository.FlightRepo;
import com.Tyao.SpringBoot.dto.ReservationRequest;
import com.Tyao.SpringBoot.flight.entities.Flight;
import com.Tyao.SpringBoot.flight.entities.Reservation;
import com.Tyao.SpringBoot.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	FlightRepo repo;
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservation")
	public String completeReservation(@RequestParam("flightId") Long fligtId,ModelMap map) {
		System.out.println("hiii");
		Flight flight = repo.findById(fligtId).get();
		map.addAttribute("flight", flight);
		System.out.println("byyy");
		return "completeReservation";
		
	}
	@RequestMapping("/completeReservation")
	public String completeReservation(ReservationRequest request,ModelMap map) {
		Reservation reservation = reservationService.bookFlight(request);
		map.addAttribute("msg","Reservation created successfully and the is is"+ reservation.getId());
		return "reservationConfirmation";
		
	}
}
