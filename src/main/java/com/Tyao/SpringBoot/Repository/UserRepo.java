package com.Tyao.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tyao.SpringBoot.flight.entities.Flight;
import com.Tyao.SpringBoot.flight.entities.User;


public interface UserRepo extends JpaRepository<User, Long>  {
	User findByemail(String email);

}
