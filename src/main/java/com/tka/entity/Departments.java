package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Departments {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private long departmentId;
	//@Column(nullable = false)
	private String departmentName;
	public Departments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departments(long departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Departments [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
}
