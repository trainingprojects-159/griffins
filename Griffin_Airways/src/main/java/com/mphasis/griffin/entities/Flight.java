package com.mphasis.griffin.entities;

import java.util.List;

import javax.persistence.CascadeType;
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

@GeneratedValue(strategy=GenerationType.SEQUENCE)
 private int flightId;
 private String fname;
 private int reserveSeat;
 private int seatCap;
 @ManyToOne
 @JoinColumn(name = "routeId")
 private Route route;
 
 @OneToMany(mappedBy="flight",cascade=CascadeType.ALL)
 List<Schedule> schedule;
 


}
