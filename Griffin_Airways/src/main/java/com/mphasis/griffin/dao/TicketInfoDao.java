package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.entities.TicketInfo;

public interface TicketInfoDao {

	public TicketInfo insertTicket(TicketInfo ticketInfo);
	
	public void updateTicket(String ticketId);
	
	public TicketInfo getById(String ticketId);
	
	public List<TicketInfo> getAll();
}
