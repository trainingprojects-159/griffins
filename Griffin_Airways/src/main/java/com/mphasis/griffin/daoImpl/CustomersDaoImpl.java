package com.mphasis.griffin.daoImpl;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.dao.CustomersDao;
import com.mphasis.griffin.entities.Customers;
import com.mphasis.griffin.entities.Flight;


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
		NativeQuery<Flight> query=(NativeQuery<Flight>) session.createNativeQuery("select * from flight where flightId in "
				+ "(select flightId from schedule where scheDate=:schedule_Date and routeId ="
				+ "(select routeId from route where source =(select locId from location where locName=:source) and destination="
				+ "(select locId from location where locName=:destination))))").list();
		query.setParameter("schedule_Date", scheduleDate);
		query.setParameter("source", source);
		query.setParameter("destination", destination);
		List<Flight> flights=query.getResultList();
		
		return flights;
//		TypedQuery<Location> query1=session.createQuery("from Location where locName=:source");
//		query1.setParameter("source", source);
//		Location sourceLocation =  query1.getSingleResult();
//		
//		TypedQuery<Location> query2=session.createQuery("from Location where locName=:destination");
//		query1.setParameter("destination", destination);
//		Location destinationLocation = query2.getSingleResult();
//		
//		TypedQuery<Route> query3=session.createQuery("from Route where sourceId=:sourceLocation and destinationId=:destinationLocation");
//		query3.setParameter("sourceLocation", sourceLocation);
//		query3.setParameter("destinationLocation", destinationLocation);
//		Route route = query3.getSingleResult();
//		
//		TypedQuery<Schedule>  query4=session.createQuery("from Schedule where scheDate=:schedule_Date and routeId=:route");
//		query4.setParameter("schedule_Date", scheduleDate);
//		query4.setParameter("route", route.getRouteId());
//		List<Schedule> schedule = query4.getResultList();
//
//        List<Flight> flights=null;
//		for(Schedule sc:schedule) {
//		TypedQuery<Flight> query5 = session.createQuery("from Flight where flightId=:flightIds ");
//		query5.setParameter("flightIds", sc.getFlight());
//		
//        flights=query5.getResultList();
//		}
//        return flights;
		
		
		
        
	}
}
