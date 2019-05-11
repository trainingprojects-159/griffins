package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.Route;

public interface RouteDao {

	public void insertRoute(Route route)  throws BusinessException;

	public void deleteRoute(String routeid) throws BusinessException;

	public void updateRoute(Route route) throws BusinessException;

	public Route getRouteById(String routeid) throws BusinessException;

	public List<Route> getAll() throws BusinessException;
}
