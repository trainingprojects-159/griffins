package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.dao.ScheduleDao;
import com.mphasis.griffin.entities.Schedule;
import com.mphasis.griffin.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	ScheduleDao scheduleDao;

	public void addSchedule(Schedule schedule) {

		scheduleDao.insertSchedule(schedule);
	}

	public void removeSchedule(int scheId) {

		scheduleDao.deleteSchedule(scheId);
	}

	public void modifySchedule(Schedule schedule) {

		scheduleDao.updateLocation(schedule);
	}

	public Schedule getById(int scheId) {

		return scheduleDao.getById(scheId);
	}

	public List<Schedule> getALl() {
		return scheduleDao.getALl();
	}
}
