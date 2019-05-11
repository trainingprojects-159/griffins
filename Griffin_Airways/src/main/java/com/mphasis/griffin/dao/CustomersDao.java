package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.Customers;
import com.mphasis.griffin.entities.Flight;

public interface CustomersDao {
	public void register(Customers customers) throws BusinessException;

	public Customers signIn(String email, String password) throws BusinessException;

	public List<Flight> getFlightDetails(String source, String destination, String scheduleDate)
			throws BusinessException;
}
