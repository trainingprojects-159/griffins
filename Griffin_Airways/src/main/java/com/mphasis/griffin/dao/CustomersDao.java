package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.entities.Customers;
import com.mphasis.griffin.entities.Flight;

public interface CustomersDao {
	public void register(Customers customers);
	public Customers signIn(String email, String password);
	public List<Flight> getFlightDetails(String source, String destination, String scheduleDate);
}
