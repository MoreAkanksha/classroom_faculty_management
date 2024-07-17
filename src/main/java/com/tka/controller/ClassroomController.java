package com.tka.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Classroom;
import com.tka.services.ClassroomServices;

@RestController
public class ClassroomController {

	@Autowired
	 ClassroomServices service;
	@GetMapping("/test")
	public String test()
	{
		return "test";
	}
	
	@PostMapping("insertdata")
	public void insertdata(@RequestBody Classroom classroom)
	{
		service.insertdata(classroom);
	}
	
	@GetMapping("fetchAllData")
	public List<Classroom> fetchAllData()
	{
		return service.fetchAllData();
	}
	
	@GetMapping("getspecificId/{id}")
	public HashMap<Long, String> getspecificId(@PathVariable long id)
	{
		return service.getspecificId(id);
	}
	
	@PutMapping("Updatedetails")
	public void updatedetails(@RequestBody Classroom classroom)
	{
		service.updatedetails(classroom);
	}
	
	@DeleteMapping("DeleteSpecificId/{id}")
	public void deleteSpecificClRoom(@PathVariable long id)
	{
		service.deleteSpecificClRoom(id);
	}
}
