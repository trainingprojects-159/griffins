package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public void addFlight(Flight flight) {
		System.out.println("Flight values in service"+flight.getFname());
		flightDao.insertFlight(flight);
	}

	public void removeFlight(int flightid) {
		flightDao.deleteFlight(flightid);

	}

	public void editFlight(Flight flight) {
		flightDao.updateFlight(flight);

	}

	public Flight getByIdFlight(int flightid) {
		return flightDao.getFlightById(flightid);
	}

	public List<Flight> getAll() {
		
		return flightDao.getAll();
	}

}
