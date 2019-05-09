package com.mphasis.griffin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.griffin.entities.Flight;
import com.mphasis.griffin.entities.Location;
import com.mphasis.griffin.entities.Route;
import com.mphasis.griffin.service.FlightService;
import com.mphasis.griffin.service.LocationService;
import com.mphasis.griffin.service.RouteService;

@RestController
public class AdminController {
	 @Autowired
	 FlightService flightService;

	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}
	@RequestMapping(value="/flights",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Flight> listFlights() {
	 
	return flightService.getAll();
	}
	@RequestMapping(value="/flight/add",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void addFlight(@RequestBody Flight c) {
		
			this.flightService.addFlight(c);
		}
	@RequestMapping(value="/remove/{flightid}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void removeFlight(@PathVariable("flightid")String flightid) {
		
		
		this.flightService.removeFlight(flightid);
		}
	@RequestMapping(value="/car/{flightid}",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public void editFlight(@PathVariable("flightid")String flightid,@RequestBody Flight f) {
		this.flightService.editFlight(f);
		
		
	}
	@RequestMapping(value="/car/{flightId}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Flight getFlightByID(@PathVariable("flightId")String flightId) {
		return this.flightService.getByIdFlight(flightId);
	}
	@Autowired
	  RouteService routeService;

	public void setRouteService(RouteService routeService) {
		this.routeService = routeService;
	}
	@RequestMapping(value="/routes",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Route> listRoutes() {
		 
	return routeService.getAll();
	}
	@RequestMapping(value="/route/add",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void addRoute(@RequestBody Route r) {
		
			this.routeService.addRoute(r);
		}
	@RequestMapping(value="/remove/{routeid}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void removeRoute(@PathVariable("routeid")String routeid) {
		
		
		this.routeService.removeRoute(routeid);
		}
	@RequestMapping(value="/route/{routeid}",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public void editRoute(@PathVariable("routeid")String routeid,@RequestBody Route r) {
		this.routeService.editRoute(r);
		
		
	}
	@RequestMapping(value="/route/{routeid}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Route getRouteByID(@PathVariable("routeid")String routeid) {
		return this.routeService.getByIdRoute(routeid);
	}
	@Autowired
	LocationService locationService;

	public void setLocationService(LocationService locationService) {
		this.locationService = locationService;
	}

	@RequestMapping(value = "/locations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Location> listLocations() {
		return locationService.getAll();
	}

	@RequestMapping(value = "/location/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addLocation(@RequestBody Location loc) {

		this.locationService.addLocation(loc);
	}

	@RequestMapping(value = "/remove/{locId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void removeLocation(@PathVariable("locId") String locId) {

		this.locationService.removeLocation(locId);
		;
	}

	@RequestMapping(value = "/location/{locID}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void editLocation(@PathVariable("locID") String locId, @RequestBody Location loc) {
		this.locationService.modifyLocation(loc);
	}

	@RequestMapping(value = "/location/{locID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Location getLocationById(@PathVariable("locId") String locId) {
		return this.locationService.getById(locId);
	}

	@RequestMapping(value = "/location/{locName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Location getLocationByName(@PathVariable("locName") String locName) {
		return this.locationService.getByName(locName);
	}

}
