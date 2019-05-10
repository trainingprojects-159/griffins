package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.entities.Location;

public interface LocationDao {

	public void insertLocation(Location location);

	public void deleteLocation(String locId);

	public void updateLocation(Location location);

	public Location getById(String locId);

	public Location getByName(String locName);

	public List<Location> getAll();

}
