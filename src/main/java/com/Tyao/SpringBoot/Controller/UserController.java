package com.Tyao.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Tyao.SpringBoot.Repository.UserRepo;
import com.Tyao.SpringBoot.flight.entities.User;


@Controller
public class UserController {
	
  @Autowired
	private UserRepo re;
	@RequestMapping("/register")
	public String showRegistration() {
		
		return "registerUser";
		
	}
	@RequestMapping(value = "/registerUser",method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		System.out.println(user);
		re.save(user);
		return "login";
		
	}
	@RequestMapping("/login")
	public String login(@RequestParam("email") String email,@RequestParam("password") String password,ModelMap map) {
		System.out.println(email);
		User user = re.findByemail(email);
		//System.out.println(user.getFirstName());
		if(user.getPassword().equals(password)) {
			return "findFlight";
		}
		else {
			map.addAttribute("msg","Invalid User Name Or PassWord. Please Try Again");
		}
		
		
		return "login";
		
	}
}
