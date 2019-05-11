package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.dao.PassengerDao;
import com.mphasis.griffin.entities.PassengerInfo;
import com.mphasis.griffin.service.PassengerService;

@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
	PassengerDao passengerDao;

	public PassengerDao getPassengerDao() {
		return passengerDao;
	}

	public void addPassenger(PassengerInfo passenger) throws BusinessException {
		passengerDao.insertPassenger(passenger);

	}

	public void updatePassenger(PassengerInfo passenger) throws BusinessException {
		passengerDao.updatePassenger(passenger);

	}

	public void removePassenger(String passId) throws BusinessException {
		passengerDao.deletePassenger(passId);

	}

	public PassengerInfo getPassengerById(String passId) throws BusinessException {

		return passengerDao.getPassengerById(passId);
	}

	public List<PassengerInfo> getAllPassenger() throws BusinessException {

		return passengerDao.getAllPassenger();
	}

}
