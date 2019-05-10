package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.Flight;



public interface FlightService {
	public void addFlight(Flight flight);
	 public void removeFlight(String flightid);
	 public void editFlight(Flight flight);
	 public Flight getByIdFlight(String flightid);
	 public List<Flight> getAll();

}
