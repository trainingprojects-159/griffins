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
import org.hibernate.annotations.*;

import org.hibernate.annotations.GenericGenerator;

import com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flight_seq")
	@GenericGenerator(
			name = "flight_seq",
			strategy = "com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator",
			parameters = {
					@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "4"),
					@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "FI"),
					@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d")})
	private String flightId;
	private String fname;
	private int reserveSeat;
	private int seatCap;
	
	@ManyToOne
	@JoinColumn(name = "routeId")
	private Route route;
	
	@OneToMany(mappedBy = "flight",fetch=FetchType.LAZY)
	private List<Schedule> schedule;
	
	@ManyToOne
	private Admin admin;

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getReserveSeat() {
		return reserveSeat;
	}

	public void setReserveSeat(int reserveSeat) {
		this.reserveSeat = reserveSeat;
	}

	public int getSeatCap() {
		return seatCap;
	}

	public void setSeatCap(int seatCap) {
		this.seatCap = seatCap;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
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

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", fname=" + fname + ", reserveSeat=" + reserveSeat + ", seatCap="
				+ seatCap + ", route=" + route + ", schedule=" + schedule + ", admin=" + admin + "]";
	}

}