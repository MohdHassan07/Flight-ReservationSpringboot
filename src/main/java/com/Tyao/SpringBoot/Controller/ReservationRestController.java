package com.Tyao.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tyao.SpringBoot.Repository.ReservationRepo;
import com.Tyao.SpringBoot.dto.ReservationRequest;
import com.Tyao.SpringBoot.dto.ReservationUpdateRequest;
import com.Tyao.SpringBoot.flight.entities.Reservation;

@RestController
@CrossOrigin
public class ReservationRestController {

	@Autowired
	ReservationRepo reservationRepo;
	
	@RequestMapping("/reservation/{id}")
	public Reservation findReservation(@PathVariable("id")Long id) {
		return reservationRepo.findById(id).get();
		
	}
	@RequestMapping("/reservation")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Reservation reservation = reservationRepo.findById(request.getId()).get();
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getcheckedIn());
		return reservationRepo.save(reservation);
		
	}
}
