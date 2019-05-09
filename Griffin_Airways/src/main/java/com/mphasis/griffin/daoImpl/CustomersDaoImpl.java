package com.mphasis.griffin.daoImpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.griffin.dao.SignUpDao;
import com.mphasis.griffin.entities.SignUp;

public class SignUpDaoImpl implements SignUpDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public int register(SignUp signUp) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("");
		return 0;
	}
	
}
