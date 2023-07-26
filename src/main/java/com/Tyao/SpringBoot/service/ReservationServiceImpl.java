package com.Tyao.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tyao.SpringBoot.Repository.FlightRepo;
import com.Tyao.SpringBoot.Repository.PassengerRepo;
import com.Tyao.SpringBoot.Repository.ReservationRepo;
import com.Tyao.SpringBoot.dto.ReservationRequest;
import com.Tyao.SpringBoot.flight.entities.Flight;
import com.Tyao.SpringBoot.flight.entities.Passenger;
import com.Tyao.SpringBoot.flight.entities.Reservation;
import com.Tyao.SpringBoot.util.EmailUtil;
import com.Tyao.SpringBoot.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	FlightRepo flightRepo;

	@Autowired
	PassengerRepo passengerRepo;

	@Autowired
	ReservationRepo reservationRepo;
	
	@Autowired
	PDFGenerator pdfGenerator;
	
	@Autowired
	EmailUtil emailUtil;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
	Long flightId = request.getFlightId();
		Flight flight = flightRepo.findById(flightId).get();
		
		Passenger passenger =new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		
		passenger.setLastName(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerPhone());
		
		Passenger save = passengerRepo.save(passenger);
		System.out.println(save);
		
		Reservation reservation =new Reservation();
		reservation.setFli(flight);
		reservation.setPass(save);
		reservation.setCheckedIn(false);
		Reservation savedReservation = reservationRepo.save(reservation);
		
		String filePath="D:\\Reservation pdf\\Booking"+savedReservation.getId()+".pdf";
		pdfGenerator.generatedItinerary(savedReservation, filePath);
		
		System.out.println(passenger.getEmail());
		emailUtil.sendItinerary(passenger.getEmail(), filePath);
		return savedReservation;
	}

}
