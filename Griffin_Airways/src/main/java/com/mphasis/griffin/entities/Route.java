package com.mphasis.griffin.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Route {
	@Id

	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int routeId;
	private String source;
	private String destination;
	private int distance;
	private int duration;
	private int cost;
	@OneToMany(mappedBy="route",cascade=CascadeType.ALL)
	
	List<Schedule> schedule;
	
	@OneToMany(mappedBy="route",cascade=CascadeType.ALL)
	 List<Flight> flight;
	
	
	

	
	
	
	
	
}
