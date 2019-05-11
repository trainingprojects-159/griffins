package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.Location;

public interface LocationService {

	public void addLocation(Location location)throws BusinessException ;

	public void removeLocation(String locId) throws BusinessException;

	public void modifyLocation(Location location) throws BusinessException;

	public Location getById(String locId) throws BusinessException;
	
	public Location getByName(String locName) throws BusinessException;

	public List<Location> getAll() throws BusinessException;
}
