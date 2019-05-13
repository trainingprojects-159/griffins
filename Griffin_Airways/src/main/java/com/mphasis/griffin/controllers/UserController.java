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

import com.mphasis.griffin.entities.Customers;
import com.mphasis.griffin.entities.Flight;
import com.mphasis.griffin.entities.PassengerInfo;
import com.mphasis.griffin.entities.Schedule;
import com.mphasis.griffin.entities.TicketInfo;
import com.mphasis.griffin.service.CustomerService;
import com.mphasis.griffin.service.FlightService;
import com.mphasis.griffin.service.PassengerService;
import com.mphasis.griffin.service.ScheduleService;
import com.mphasis.griffin.service.TicketInfoService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	CustomerService customerService;

	@Autowired
	PassengerService passengerService;

	@Autowired
	ScheduleService scheduleService;

	@Autowired
	TicketInfoService ticketInfoService;

	@Autowired
	FlightService flightService;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public void setPassengerService(PassengerService passengerService) {
		this.passengerService = passengerService;
	}

	public void setScheduleService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}

	public void setTicketInfoService(TicketInfoService ticketInfoService) {
		this.ticketInfoService = ticketInfoService;
	}

	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}
	
	// ---------Customer-----------------//

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void register(@RequestBody Customers customers) throws BusinessException {
		this.customerService.register(customers);
	}

	@RequestMapping(value = "/signIn/{email}/{password}", method = RequestMethod.GET)
	public Customers signin(@PathVariable("email") String email, @PathVariable("password") String password)
			throws BusinessException {
		if(email!=null && password!=null) {
		Customers customer = customerService.signIn(email, password);	
		return customer;
		}
		else {
	 throw new BusinessException("Invalid Details");
	}
	}

	@RequestMapping(value = "/getFlightDetails/{source}/{destination}/(scheduleDate}", method = RequestMethod.GET)
	public List<Flight> getFlightDetails(@PathVariable("source") String source,
			@PathVariable("destination") String destination, @PathVariable("scheduleDate") String scheduleDate)
			throws BusinessException {
		return this.customerService.retriveFlightDetails(source, destination, scheduleDate);
	}

	// ---------Passenger-----------------//

	@RequestMapping(value = "/passengers", method = RequestMethod.GET)
	public List<PassengerInfo> listPassenger() throws BusinessException {
		System.out.println("Passengers");

		return passengerService.getAllPassenger();
	}

	@RequestMapping(value = "/passenger/add", method = RequestMethod.POST)
	public void addPassenger(@RequestBody PassengerInfo p) throws BusinessException {
		this.passengerService.addPassenger(p);
	}

	@RequestMapping(value = "/passenger/{passId}", method = RequestMethod.DELETE)
	public void removePassenger(@PathVariable("passId") String passId) throws BusinessException {
		this.passengerService.removePassenger(passId);

	}

	@RequestMapping(value = "/passenger/{passId}", method = RequestMethod.PUT)
	public void editPassenger(@PathVariable("passId") String passId, @RequestBody PassengerInfo p)
			throws BusinessException {
		this.passengerService.updatePassenger(p);
	}

	@RequestMapping(value = "/passenger/{passId}", method = RequestMethod.GET)
	public PassengerInfo getPassengerById(@PathVariable("passId") String passId) throws BusinessException {
		return this.passengerService.getPassengerById(passId);
	}

	// ---------Schedule-----------------//

	@RequestMapping(value = "/schedules", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Schedule> listschedules() throws BusinessException {
		return scheduleService.getAll();
	}

	@RequestMapping(value = "/schedule/{scheId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Schedule getScheduleById(@PathVariable("scheId") String scheId) throws BusinessException {
		return this.scheduleService.getById(scheId);
	}

	// ---------TicketInfo-----------------//

	@RequestMapping(value = "/ticketInfo/add", method = RequestMethod.POST)
	public TicketInfo bookTicket(TicketInfo ticketInfo) throws BusinessException {
		return this.ticketInfoService.addTicket(ticketInfo);
	}

	@RequestMapping(value = "/ticketInfo/{ticketId}", method = RequestMethod.POST)
	public void cancelTicket(String ticketId) throws BusinessException {
		this.ticketInfoService.modifyTicket(ticketId);
	}

	@RequestMapping(value = "/ticketInfo/{ticketId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public TicketInfo getTicketById(@PathVariable("ticketId") String ticketId) throws BusinessException {
		return this.ticketInfoService.getById(ticketId);
	}

	@RequestMapping(value = "/ticketInfos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TicketInfo> listTicketInfo() throws BusinessException {
		return ticketInfoService.getAll();
	}

	// ---------Flight-----------------//

	@RequestMapping(value = "/flight/{flightid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Flight getFlightById(@PathVariable("flightid") String flightid) throws BusinessException {
		return this.flightService.getByIdFlight(flightid);
	}

	@RequestMapping(value = "/flights", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Flight> listFlight() throws BusinessException {
		return flightService.getAll();
	}

}
