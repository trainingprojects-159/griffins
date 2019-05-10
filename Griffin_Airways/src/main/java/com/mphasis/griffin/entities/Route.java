package com.mphasis.griffin.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator;

@Entity
public class Route {
	@Id

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loc_seq")
	@GenericGenerator(name = "loc_seq", strategy = "com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "4"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "RO"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	private String routeId;

	@ManyToOne
	@JoinColumn(name = "sourceId")
	private Location source;

	@ManyToOne
	@JoinColumn(name = "destinationId")
	private Location destination;

	private int distance;
	private int duration;
	private int cost;

	@OneToMany(mappedBy = "route", fetch = FetchType.LAZY)
	private List<Flight> flight;
	
	@OneToMany(mappedBy = "schedule")
	private List<Schedule> schedule;

	@ManyToOne
	private Admin admin;
	
	@OneToOne
	@JoinColumn(name="locId")
	private Location location;

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public Location getSource() {
		return source;
	}

	public void setSource(Location source) {
		this.source = source;
	}

	public Location getDestination() {
		return destination;
	}

	public void setDestination(Location destination) {
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

	public List<Flight> getFlight() {
		return flight;
	}

	public void setFlight(List<Flight> flight) {
		this.flight = flight;
	}

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", source=" + source + ", destination=" + destination + ", distance="
				+ distance + ", duration=" + duration + ", cost=" + cost + ", flight=" + flight + ", schedule="
				+ schedule + ", admin=" + admin + ", location=" + location + "]";
	}

	
}