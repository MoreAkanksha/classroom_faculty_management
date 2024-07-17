package com.tka.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.DepartmentsDao;
import com.tka.entity.Classroom;
import com.tka.entity.Departments;

@Service
public class DepartmentsServices {

	@Autowired
	DepartmentsDao dao;

	public void insertDepartmentData(Departments department) {

		dao.insertDepartmentData(department);

	}

	public List<Departments> fetchAllDepartmentData() {

		return dao.fetchAllDepartmentData();
	}

	public HashMap<Long, String> getspecificDepId(long id) {
		List<Departments> fetchDep = dao.getspecificDepId();
		HashMap<Long, String> fetchDepid = new HashMap<Long, String>();
		for (Departments departments : fetchDep) {
			if (departments.getDepartmentId() == id) {
				fetchDepid.put(departments.getDepartmentId(), departments.getDepartmentName());
			}
		}
		return fetchDepid;
	}

	public void UpdateDepDetails(Departments dep) {
				dao.UpdateDepDetails(dep);
	}

	public void DeleteSpecificDepId(long id) {
		dao.DeleteSpecificDepId(id);
	}
}
