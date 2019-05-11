package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.Schedule;

public interface ScheduleDao {

	public void insertSchedule(Schedule schedule) throws BusinessException;

	public void deleteSchedule(String scheId) throws BusinessException;

	public void updateLocation(Schedule schedule) throws BusinessException;

	public Schedule getById(String scheId) throws BusinessException;
	
	public List<Schedule> getAll() throws BusinessException;
	
}
