package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.dao.CustomersDao;
import com.mphasis.griffin.entities.Customers;
import com.mphasis.griffin.entities.Flight;
import com.mphasis.griffin.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomersDao customersDao;

	public void register(Customers customers) {
		customersDao.register(customers);
	}
	public List<Flight> retriveFlightDetails(String source, String destination, String scheduleDate) {
		return customersDao.getFlightDetails(source, destination, scheduleDate);
	}
	
}
