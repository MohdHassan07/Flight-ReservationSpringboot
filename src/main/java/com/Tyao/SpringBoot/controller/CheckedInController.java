package com.Tyao.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Tyao.SpringBoot.integration.ReservationRestClint;
import com.Tyao.SpringBoot.integration.dto.Reservation;
import com.Tyao.SpringBoot.integration.dto.ReservationUpdateRequest;

@Controller
public class CheckedInController {

	@Autowired
	ReservationRestClint restClint;

	@RequestMapping("/showStartCheckin")
	public String showstartCheckIn() {
		return "startCheckIn";

	}

	@RequestMapping(value = "/startCheckIn")

	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap map) {
		// System.out.println("kidhrr");
		Reservation reservation = restClint.findreserReservation(reservationId);
		map.addAttribute("reservation", reservation);
		return "displayReservationDetails";

	}
@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Long reservationId,@RequestParam("numberOfBags") int numberOfBags) {
		ReservationUpdateRequest rs = new ReservationUpdateRequest();
        rs.setId(reservationId);
        rs.setcheckedIn(true);
        rs.setNumberOfBags(numberOfBags);
        restClint.updateReservation(rs);
		return "CheckedInConfirmation";

	}
}
