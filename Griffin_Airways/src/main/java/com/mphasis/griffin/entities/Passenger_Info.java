package com.mphasis.griffin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger_Info {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int passId;
	private String pname;
	private String address;
	private String gender;
	private String dob;
	private String email;
	private long contact;
	private String nic;
	private String passport;
	private String scheId;
	public int getPassId() {
		return passId;
	}
	public void setPassId(int passId) {
		this.passId = passId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getScheId() {
		return scheId;
	}
	public void setScheId(String scheId) {
		this.scheId = scheId;
	}
	@Override
	public String toString() {
		return "Passenger_Info [passId=" + passId + ", pname=" + pname + ", address=" + address + ", gender=" + gender
				+ ", dob=" + dob + ", email=" + email + ", contact=" + contact + ", nic=" + nic + ", passport="
				+ passport + ", scheId=" + scheId + "]";
	}
	
	
}
