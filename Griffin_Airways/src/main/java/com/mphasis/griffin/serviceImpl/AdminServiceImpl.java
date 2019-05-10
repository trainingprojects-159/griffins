package com.mphasis.griffin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.dao.AdminDao;
import com.mphasis.griffin.entities.Admin;

import com.mphasis.griffin.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
@Autowired
  AdminDao adminDao;

public void setAdminDao(AdminDao adminDao) {
	this.adminDao = adminDao;
}

public Admin login(String userId, String password) {
	
	return adminDao.login(userId, password);
}


	

}
