package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.Customers;
import com.mphasis.griffin.entities.Flight;

public interface CustomerService {
	public void register(Customers customers);
	public List<Flight> retriveFlightDetails(String source, String destination, String scheduleDate);
}
