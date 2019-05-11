package com.mphasis.griffin.dao;


import com.mphasis.griffin.customexceptions.BuissnessException;
import com.mphasis.griffin.entities.Admin;

public interface AdminDao {
	public Admin login(String userId, String password) throws BuissnessException;
}
