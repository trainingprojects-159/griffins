package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.Schedule;

public interface ScheduleService {

	public void addSchedule(Schedule schedule);

	public void removeSchedule(String scheId);

	public void modifySchedule(Schedule schedule);

	public Schedule getById(String scheId);
	
	public List<Schedule> getAll();
}
