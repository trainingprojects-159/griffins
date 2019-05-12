package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.dao.FlightDao;
import com.mphasis.griffin.entities.Flight;
import com.mphasis.griffin.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	FlightDao flightDao;

	public void setFlightDao(FlightDao flightDao) {
		this.flightDao = flightDao;
	}

	public void addFlight(Flight flight) throws BusinessException {
		System.out.println("Flight values in service" + flight.getFname());
		flightDao.insertFlight(flight);
	}

	public void removeFlight(String flightid) throws BusinessException {
		flightDao.deleteFlight(flightid);

	}

	public void editFlight(Flight flight) throws BusinessException {
		flightDao.updateFlight(flight);

	}

	public Flight getByIdFlight(String flightid) throws BusinessException {
		return flightDao.getFlightById(flightid);
	}

	public List<Flight> getAll() throws BusinessException {

		return flightDao.getAll();
	}

}
