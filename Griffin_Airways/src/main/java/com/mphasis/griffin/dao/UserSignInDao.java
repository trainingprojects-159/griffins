package com.mphasis.griffin.dao;

import com.mphasis.griffin.entities.SignIn;

public interface UserSignInDao {
	public SignIn signIn(String userId,String password);
}
