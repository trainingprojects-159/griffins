package com.mphasis.griffin.service;

import com.mphasis.griffin.entities.Admin;


public interface AdminService {
	public Admin login(String userId, String password);
}
