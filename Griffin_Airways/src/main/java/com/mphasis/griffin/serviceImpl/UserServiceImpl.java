package com.mphasis.griffin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.dao.UserSignInDao;
import com.mphasis.griffin.entities.FlightUser;
import com.mphasis.griffin.service.UserSignInService;

@Service
public class UserServiceImpl implements UserSignInService{
	
	@Autowired
	UserSignInDao userSignInDao;
	
	public void setUserDao(UserSignInDao userDao) {
		this.userSignInDao = userDao;
	}

	public FlightUser signIn(String email, String password) {
		return userSignInDao.signIn(email, password);
	}
	
}
