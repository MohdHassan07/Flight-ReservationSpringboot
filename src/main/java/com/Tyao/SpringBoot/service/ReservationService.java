package com.Tyao.SpringBoot.service;

import com.Tyao.SpringBoot.dto.ReservationRequest;
import com.Tyao.SpringBoot.flight.entities.Reservation;

public interface ReservationService {

	
	public Reservation bookFlight(ReservationRequest request);
}
