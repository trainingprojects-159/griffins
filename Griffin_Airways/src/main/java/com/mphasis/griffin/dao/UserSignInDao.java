package com.mphasis.griffin.dao;

import com.mphasis.griffin.entities.FlightUser;

public interface UserSignInDao {
	public FlightUser signIn(String email,String password);
}
