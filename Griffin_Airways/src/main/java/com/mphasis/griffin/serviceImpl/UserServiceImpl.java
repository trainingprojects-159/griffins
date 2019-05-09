package com.mphasis.griffin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.griffin.dao.UserSignInDao;
import com.mphasis.griffin.entities.SignIn;
import com.mphasis.griffin.service.UserSignInService;

public class UserServiceImpl implements UserSignInService{
	
	@Autowired
	UserSignInDao userSignInDao;
	
	public void setUserDao(UserSignInDao userDao) {
		this.userSignInDao = userDao;
	}

	public SignIn signIn(String userId, String password) {
		return userSignInDao.signIn(userId, password);
	}
	
}
