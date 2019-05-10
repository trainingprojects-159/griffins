package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.dao.TicketInfoDao;
import com.mphasis.griffin.entities.TicketInfo;
import com.mphasis.griffin.service.TicketInfoService;

@Service
public class TicketInfoServiceImpl implements TicketInfoService {

	@Autowired
	TicketInfoDao ticketInfoDao;
	
	
	public void setTicketInfoDao(TicketInfoDao ticketInfoDao) {
		this.ticketInfoDao = ticketInfoDao;
	}

	public void addTicket(TicketInfo ticketInfo) {
		// TODO Auto-generated method stub

	}

	public void removeTicket(String ticketId) {
		// TODO Auto-generated method stub

	}

	public void modifyTicket(TicketInfo ticketInfo) {
		// TODO Auto-generated method stub

	}

	public TicketInfo getById(String ticketId) {
		return null;
	}

	public List<TicketInfo> getAll() {
		return null;
	}

}
