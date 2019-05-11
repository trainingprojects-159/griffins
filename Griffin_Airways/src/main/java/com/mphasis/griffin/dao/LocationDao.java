package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.Location;

public interface LocationDao  {

	public void insertLocation(Location location) throws BusinessException;

	public void deleteLocation(String locId) throws BusinessException;

	public void updateLocation(Location location) throws BusinessException;

	public Location getById(String locId) throws BusinessException;

	public Location getByName(String locName) throws BusinessException;

	public List<Location> getAll() throws BusinessException;

}
