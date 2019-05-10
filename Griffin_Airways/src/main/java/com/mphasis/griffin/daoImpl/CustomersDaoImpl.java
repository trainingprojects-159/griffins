package com.mphasis.griffin.daoImpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.dao.CustomersDao;
import com.mphasis.griffin.entities.Customers;
import com.mphasis.griffin.entities.Flight;
import com.mphasis.griffin.entities.Location;
import com.mphasis.griffin.entities.Route;
import com.mphasis.griffin.entities.Schedule;

@Repository
public class CustomersDaoImpl implements CustomersDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void register(Customers customers) {
		Session session=sessionFactory.getCurrentSession();
		Transaction tr=session.beginTransaction();
		session.save(customers);
		tr.commit();
		session.close();
	}
	public List<Flight> getFlightDetails(String source, String destination, String scheduleDate) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Query query1=session.createQuery("from Location where locName=:source");
		query1.setParameter("source", source);
		Location sourceLocation = (Location) query1.uniqueResult();
		
		Query query2=session.createQuery("from Location where locName=:destination");
		query1.setParameter("destination", destination);
		Location destinationLocation = (Location) query2.uniqueResult();
		
		Query query3=session.createQuery("from Route where sourceId=:sourceLocation and destinationId=:destinationLocation");
		query3.setParameter("sourceLocation", sourceLocation);
		query3.setParameter("destinationLocation", destinationLocation);
		Route route = (Route) query3.uniqueResult();
		
		Query query4=session.createQuery("from Schedule where scheDate=:schedule_Date and routeId=:route");
		query4.setParameter("schedule_Date", scheduleDate);
		query4.setParameter("route", route);
		List<Schedule> schedule = query4.getResultList();
		
		Query query5 = session.createQuery("from Flight where flight=:flightIds ");
		query5.setParameter("flightIds", schedule);
        List<Flight> flight=query5.getResultList();
        return flight;
        
	}
}
