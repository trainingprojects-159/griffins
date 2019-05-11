package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.Flight;

public interface FlightDao {
	public void insertFlight(Flight flight) throws BusinessException;

	public void deleteFlight(String flightid) throws BusinessException;

	public void updateFlight(Flight flight) throws BusinessException;

	public Flight getFlightById(String flightid) throws BusinessException;

	public List<Flight> getAll() throws BusinessException ;
}
