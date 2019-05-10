package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.entities.TicketInfo;

public interface TicketInfoDao {

	public void insertTicket(TicketInfo ticketInfo);
	
	public void deleteTicket(String ticketId);
	
	public void updateTicket(TicketInfo ticketInfo);
	
	public TicketInfo getById(String ticketId);
	
	public List<TicketInfo> getAll();
}
