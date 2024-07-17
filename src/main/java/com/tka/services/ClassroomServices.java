package com.tka.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ClassroomDao;
import com.tka.entity.Classroom;

@Service
public class ClassroomServices {

	@Autowired
	private ClassroomDao dao;
	
	public void insertdata(Classroom classroom) {
		dao.insertdata(classroom);
	}

	public List<Classroom> fetchAllData() {
		return dao.fetchAllData();
	}

	public HashMap<Long ,String> getspecificId(long id) {
		List<Classroom> allData=dao.fetchAllData();
		HashMap<Long ,String> specificID=new HashMap<Long ,String>();
		for (Classroom fetchid : allData) {
			if(fetchid.getId()==id)
			{
				specificID.put(fetchid.getId(),fetchid.getName());
			}
		}
		
		return specificID;
	}

	public void updatedetails(Classroom classroom) {

		dao.updatedetails(classroom);
	}

	public void deleteSpecificClRoom(long id) {

		dao.deleteSpecificClRoom(id);
	}
	
	

	
	

}
