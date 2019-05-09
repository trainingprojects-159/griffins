package com.mphasis.griffin.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.dao.UserSignInDao;
import com.mphasis.griffin.entities.SignIn;

@Repository
public class UserSignInDaoImpl implements UserSignInDao{
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SignIn signIn(String userId, String password) {
		Session session=sessionFactory.getCurrentSession();
		Query query = session.createQuery("from SignIn where userId=:userId and password=:password");
		query.setParameter("userId", userId);
		query.setParameter("password", password);
		SignIn signIn=(SignIn) query.uniqueResult();
		return signIn;
	}
	
}
