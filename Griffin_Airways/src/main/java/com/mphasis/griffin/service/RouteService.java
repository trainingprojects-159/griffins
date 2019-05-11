package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.customexceptions.BuissnessException;
import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.Route;

public interface RouteService {
	public void addRoute(Route route) throws BusinessException;

	public void removeRoute(String routeid) throws BusinessException;

	public void editRoute(Route route) throws BusinessException;

	public Route getByIdRoute(String routeid) throws BusinessException;

	public List<Route> getAll() throws BusinessException;
}
