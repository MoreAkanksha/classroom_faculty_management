package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Course;
import com.tka.entity.Subject;

@Repository
public class SubjectDao {

	@Autowired
	SessionFactory factory;
	public List<Subject> fetchSubjDetails() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Subject.class);
		List<Subject> fetchallSubjData=criteria.list();
		return fetchallSubjData;
	}
	public void insertSubjDetails(Subject subject) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(subject);
		tx.commit();
	}
	public List<Subject> getspecificSubjectId() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria= session.createCriteria(Subject.class);
		List<Subject> list=criteria.list();
		return list;
	}

}
