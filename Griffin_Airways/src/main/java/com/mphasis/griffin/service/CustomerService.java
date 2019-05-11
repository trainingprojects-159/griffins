package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.Customers;
import com.mphasis.griffin.entities.Flight;

public interface CustomerService {
	public void register(Customers customers);
	public Customers signIn(String email, String password);
	public List<Flight> retriveFlightDetails(String source, String destination, String scheduleDate);
	
}
