package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.PassengerInfo;



public interface PassengerService {
	public void addPassenger(PassengerInfo passenger);
	public void updatePassenger(PassengerInfo passenger);
	public void removePassenger(int passId);
	public PassengerInfo getPassengerById(int passId);
	public List<PassengerInfo> getAllPassenger();


}
