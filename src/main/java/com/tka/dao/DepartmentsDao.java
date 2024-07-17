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
import com.tka.entity.Departments;

@Repository
public class DepartmentsDao {

	@Autowired
	SessionFactory factory;

	public void insertDepartmentData(Departments department) {

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(department);
		tx.commit();
		
	}

	public List<Departments> fetchAllDepartmentData() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Departments.class);
		List<Departments> fetchdepartments=criteria.list();		
		return fetchdepartments;
	}

	public List<Departments> getspecificDepId() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Departments.class);
		List<Departments> fetchdepartments=criteria.list();		
		return fetchdepartments;
	}

	public void UpdateDepDetails(Departments dep) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(dep);
		tx.commit();
	}

	public void DeleteSpecificDepId(long id) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Departments dep=session.load(Departments.class, id);
		session.delete(dep);
		tx.commit();
	}
}
