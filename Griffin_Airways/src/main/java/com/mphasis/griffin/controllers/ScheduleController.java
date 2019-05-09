package com.mphasis.griffin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.griffin.entities.Schedule;
import com.mphasis.griffin.service.ScheduleService;

@RestController
public class ScheduleController {

	@Autowired
	ScheduleService scheduleService;

	public void setScheduleService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}

	@RequestMapping(value = "/schedules", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Schedule> listschedules() {
		return scheduleService.getAll();
	}
	

	@RequestMapping(value = "schedule/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addSchedule(@RequestBody Schedule sche) {
		this.scheduleService.addSchedule(sche);
	}
	

	@RequestMapping(value = "/schedule/{scheId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void removeSchedule(@PathVariable("scheId") String scheId) {
		this.scheduleService.removeSchedule(scheId);
	}
	

	@RequestMapping(value = "/schedule/{scheId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void editSchedule(@PathVariable("scheId") String scheId, @RequestBody Schedule sche) {
		this.scheduleService.modifySchedule(sche);
	}
	

	@RequestMapping(value = "/schedule/{scheId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Schedule getScheduleById(@PathVariable("scheId") String scheId) {
		return this.scheduleService.getById(scheId);
	}
	

}
