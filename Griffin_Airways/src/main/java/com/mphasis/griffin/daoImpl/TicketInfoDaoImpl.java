package com.mphasis.griffin.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.dao.TicketInfoDao;
import com.mphasis.griffin.entities.TicketInfo;

@Repository
public class TicketInfoDaoImpl implements TicketInfoDao {

	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public TicketInfo insertTicket(TicketInfo ticketInfo) throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ticketInfo);
		transaction.commit();
		return ticketInfo;
	}


	public void updateTicket(String ticketId) throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		TicketInfo ticketid = session.get(TicketInfo.class, ticketId);
		ticketid.setStatus("canceled");
		session.update(ticketid);
		tr.commit();
	}

	public TicketInfo getById(String ticketId) throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		TicketInfo ticInfo = (TicketInfo) session.get(TicketInfo.class, ticketId);
		session.update(ticInfo);
		tr.commit();
		return ticInfo;
	}

	public List<TicketInfo> getAll() throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		List<TicketInfo> ticInfo = session.createQuery("TicketInfo",TicketInfo.class).list();
		tr.commit();
		return ticInfo;
	}

	

}
