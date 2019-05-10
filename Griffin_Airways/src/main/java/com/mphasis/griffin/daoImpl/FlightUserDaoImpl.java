package com.mphasis.griffin.daoImpl;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.dao.FlightUserDao;
import com.mphasis.griffin.entities.FlightUser;

@Repository
public class FlightUserDaoImpl implements FlightUserDao{
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public FlightUser signIn(String email, String password) {
		Session session=sessionFactory.getCurrentSession();
		TypedQuery query = session.createQuery("from SignIn where email=:email and password=:password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		FlightUser signIn=(FlightUser) query.getSingleResult();
		return signIn;
	}
	
}
