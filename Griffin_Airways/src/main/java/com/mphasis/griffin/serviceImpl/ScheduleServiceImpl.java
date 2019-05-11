package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.dao.ScheduleDao;
import com.mphasis.griffin.entities.Schedule;
import com.mphasis.griffin.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	ScheduleDao scheduleDao;

	public void addSchedule(Schedule schedule) throws BusinessException {

		scheduleDao.insertSchedule(schedule);
	}

	public void removeSchedule(String scheId) throws BusinessException {

		scheduleDao.deleteSchedule(scheId);
	}

	public void modifySchedule(Schedule schedule) throws BusinessException {

		scheduleDao.updateLocation(schedule);
	}

	public Schedule getById(String scheId) throws BusinessException {

		return scheduleDao.getById(scheId);
	}

	public List<Schedule> getAll() throws BusinessException {
		return scheduleDao.getAll();
	}
}
