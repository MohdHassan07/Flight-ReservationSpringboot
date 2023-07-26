package com.Tyao.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Tyao.SpringBoot.flight.entities.Flight;

@SpringBootApplication
public class FlihtReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlihtReservationApplication.class, args);
		
	}
	

}
