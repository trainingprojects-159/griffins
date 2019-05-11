package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.Schedule;

public interface ScheduleService {

	public void addSchedule(Schedule schedule) throws BusinessException;

	public void removeSchedule(String scheId) throws BusinessException;

	public void modifySchedule(Schedule schedule) throws BusinessException;

	public Schedule getById(String scheId) throws BusinessException;

	public List<Schedule> getAll() throws BusinessException;
}
