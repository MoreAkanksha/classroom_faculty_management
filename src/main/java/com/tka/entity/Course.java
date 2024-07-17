package com.tka.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Courses")
public class Course {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	//@Column(nullable = false)
	private String courseName;
	

//	 @ManyToOne(fetch = FetchType.LAZY)
//	 //@PrimaryKeyJoinColumn
//	 private Subject subject;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", coursename=" + courseName + "]";
	}
	
}
