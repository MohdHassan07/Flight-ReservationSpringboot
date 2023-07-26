package com.Tyao.SpringBoot.integration;

import com.Tyao.SpringBoot.integration.dto.Reservation;
import com.Tyao.SpringBoot.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClint {

	public Reservation findreserReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
