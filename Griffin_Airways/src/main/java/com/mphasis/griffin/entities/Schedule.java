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
	
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public int getScheId() {
		return scheId;
	}
	public void setScheId(int scheId) {
		this.scheId = scheId;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getRouteId() {
		return routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	public String getScheDate() {
		return scheDate;
	}
	public void setScheDate(String scheDate) {
		this.scheDate = scheDate;
	}
	@Override
	public String toString() {
		return "Schedule [scheId=" + scheId + ", flightId=" + flightId + ", routeId=" + routeId + ", scheDate="
				+ scheDate + "]";
	}
	
}
