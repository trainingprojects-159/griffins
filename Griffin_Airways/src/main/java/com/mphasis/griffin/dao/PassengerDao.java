package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.entities.PassengerInfo;

public interface PassengerDao {

	public void insertPassenger(PassengerInfo p);
	public void updatePassenger(PassengerInfo p);
	public void deletePassenger(String passId);
	public List<PassengerInfo> getAllPassenger();
	public PassengerInfo getPassengerById(String passId);
	

}
