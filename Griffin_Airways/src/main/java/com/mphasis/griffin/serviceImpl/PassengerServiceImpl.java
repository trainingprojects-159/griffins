package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void addPassenger(PassengerInfo passenger) {
		  passengerDao.insertPassenger(passenger);
		
	}

	public void updatePassenger(PassengerInfo passenger) {
		passengerDao.updatePassenger(passenger);
		
	}

	public void removePassenger(String passId) {
		passengerDao.deletePassenger(passId);
		
	}

	public PassengerInfo getPassengerById(int passId) {
		
		return passengerDao.getPassengerById(passId);
	}

	public List<PassengerInfo> getAllPassenger() {
	
		return passengerDao.getAllPassenger();
	}

}
