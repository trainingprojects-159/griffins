package com.mphasis.griffin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Schedule {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int scheId;
	private String flightId;
	private String routeId;
	private String scheDate;
	@ManyToOne
	private Flight flight;
	@ManyToOne
	private Route route;
	
	
}
