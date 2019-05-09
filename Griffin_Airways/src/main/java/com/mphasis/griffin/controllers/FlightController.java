package com.mphasis.griffin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.griffin.entities.Flight;
import com.mphasis.griffin.service.FlightService;


@RestController
public class FlightController {
 @Autowired
 FlightService flightService;

public void setFlightService(FlightService flightService) {
	this.flightService = flightService;
}
@RequestMapping(value="/flights",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
public List<Flight> listFlights() {
 
return flightService.getAll();
}
@RequestMapping(value="/flight/add",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
public void addFlight(@RequestBody Flight c) {
	
		this.flightService.addFlight(c);
	}
@RequestMapping(value="/remove/{flightid}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
public void removeFlight(@PathVariable("flightid")int flightid) {
	
	
	this.flightService.removeFlight(flightid);
	}
@RequestMapping(value="/car/{flightid}",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
public void editFlight(@PathVariable("flightid")int flightid,@RequestBody Flight f) {
	this.flightService.editFlight(f);
	
	
}
@RequestMapping(value="/car/{flightId}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
public Flight getFlightByID(@PathVariable("flightId")int flightId) {
	return this.flightService.getByIdFlight(flightId);
}
}
