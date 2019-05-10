package com.mphasis.griffin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator;

@Entity
public class PassengerInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "pass_seq")
	@GenericGenerator(
			name = "pass_seq",
			strategy = "com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator",
			parameters = {
					@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "4"),
					@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "PI"),
					@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d")})
	private String passId;
	private String pname;
	private String address;
	private String gender;
	private String dob;
	private String email;
	private long contact;
	private String nic;
	private String passport;
	
	@OneToOne
	@JoinColumn(name="scheduleId")
	private Schedule scheId;
	
	public String getPassId() {
		return passId;
	}
	public void setPassId(String passId) {
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
	public Schedule getScheId() {
		return scheId;
	}
	public void setScheId(Schedule scheId) {
		this.scheId = scheId;
	}
	@Override
	public String toString() {
		return "Passenger_Info [passId=" + passId + ", pname=" + pname + ", address=" + address + ", gender=" + gender
				+ ", dob=" + dob + ", email=" + email + ", contact=" + contact + ", nic=" + nic + ", passport="
				+ passport + ", scheId=" + scheId + "]";
	}
	
	
}
