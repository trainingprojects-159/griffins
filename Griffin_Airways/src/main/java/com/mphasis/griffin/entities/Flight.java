package com.mphasis.griffin.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flight_seq")
	private String flightId;
	private String fname;
	private int reserveSeat;
	private int seatCap;
	@ManyToOne
	@JoinColumn(name = "routeId")
	private Route route;
	@OneToMany(mappedBy = "flight")
	private List<Schedule> schedule;
<<<<<<< HEAD

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

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




	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", fname=" + fname + ", reserveSeat=" + reserveSeat + ", seatCap="
				+ seatCap + ", route=" + route + ", schedule=" + schedule + "]";
	}

}

