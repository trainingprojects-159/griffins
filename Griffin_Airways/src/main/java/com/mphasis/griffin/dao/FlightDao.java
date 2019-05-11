package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.customexceptions.BuissnessException;
import com.mphasis.griffin.entities.Flight;

public interface FlightDao {
	public void insertFlight(Flight flight) throws BuissnessException;

	public void deleteFlight(String flightid);

	public void updateFlight(Flight flight);

	public Flight getFlightById(String flightid);

	public List<Flight> getAll();
}
