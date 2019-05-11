package com.mphasis.griffin.service;

import java.util.List;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.TicketInfo;

public interface TicketInfoService {

	public TicketInfo addTicket(TicketInfo ticketInfo) throws BusinessException;

	public void modifyTicket(String ticketId) throws BusinessException;

	public TicketInfo getById(String ticketId) throws BusinessException;

	public List<TicketInfo> getAll() throws BusinessException;
}
