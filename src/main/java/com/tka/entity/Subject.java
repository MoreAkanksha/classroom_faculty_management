package com.tka.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@Table(name="Subjects")
public class Subject {

	
	@Id
	private long subjectId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
	@JsonIgnoreProperties("subject")
	private Course course;
	private String SubjectName;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Subject(long subjectId, Course course, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.course = course;
		this.SubjectName = subjectName;
	}

	@JsonProperty("courseId")
	public long getCourseId() {
        return course != null ? course.getCourseId() : null;
    }
	
	public void setCourseId(long courseId) {
        if (this.course == null) {
            this.course = new Course();
        }
        this.course.setCourseId(courseId);
    }

	@JsonProperty("courseName")
	public String getCourseName() {
        return course != null ? course.getCourseName() : null;
    }
	
	public void setCourseName(String courseName) {
        if (this.course == null) {
            this.course = new Course();
        }
        this.course.setCourseName(courseName);
    }
    
	

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

//	public Course getCourse() {
//		return course;
//	}
//
	public void setCourse(Course course) {
		this.course = course;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		this.SubjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", SubjectName=" + SubjectName + "]";
	}
	
	

}
