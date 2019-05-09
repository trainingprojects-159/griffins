package com.mphasis.griffin.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.dao.ScheduleDao;
import com.mphasis.griffin.entities.Schedule;

@Repository
public class ScheduleDaoImpl implements ScheduleDao {

	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void insertSchedule(Schedule schedule) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		System.out.println(schedule.getScheId() + "Schedule id values in dao ");
		session.save(schedule);
		tr.commit();
	}

	public void deleteSchedule(String scheId) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Schedule sche = (Schedule) session.get(Schedule.class, scheId);
		session.delete(sche);
		tr.commit();
	}

	public void updateLocation(Schedule schedule) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(schedule);
		tr.commit();
	}

	public Schedule getById(String scheId) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Schedule sche = (Schedule) session.get(Schedule.class, scheId);
		session.update(sche);
		tr.commit();
		return sche;
	}

	public List<Schedule> getAll() {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		List<Schedule> sches = session.createCriteria(Schedule.class).list();
		tr.commit();
		return sches;
	}

}
