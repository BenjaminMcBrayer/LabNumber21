package com.gc.coffee.LabNumber21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	Person p;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "registration", "");
	}

	@RequestMapping("registration")
	public String form() {
		return "registration";
	}

	@RequestMapping("former")
	public ModelAndView registration(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName, @RequestParam("eAddress") String emailAddress, @RequestParam("pNumber") String phoneNumber, @RequestParam("pWord") String password) {
		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setEmailAddress(emailAddress);
		p.setPhoneNumber(phoneNumber);
		p.setPassword(password);
		
		return new ModelAndView("registrationresults", "person", "Hello, " + p.getFirstName() + "! Thank you for registering.");
	}
}
