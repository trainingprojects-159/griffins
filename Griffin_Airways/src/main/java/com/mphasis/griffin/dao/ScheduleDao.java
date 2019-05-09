package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.entities.Schedule;

public interface ScheduleDao {

	public void insertSchedule(Schedule schedule);

	public void deleteSchedule(int scheId);

	public void updateLocation(Schedule schedule);

	public Schedule getById(int scheId);
	
	public List<Schedule> getALl();
	
}
