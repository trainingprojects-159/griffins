package com.mphasis.griffin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator;

@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loc_seq")
	@GenericGenerator(name = "loc_seq", strategy = "com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "4"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "LO"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	private String locId;
	private String locName;

	@ManyToOne
	private Admin admin;

	/*@OneToOne
	private Route route;*/

	public String getLocId() {
		return locId;
	}

	public void setLocId(String locId) {
		this.locId = locId;
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locName=" + locName + ", admin=" + admin + "]";
	}

	/*public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}*/

	

}
