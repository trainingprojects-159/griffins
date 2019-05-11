package com.mphasis.griffin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.griffin.customexceptions.BusinessException;
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

	public TicketInfo addTicket(TicketInfo ticketInfo) throws BusinessException {
		return ticketInfoDao.insertTicket(ticketInfo);
	}

	public void modifyTicket(String ticketId) throws BusinessException {
		ticketInfoDao.updateTicket(ticketId);
	}

	public TicketInfo getById(String ticketId) throws BusinessException {
		return ticketInfoDao.getById(ticketId);
	}

	public List<TicketInfo> getAll() throws BusinessException {
		return ticketInfoDao.getAll();
	}

}
