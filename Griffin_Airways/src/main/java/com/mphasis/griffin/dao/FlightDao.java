package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.entities.Flight;



public interface FlightDao {
	public void insertFlight(Flight flight);
	  public void deleteFlight(int flightid);
	  public void updateFlight(Flight flight);
	  public Flight getFlightById(int flightid);
	  public List<Flight> getAll();
}
