package com.mphasis.griffin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int scheId;
	private String scheDate;
	@ManyToOne
	@JoinColumn(name = "flightId")
	private Flight flight;
	@ManyToOne
	@JoinColumn(name = "routeId")
	private Route route;

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public int getScheId() {
		return scheId;
	}

	public void setScheId(int scheId) {
		this.scheId = scheId;
	}



	public String getScheDate() {
		return scheDate;
	}

	public void setScheDate(String scheDate) {
		this.scheDate = scheDate;
	}

	@Override
	public String toString() {

		return "Schedule [scheId=" + scheId +  ", scheDate="

				+ scheDate + ", flight=" + flight + ", route=" + route + "]";
	}

}