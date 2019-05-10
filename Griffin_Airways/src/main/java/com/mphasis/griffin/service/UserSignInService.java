package com.mphasis.griffin.service;

import com.mphasis.griffin.entities.SignIn;

public interface UserSignInService {
	public SignIn signIn(String email, String password);
}
