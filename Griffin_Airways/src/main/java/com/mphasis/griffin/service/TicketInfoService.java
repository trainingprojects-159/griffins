package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.TicketInfo;

public interface TicketInfoService {

public void addTicket(TicketInfo ticketInfo);
		
	public void modifyTicket(String ticketInfo);
	
	public TicketInfo getById(String ticketId);
	
	public List<TicketInfo> getAll();
}
