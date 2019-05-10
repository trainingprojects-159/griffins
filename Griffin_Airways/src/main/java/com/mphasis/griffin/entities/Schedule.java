package com.mphasis.griffin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator;

@Entity
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sche_seq")
	@GenericGenerator(name = "sche_seq", strategy = "com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "4"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "SI"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	private String scheId;
	private String scheDate;

	@ManyToOne
	@JoinColumn(name = "flightId")
	private Flight flight;

	@ManyToOne
	@JoinColumn(name = "routeId")
	private Route route;

	@ManyToOne
	private Admin admin;

	public String getScheId() {
		return scheId;
	}

	public void setScheId(String scheId) {
		this.scheId = scheId;
	}

	public String getScheDate() {
		return scheDate;
	}

	public void setScheDate(String scheDate) {
		this.scheDate = scheDate;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Schedule [scheId=" + scheId + ", scheDate=" + scheDate + ", flight=" + flight + ", route=" + route
				+ ", admin=" + admin + "]";
	}

}