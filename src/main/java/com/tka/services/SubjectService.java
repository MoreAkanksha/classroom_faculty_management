package com.tka.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.SubjectDao;
import com.tka.entity.Course;
import com.tka.entity.Subject;

@Service
public class SubjectService {

	@Autowired
	SubjectDao dao;
	
	public List<Subject> fetchSubjDetails() {

		return dao.fetchSubjDetails();

	}

	public void insertSubjDetails(Subject subject) {

		dao.insertSubjDetails(subject);
	}

	public ArrayList<Object> getspecificSubjectId(long id) {
		List<Subject> alSublist = dao.getspecificSubjectId();
		ArrayList<Object> idlist = new ArrayList<Object>();
		for (Subject subject : alSublist) {
			if (subject.getSubjectId() == id) {
				idlist.add(subject.getSubjectId());
				idlist.add( subject.getSubjectName());
				idlist.add(subject.getCourseId());
			}
		}
		return idlist ;
	}
}
