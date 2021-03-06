package com.mphasis.griffin.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.dao.FlightDao;
import com.mphasis.griffin.entities.Flight;




@Repository
public class FlightDaoImpl implements FlightDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void insertFlight(Flight flight) throws BusinessException {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		System.out.println(flight.getFname()+"flight values in dao");
		session.save(flight);
		tr.commit();

	}

	public void deleteFlight(String flightid) throws BusinessException {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Flight f=(Flight)session.get(Flight.class,flightid);
		
		session.delete(f);
		tr.commit();

	}

	public void updateFlight(Flight flight) throws BusinessException {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(flight);
		tr.commit();

	}

	public Flight getFlightById(String flightid) throws BusinessException{
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Flight f=(Flight)session.get(Flight.class, flightid);	
		session.update(f);
		tr.commit();
		return f;
	}

	public List<Flight> getAll() throws BusinessException{
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		List<Flight> flight=session.createQuery("from Flight",Flight.class).list();
		tr.commit();
		return flight;
	}

}
