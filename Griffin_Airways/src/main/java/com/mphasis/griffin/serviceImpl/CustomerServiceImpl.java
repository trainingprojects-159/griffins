package com.mphasis.griffin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.griffin.dao.CustomersDao;
import com.mphasis.griffin.entities.Customers;
import com.mphasis.griffin.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomersDao customersDao;

	public void register(Customers customers) {
		customersDao.register(customers);
	}
	
}
