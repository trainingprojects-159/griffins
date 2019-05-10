package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.entities.TicketInfo;

public interface TicketInfoService {

	public TicketInfo addTicket(TicketInfo ticketInfo);

	public void modifyTicket(String ticketId);

	public TicketInfo getById(String ticketId);

	public List<TicketInfo> getAll();
}
