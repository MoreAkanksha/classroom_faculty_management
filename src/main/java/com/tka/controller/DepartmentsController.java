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
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Classroom;
import com.tka.entity.Departments;
import com.tka.services.DepartmentsServices;

@RestController
public class DepartmentsController {

	@Autowired
	DepartmentsServices service;
	
	@GetMapping("/test1")
	public String test()
	{
		return "test==1";
	}
	
	@PostMapping("insertDepartmentData")
	public void insertDepartmentData(@RequestBody Departments department)
	{
		service.insertDepartmentData(department);
	}
	
	@GetMapping("fetchAllDepartmentData")
	public List<Departments> fetchAllDepartmentData()
	{
		return service.fetchAllDepartmentData();
	}
	
	@GetMapping("getspecificDepId/{id}")
	public HashMap<Long, String> getspecificDepId(@PathVariable long id)
	{
		return service.getspecificDepId(id);
	}
	@PutMapping("UpdateDepDetails")
	public void UpdateDepDetails(@RequestBody Departments dep)
	{
		service.UpdateDepDetails(dep);
	}
	
	@DeleteMapping("DeleteSpecificDepId/{id}")
	public void DeleteSpecificDepId(@PathVariable long id)
	{
		service.DeleteSpecificDepId(id);
	}
}
