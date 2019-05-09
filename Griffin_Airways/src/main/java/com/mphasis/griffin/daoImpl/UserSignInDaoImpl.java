package com.mphasis.griffin.daoImpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.griffin.dao.UserSignInDao;
import com.mphasis.griffin.entities.SignIn;

public class UserSignInDaoImpl implements UserSignInDao{
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SignIn signIn(String userId, String password) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Puser where userId=:userId and password=:password");
		query.setParameter("userId", userId);
		query.setParameter("password", password);
		SignIn signIn=(SignIn) query.uniqueResult();
		return signIn;
	}
	
}
