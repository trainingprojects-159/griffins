package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.Location;

public interface LocationService {

	public void addLocation(Location location);

	public void removeLocation(int locId);

	public void modifyLocation(Location location);

	public Location getById(int locId);
	
	public Location getByName(String locName);

	public List<Location> getAll();
}
