package com.mphasis.griffin.entities;

import java.util.List;

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
	@OneToMany(mappedBy="route")
	List<Flight> flight;
	@OneToMany(mappedBy="schedule")
	List<Schedule> schedule;
	
	public List<Schedule> getSchedule() {
		return schedule;
	}
	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}
	public List<Flight> getFlight() {
		return flight;
	}
	public void setFlight(List<Flight> flight) {
		this.flight = flight;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", source=" + source + ", destination=" + destination + ", distance="
				+ distance + ", duration=" + duration + ", cost=" + cost + ", flight=" + flight + ", schedule="
				+ schedule + "]";
	}
	
	}