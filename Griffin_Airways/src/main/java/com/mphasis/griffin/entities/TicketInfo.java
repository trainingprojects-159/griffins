package com.mphasis.griffin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator;

/**
 * @author kuppani.dinesh
 *
 */



@Entity
public class TicketInfo {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ticket_seq")
@GenericGenerator(
		name = "ticket_seq",
		strategy = "com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator",
		parameters = {
				@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "4"),
				@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "TI"),
				@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d")})
 private String ticketId;
 private int paymentId;
 private String seatInfo;
 private String passId;
 private String scheId;
 private String status;
public String getTicketId() {
	return ticketId;
}
public void setTicketId(String ticketId) {
	this.ticketId = ticketId;
}
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public String getSeatInfo() {
	return seatInfo;
}
public void setSeatInfo(String seatInfo) {
	this.seatInfo = seatInfo;
}
public String getPassengerId() {
	return passId;
}
public void setPassengerId(String passengerId) {
	this.passId = passengerId;
}
public String getScheId() {
	return scheId;
}
public void setScheId(String scheId) {
	this.scheId = scheId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "TicketInfo [ticketId=" + ticketId + ", paymentId=" + paymentId + ", seatInfo=" + seatInfo + ", passengerId="
			+ passId + ", scheId=" + scheId + ", status=" + status + "]";
}

}
