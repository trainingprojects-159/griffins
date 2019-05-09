package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.Schedule;

public interface ScheduleService {

	public void addSchedule(Schedule schedule);

	public void removeSchedule(int scheId);

	public void modifySchedule(Schedule schedule);

	public Schedule getById(int scheId);
	
	public List<Schedule> getALl();
}
