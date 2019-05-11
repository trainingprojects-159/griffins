package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.PassengerInfo;

public interface PassengerService {
	public void addPassenger(PassengerInfo passenger) throws BusinessException;

	public void updatePassenger(PassengerInfo passenger) throws BusinessException;

	public void removePassenger(String passId) throws BusinessException;

	public PassengerInfo getPassengerById(String passId) throws BusinessException;

	public List<PassengerInfo> getAllPassenger() throws BusinessException;

}
