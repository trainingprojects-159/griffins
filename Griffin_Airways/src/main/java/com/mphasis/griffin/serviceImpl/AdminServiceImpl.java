package com.mphasis.griffin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.customexceptions.BusinessException;
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

	Admin admin = null;

	public Admin login(String userId, String password) throws BusinessException {

		if (userId != null && userId.matches("[a-zA-Z0-9]{4,15}@gmail.com")) {

		} else if (password != null && password.matches("^(?=.*\\d).{4,8}$")) {

		}
		return adminDao.login(userId, password);
	}

}