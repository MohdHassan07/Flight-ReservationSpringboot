package com.Tyao.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tyao.SpringBoot.flight.entities.Flight;
import com.Tyao.SpringBoot.flight.entities.Passenger;
import com.Tyao.SpringBoot.flight.entities.Reservation;
import com.Tyao.SpringBoot.flight.entities.User;


public interface ReservationRepo extends JpaRepository<Reservation, Long>  {

}
