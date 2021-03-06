package com.mphasis.griffin.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.dao.PassengerDao;
import com.mphasis.griffin.entities.PassengerInfo;

@Repository
public class PassengerDaoImpl implements PassengerDao {
	@Autowired
	SessionFactory sessionFactory;

	public void insertPassenger(PassengerInfo p) throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(p);
		tr.commit();

	}

	public void updatePassenger(PassengerInfo p) throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(p);
		tr.commit();

	}

	public void deletePassenger(String passId) throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		PassengerInfo p = (PassengerInfo) session.get(PassengerInfo.class, passId);
		session.delete(p);
		tr.commit();

	}

	public List<PassengerInfo> getAllPassenger() throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		List<PassengerInfo> passenger = session.createQuery("from PassengerInfo",PassengerInfo.class).list();
		tr.commit();
		return passenger;

	}

	public PassengerInfo getPassengerById(String passId) throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		PassengerInfo p = (PassengerInfo) session.get(PassengerInfo.class, passId);
		tr.commit();
		return p;

	}

}
