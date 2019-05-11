package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.customexceptions.BuissnessException;
import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.Flight;



public interface FlightService {
	public void addFlight(Flight flight) throws BusinessException;
	 public void removeFlight(String flightid) throws BusinessException;
	 public void editFlight(Flight flight) throws BusinessException;
	 public Flight getByIdFlight(String flightid) throws BusinessException;
	 public List<Flight> getAll() throws BusinessException;

}
