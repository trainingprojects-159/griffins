package com.mphasis.griffin.daoImpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.griffin.dao.LocationDao;
import com.mphasis.griffin.entities.Location;

@Repository
public class LocationDaoImpl implements LocationDao {

	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void insertLocation(Location location) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		System.out.println(location.getLocName() + "Location values in dao ");
		session.save(location);
		tr.commit();
	}

	public void deleteLocation(int locId) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Location loc = (Location) session.get(Location.class, locId);
		session.delete(loc);
		tr.commit();
	}

	public void updateLocation(Location location) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(location);
		tr.commit();
	}

	public Location getById(int locId) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Location loc = (Location) session.get(Location.class, locId);
		session.update(loc);
		tr.commit();
		return loc;
	}

	public Location getByName(String locName) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Location loc = (Location) session.get(Location.class, locName);
		session.update(loc);
		tr.commit();
		return loc;
	}

	public List<Location> getAll() {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		List<Location> locs = session.createCriteria(Location.class).list();
		tr.commit();
		return locs;
	}

}
