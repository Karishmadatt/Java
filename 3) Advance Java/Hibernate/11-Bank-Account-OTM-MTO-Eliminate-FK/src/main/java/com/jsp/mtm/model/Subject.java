package com.jsp.mtm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
	public class Subject{
	@Id
	private int id;
	private String name;
	private String description;
	private String trainer;
//	@ManyToMany
//	List<Student>students_list;
//	public List<Student> getStudents_list() {
//		return students_list;
//	}
//	public void setStudents_list(List<Student> students_list) {
//		this.students_list = students_list;
//	}
	public Subject() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
	}


