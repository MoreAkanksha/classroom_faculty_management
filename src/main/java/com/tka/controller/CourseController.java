package com.tka.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Course;
import com.tka.services.CourseService;

@RestController
public class CourseController {

	
	@Autowired
	CourseService service;
	
	@GetMapping("fetchCourseDetails")
	public List<Course> fetchCourseDetails()
	{
		return service.fetchCourseDetails();
	}
	
	@PostMapping("insertCourseDetails")
	public void insertCourseDetails(@RequestBody Course course)
	{
		service.insertCourseDetails(course);
	}
	
	@GetMapping("getspecificCourseId/{id}")
	public HashMap<Long ,String> getspecificCourseId(@PathVariable long id)
	{
		return service.getspecificCourseId(id);
	}
	
	@PutMapping("updateCourse")
	public void updateCourseDetails(@RequestBody Course course)
	{
		service.updateCourseDetails(course);
	}
	
	@DeleteMapping("deleteCoursespecificId")
	public void deleteCoursespecificId(@RequestParam long courseId)
	{
		service.deleteCoursespecificId(courseId);
	}
	
}
