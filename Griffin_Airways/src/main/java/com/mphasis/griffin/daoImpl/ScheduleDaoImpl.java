package com.mphasis.griffin.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.customexceptions.BuissnessException;
import com.mphasis.griffin.customexceptions.BusinessException;
import com.mphasis.griffin.dao.ScheduleDao;
import com.mphasis.griffin.entities.Schedule;

@Repository
public class ScheduleDaoImpl implements ScheduleDao {

	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void insertSchedule(Schedule schedule) throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		System.out.println(schedule.getScheId() + "Schedule id values in dao ");
		session.save(schedule);
		tr.commit();
	}

	public void deleteSchedule(String scheId) throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Schedule sche = (Schedule) session.get(Schedule.class, scheId);
		session.delete(sche);
		tr.commit();
	}

	public void updateLocation(Schedule schedule) throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(schedule);
		tr.commit();
	}

	public Schedule getById(String scheId) throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Schedule sche = (Schedule) session.get(Schedule.class, scheId);
		session.update(sche);
		tr.commit();
		return sche;
	}

	public List<Schedule> getAll() throws BusinessException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		List<Schedule> sches = session.createQuery("from Schedule",Schedule.class).list();
		tr.commit();
		return sches;
	}

}
