package com.mphasis.griffin.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.dao.CustomersDao;
import com.mphasis.griffin.entities.Customers;

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
}
