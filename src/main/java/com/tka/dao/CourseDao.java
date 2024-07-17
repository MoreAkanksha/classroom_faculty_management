package com.tka.dao;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Classroom;
import com.tka.entity.Course;

@Repository
public class CourseDao {

	@Autowired
	SessionFactory factory;

	public List<Course> fetchCourseDetails() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Course.class);
		List<Course> fetchallData=criteria.list();
		return fetchallData;
	}
	public void insertCourseDetails(Course course) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(course);
		tx.commit();
	}
	public List<Course> getspecificCourseId() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria= session.createCriteria(Course.class);
		List<Course> list=criteria.list();
		return list;
	}
	public void updateCourseDetails(Course course) {
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.update(course);
	tx.commit();
	
	}
	public void deleteCoursespecificId(long courseId) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Course cr=session.load(Course.class, courseId);
		session.delete(cr);
		tx.commit();
		
		
	}
	
	
}
