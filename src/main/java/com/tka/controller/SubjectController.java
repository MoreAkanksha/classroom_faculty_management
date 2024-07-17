package com.tka.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Course;
import com.tka.entity.Subject;
import com.tka.services.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	SubjectService service;
	
	@GetMapping("fetchSubjectDetails")
	public List<Subject> fetchSubjDetails()
	{
		return service.fetchSubjDetails();
	}
	
	@PostMapping("insertSubjDetails")
	public void insertSubjDetails(@RequestBody Subject subject)
	{
		long courseId = subject.getCourseId(); // Assuming this method exists in Subject

        Course course = new Course();
        course.setCourseId(courseId);
        subject.setCourse(course);
		service.insertSubjDetails(subject);
	}
	@GetMapping("getspecificSubjectId/{id}")
	public ArrayList<Object> getspecificSubjectId(@PathVariable long id)
	{
		return service.getspecificSubjectId(id);
	}
	
}
