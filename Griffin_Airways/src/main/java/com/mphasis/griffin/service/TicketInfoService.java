package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.TicketInfo;

public interface TicketInfoService {

public void addTicket(TicketInfo ticketInfo);
	
	public void removeTicket(String ticketId);
	
	public void modifyTicket(TicketInfo ticketInfo);
	
	public TicketInfo getById(String ticketId);
	
	public List<TicketInfo> getAll();
}
