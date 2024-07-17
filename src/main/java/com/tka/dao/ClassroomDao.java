package com.tka.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Classroom;

@Repository
public class ClassroomDao {

	@Autowired
	SessionFactory factory;
	
	public void insertdata(Classroom classroom) {

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(classroom);
		tx.commit();
	}

	public List<Classroom> fetchAllData() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Classroom.class);
		List<Classroom> allData=criteria.list();
		return allData;
	}

	public List<Classroom> getspecificId(long id) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Classroom.class);
		List<Classroom> allData=criteria.list();
		
		return allData;
	}

	public void updatedetails(Classroom classroom) {

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(classroom);
		tx.commit();
	}

	public void deleteSpecificClRoom(long id) {
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Classroom cr=session.load(Classroom.class, id);
		session.delete(cr);
		tx.commit();
	}
	
	
	
	
}
