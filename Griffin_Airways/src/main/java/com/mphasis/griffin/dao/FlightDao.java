package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.entities.Flight;



public interface FlightDao {
	public void insertFlight(Flight flight);
	  public void deleteFlight(String flightid);
	  public void updateFlight(Flight flight);
	  public Flight getFlightById(String flightid);
	  public List<Flight> getAll();
	  /*
	   * Return Flight based on route and date of journey.
	   */
	  public List<Flight> getFlightDetails(String source, String destination, String scheDate);
}
