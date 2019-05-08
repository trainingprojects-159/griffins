package com.mphasis.griffin.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Flight {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
 private int flightId;
 private String fname;
 private int reserveSeat;
 private int seatCap;
 @ManyToOne
 private Route route;
 @OneToMany(mappedBy="flight")
 private List<Schedule> schedule; 
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
public int getFlightId() {
	return flightId;
}
public void setFlightId(int flightId) {
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
	return "Flight [flightId=" + flightId + ", fname=" + fname + ", reserveSeat=" + reserveSeat + ", seatCap=" + seatCap
			+ ", route=" + route + ", schedule=" + schedule + "]";
}

}


