package com.mphasis.griffin.dao;

import java.util.List;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.entities.TicketInfo;

public interface TicketInfoDao {

	public TicketInfo insertTicket(TicketInfo ticketInfo) throws BusinessException;

	public void updateTicket(String ticketId) throws BusinessException;

	public TicketInfo getById(String ticketId) throws BusinessException;

	public List<TicketInfo> getAll() throws BusinessException;
}
