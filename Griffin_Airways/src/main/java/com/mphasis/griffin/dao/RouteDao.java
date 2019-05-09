package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.entities.Route;



public interface RouteDao {
	public void insertRoute(Route route);
	  public void deleteRoute(String routeid);
	  public void updateRoute(Route route);
	  public Route getRouteById(String routeid);
	  public List<Route> getAll();
}
