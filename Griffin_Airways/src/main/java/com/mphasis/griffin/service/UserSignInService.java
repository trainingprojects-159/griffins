package com.mphasis.griffin.service;

import com.mphasis.griffin.entities.FlightUser;

public interface UserSignInService {
	public FlightUser signIn(String email, String password);
}
