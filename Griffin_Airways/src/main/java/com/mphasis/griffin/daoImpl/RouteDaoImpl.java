package com.mphasis.griffin.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.customexceptions.BuissnessException;
import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.dao.RouteDao;

import com.mphasis.griffin.entities.Route;


@Repository
public class RouteDaoImpl implements RouteDao {
	@Autowired
	SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sessionFactory) {
    	this.sessionFactory=sessionFactory;
    }
    
	public void insertRoute(Route route) throws BusinessException {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		System.out.println(route.getSource()+"route values in dao");
		
		session.save(route);
		tr.commit();
	}

	public void deleteRoute(String routeid) throws BusinessException{
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Route r=(Route)session.get(Route.class,routeid);
		
		session.delete(r);
		tr.commit();
	}

	public void updateRoute(Route route) throws BusinessException {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(route);
		tr.commit();
	}

	public Route getRouteById(String routeid) throws BusinessException {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Route r=(Route)session.get(Route.class, routeid);	
		session.update(r);
		tr.commit();
		return r;
	}

	public List<Route> getAll() throws BusinessException{
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		List<Route> route=session.createQuery("from Route",Route.class).list();
		tr.commit();
		return route;
	}

}
