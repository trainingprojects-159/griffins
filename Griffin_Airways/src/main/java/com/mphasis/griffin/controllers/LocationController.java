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
import com.mphasis.griffin.service.LocationService;

@RestController
public class LocationController {

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
