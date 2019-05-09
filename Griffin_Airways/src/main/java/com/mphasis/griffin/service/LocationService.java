package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.Location;

public interface LocationService {

	public void addLocation(Location location);

	public void removeLocation(String locId);

	public void modifyLocation(Location location);

	public Location getById(String locId);
	
	public Location getByName(String locName);

	public List<Location> getAll();
}
