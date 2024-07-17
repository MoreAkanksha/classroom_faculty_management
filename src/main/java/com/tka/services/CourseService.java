package com.tka.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.CourseDao;
import com.tka.entity.Course;

@Service
public class CourseService {

	@Autowired
	CourseDao dao;

	public List<Course> fetchCourseDetails() {

		return dao.fetchCourseDetails();

	}

	public void insertCourseDetails(Course course) {

		dao.insertCourseDetails(course);

	}

	public HashMap<Long, String> getspecificCourseId(long id) {
		List<Course> alllist = dao.getspecificCourseId();
		HashMap<Long, String> idlist = new HashMap<Long, String>();
		for (Course course : alllist) {
			if (course.getCourseId() == id) {
				idlist.put(course.getCourseId(), course.getCourseName());
			}
		}
		return idlist;
	}

	public void updateCourseDetails(Course course) {
		dao.updateCourseDetails(course);
		
	}

	public void deleteCoursespecificId(long courseId) {
		dao.deleteCoursespecificId(courseId);
	}

}
