package com.tka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Classroom")
public class Classroom {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable=false)
	private String name;
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classroom( long id,String name) {
		this.id=id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Classroom [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
