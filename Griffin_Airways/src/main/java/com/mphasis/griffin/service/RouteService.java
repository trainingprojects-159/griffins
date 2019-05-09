package com.mphasis.griffin.service;

import java.util.List;


import com.mphasis.griffin.entities.Route;

public interface RouteService {
	public void addRoute(Route route);
	 public void removeRoute(String routeid);
	 public void editRoute(Route route);
	 public Route getByIdRoute(String routeid);
	 public List<Route> getAll();
}
