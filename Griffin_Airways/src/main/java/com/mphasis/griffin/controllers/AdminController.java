package com.mphasis.griffin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.Admin;
import com.mphasis.griffin.entities.Flight;
import com.mphasis.griffin.entities.Location;
import com.mphasis.griffin.entities.Route;
import com.mphasis.griffin.entities.Schedule;
import com.mphasis.griffin.service.AdminService;
import com.mphasis.griffin.service.FlightService;
import com.mphasis.griffin.service.LocationService;
import com.mphasis.griffin.service.RouteService;
import com.mphasis.griffin.service.ScheduleService;
import com.mphasis.griffin.service.TicketInfoService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	@Autowired
	FlightService flightService;

	@Autowired
	RouteService routeService;

	@Autowired
	LocationService locationService;

	@Autowired
	ScheduleService scheduleService;
    
	@Autowired
	TicketInfoService ticketInfoService;
	
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}

	public void setRouteService(RouteService routeService) {
		this.routeService = routeService;
	}

	public void setLocationService(LocationService locationService) {
		this.locationService = locationService;
	}

	public void setScheduleService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}

	// ---------Admin-----------------//

	@RequestMapping(value = "/login/{userId}/{password}", method = RequestMethod.GET)
	public Admin login(@PathVariable("userId") String userId, @PathVariable("password") String password) throws BusinessException {
		Admin admin = adminService.login(userId, password);
		return admin;
	}

	// ---------Flight-----------------//

	@RequestMapping(value = "/flights", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Flight> listFlights() throws BusinessException {

		return flightService.getAll();
	}
	

	@RequestMapping(value = "/flight/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addFlight(@RequestBody Flight f) throws BusinessException {

		this.flightService.addFlight(f);
	}

	@RequestMapping(value = "/remove/{flightid}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void removeFlight(@PathVariable("flightid") String flightid) throws BusinessException {

		this.flightService.removeFlight(flightid);
	}

	@RequestMapping(value = "/flight/{flightid}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void editFlight(@PathVariable("flightid") String flightid, @RequestBody Flight f) throws BusinessException {
		this.flightService.editFlight(f);

	}

	@RequestMapping(value = "/flight/{flightId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Flight getFlightByID(@PathVariable("flightId") String flightId) throws BusinessException {
		return this.flightService.getByIdFlight(flightId);
	}

	// ---------Route-----------------//

	@RequestMapping(value = "/routes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Route> listRoutes() throws BusinessException {

		return routeService.getAll();
	}

	@RequestMapping(value = "/route/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addRoute(@RequestBody Route r) throws BusinessException {

		this.routeService.addRoute(r);
	}

	@RequestMapping(value = "/remove/{routeid}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void removeRoute(@PathVariable("routeid") String routeid) throws BusinessException {

		this.routeService.removeRoute(routeid);
	}

	@RequestMapping(value = "/route/{routeid}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void editRoute(@PathVariable("routeid") String routeid, @RequestBody Route r) throws BusinessException {
		this.routeService.editRoute(r);

	}

	@RequestMapping(value = "/route/{routeid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Route getRouteByID(@PathVariable("routeid") String routeid) throws BusinessException {
		return this.routeService.getByIdRoute(routeid);
	}

	// ---------Location-----------------//

	@RequestMapping(value = "/locations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Location> listLocations() throws BusinessException {
		return locationService.getAll();
	}

	@RequestMapping(value = "/location/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addLocation(@RequestBody Location loc) throws BusinessException {

		this.locationService.addLocation(loc);
	}

	@RequestMapping(value = "/remove/{locId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void removeLocation(@PathVariable("locId") String locId) throws BusinessException {

		this.locationService.removeLocation(locId);
	}

	@RequestMapping(value = "/location/{locID}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void editLocation(@PathVariable("locID") String locId, @RequestBody Location loc) throws BusinessException {
		this.locationService.modifyLocation(loc);
	}

	@RequestMapping(value = "/location/{locID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Location getLocationById(@PathVariable("locId") String locId) throws BusinessException {
		return this.locationService.getById(locId);
	}

	@RequestMapping(value = "/location/{locName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Location getLocationByName(@PathVariable("locName") String locName) throws BusinessException {
		return this.locationService.getByName(locName);
	}

	// ---------Schedule-----------------//

	@RequestMapping(value = "/schedules", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Schedule> listschedules() throws BusinessException {
		return scheduleService.getAll();
	}

	@RequestMapping(value = "schedule/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addSchedule(@RequestBody Schedule sche) throws BusinessException {
		this.scheduleService.addSchedule(sche);
	}

	@RequestMapping(value = "/schedule/{scheId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void removeSchedule(@PathVariable("scheId") String scheId) throws BusinessException {
		this.scheduleService.removeSchedule(scheId);
	}

	@RequestMapping(value = "/schedule/{scheId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void editSchedule(@PathVariable("scheId") String scheId, @RequestBody Schedule sche) throws BusinessException {
		this.scheduleService.modifySchedule(sche);
	}

	@RequestMapping(value = "/schedule/{scheId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Schedule getScheduleById(@PathVariable("scheId") String scheId) throws BusinessException {
		return this.scheduleService.getById(scheId);
	}
	
	// ---------TiccketInfo-----------------//
	
	@RequestMapping(value = "/ticketInfo/{ticketId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public void cancelTicket(String ticketId) throws BusinessException {
		this.ticketInfoService.modifyTicket(ticketId);
	}

}