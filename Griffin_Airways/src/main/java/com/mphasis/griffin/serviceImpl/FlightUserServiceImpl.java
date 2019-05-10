package com.mphasis.griffin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.dao.FlightUserDao;
import com.mphasis.griffin.entities.FlightUser;
import com.mphasis.griffin.service.FlightUserService;

@Service
public class FlightUserServiceImpl implements FlightUserService{
	
	@Autowired
	FlightUserDao userSignInDao;
	
	public void setUserDao(FlightUserDao userDao) {
		this.userSignInDao = userDao;
	}

	public FlightUser signIn(String email, String password) {
		return userSignInDao.signIn(email, password);
	}
	
}
