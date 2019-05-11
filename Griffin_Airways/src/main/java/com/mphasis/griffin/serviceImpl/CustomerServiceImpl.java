package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.dao.CustomersDao;
import com.mphasis.griffin.entities.Customers;
import com.mphasis.griffin.entities.Flight;
import com.mphasis.griffin.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomersDao customersDao;

	public void register(Customers customers) throws BusinessException {
		customersDao.register(customers);
	}
	
	public Customers signIn(String email, String password) throws BusinessException {
		
		return customersDao.signIn(email, password);
	}
	
	public List<Flight> retriveFlightDetails(String source, String destination, String scheduleDate) throws BusinessException {
		return customersDao.getFlightDetails(source, destination, scheduleDate);
	
	}
	
}
