package com.mphasis.griffin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mphasis.griffin.entities.Route;
import com.mphasis.griffin.service.RouteService;

@RestController
public class RouteController {
 @Autowired
  RouteService routeService;

public void setRouteService(RouteService routeService) {
	this.routeService = routeService;
}
@RequestMapping(value="/routes",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
public List<Route> listRoutes() {
	 
return routeService.getAll();
}
@RequestMapping(value="/route/add",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
public void addRoute(@RequestBody Route r) {
	
		this.routeService.addRoute(r);
	}
@RequestMapping(value="/remove/{routeid}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
public void removeRoute(@PathVariable("routeid")int routeid) {
	
	
	this.routeService.removeRoute(routeid);
	}
@RequestMapping(value="/route/{routeid}",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
public void editRoute(@PathVariable("routeid")int routeid,@RequestBody Route r) {
	this.routeService.editRoute(r);
	
	
}
@RequestMapping(value="/route/{routeid}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
public Route getRouteByID(@PathVariable("routeid")int routeid) {
	return this.routeService.getByIdRoute(routeid);
}
}
