package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.dao.LocationDao;
import com.mphasis.griffin.entities.Location;
import com.mphasis.griffin.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationDao locationDao;

	public void setLocationDao(LocationDao locationDao) {
		this.locationDao = locationDao;
	}

	public void addLocation(Location location) throws BusinessException {
		System.out.println("Location values in service" + location.getLocName());
		locationDao.insertLocation(location);
	}

	public void removeLocation(String locId) throws BusinessException {
		locationDao.deleteLocation(locId);
	}

	public void modifyLocation(Location location) throws BusinessException {
		locationDao.updateLocation(location);
	}

	public Location getById(String locId) throws BusinessException {

		return locationDao.getById(locId);
	}

	public Location getByName(String locName) throws BusinessException {

		return locationDao.getByName(locName);
	}

	public List<Location> getAll() throws BusinessException {

		return locationDao.getAll();
	}

}
