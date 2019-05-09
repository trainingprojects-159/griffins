package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.PassengerInfo;



public interface PassengerService {
	public void addPassenger(PassengerInfo passenger);
	public void updatePassenger(PassengerInfo passenger);
	public void removePassenger(String passId);
	public PassengerInfo getPassengerById(String passId);
	public List<PassengerInfo> getAllPassenger();


}
