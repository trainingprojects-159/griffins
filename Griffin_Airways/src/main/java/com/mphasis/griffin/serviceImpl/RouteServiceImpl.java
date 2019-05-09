package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.dao.RouteDao;
import com.mphasis.griffin.entities.Route;
import com.mphasis.griffin.service.RouteService;
@Service
public class RouteServiceImpl implements RouteService {
@Autowired
    RouteDao routeDao;

	public void setRouteDao(RouteDao routeDao) {
	this.routeDao = routeDao;
}

	public void addRoute(Route route) {
		routeDao.insertRoute(route);

	}

	public void removeRoute(int routeid) {
		routeDao.deleteRoute(routeid);

	}

	public void editRoute(Route route) {
	    routeDao.updateRoute(route);

	}

	public Route getByIdRoute(int routeid) {
		
		return routeDao.getRouteById(routeid);
	}

	public List<Route> getAll() {
		
		return routeDao.getAll();
	}

}
