package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.PassengerInfo;

public interface PassengerDao {

	public void insertPassenger(PassengerInfo p) throws BusinessException;

	public void updatePassenger(PassengerInfo p) throws BusinessException;

	public void deletePassenger(String passId) throws BusinessException;

	public List<PassengerInfo> getAllPassenger() throws BusinessException;

	public PassengerInfo getPassengerById(String passId) throws BusinessException;

}
