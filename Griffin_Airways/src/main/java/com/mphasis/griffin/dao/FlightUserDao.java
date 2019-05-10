package com.mphasis.griffin.dao;

import com.mphasis.griffin.entities.FlightUser;

public interface FlightUserDao {
	public FlightUser signIn(String email,String password);
}
