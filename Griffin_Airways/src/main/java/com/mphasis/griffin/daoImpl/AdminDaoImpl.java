package com.mphasis.griffin.daoImpl;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.dao.AdminDao;
import com.mphasis.griffin.entities.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Admin login(String userId, String password) throws BusinessException {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		TypedQuery<Admin> query = session.createQuery("from SignIn where userId=:userId and password=:password");
		query.setParameter("userId", userId);
		query.setParameter("password", password);
		Admin login=(Admin) query.getSingleResult();
		tr.commit();
		return login;
	}
}
