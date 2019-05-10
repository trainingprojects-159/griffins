package com.mphasis.griffin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.mphasis.griffin.entities.PassengerInfo;
import com.mphasis.griffin.entities.FlightUser;
import com.mphasis.griffin.service.PassengerService;
import com.mphasis.griffin.service.UserSignInService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserSignInService userService;

	@RequestMapping(value = "/signIn/{email}/{password}", method = RequestMethod.GET)
	public FlightUser signin(@PathVariable("email") String email, @PathVariable("password") String password) {
		FlightUser signin = userService.signIn(email, password);
		return signin;
	}

	@Autowired
	PassengerService passengerService;

	public void setPassengerService(PassengerService passengerService) {
		this.passengerService = passengerService;
	}

	@RequestMapping(value = "/passengers", method = RequestMethod.GET)
	public List<PassengerInfo> listPassenger() {
		System.out.println("Passengers");

		return passengerService.getAllPassenger();
	}

	@RequestMapping(value = "/passenger/add", method = RequestMethod.POST)
	public void addPassenger(@RequestBody PassengerInfo p) {

		this.passengerService.addPassenger(p);
	}

	@RequestMapping(value = "/passenger/{passId}", method = RequestMethod.DELETE)

	public void removePassenger(@PathVariable("passId") String passId) {

		this.passengerService.removePassenger(passId);

	}

	@RequestMapping(value = "/passenger/{passId}", method = RequestMethod.PUT)
	public void editEmployee(@PathVariable("passId") String passId, @RequestBody PassengerInfo p) {
		this.passengerService.updatePassenger(p);
	}

	@RequestMapping(value = "/passenger/{passId}", method = RequestMethod.GET)
	public PassengerInfo getPassengerById(@PathVariable("passId") String passId) {
		return this.passengerService.getPassengerById(passId);
	}

}
