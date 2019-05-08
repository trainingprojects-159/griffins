package com.mphasis.griffin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int locId;
private String locName;
public int getLocId() {
	return locId;
}
public void setLocId(int locId) {
	this.locId = locId;
}
public String getLocName() {
	return locName;
}
public void setLocName(String locName) {
	this.locName = locName;
}
@Override
public String toString() {
	return "Location [locId=" + locId + ", locName=" + locName + "]";
}


}
