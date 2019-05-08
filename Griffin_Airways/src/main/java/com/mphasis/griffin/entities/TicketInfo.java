package com.mphasis.griffin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author kuppani.dinesh
 *
 */
@Entity
public class TicketInfo {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
 private int ticketId;
 private int paymentId;
 private int seatInfo;
 private String passengerId;
 private String scheId;
 private String status;
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public int getSeatInfo() {
	return seatInfo;
}
public void setSeatInfo(int seatInfo) {
	this.seatInfo = seatInfo;
}
public String getPassengerId() {
	return passengerId;
}
public void setPassengerId(String passengerId) {
	this.passengerId = passengerId;
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
			+ passengerId + ", scheId=" + scheId + ", status=" + status + "]";
}

}
