package com.jsp.mtm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
	public class Subject{
	@Id
	private int id;
	private String name;
	private String description;
	private String trainer;
	@ManyToMany(mappedBy="subjects_list")
	private List<Student>student_list;
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
	public List<Student> getStudent_list() {
		return student_list;
	}
	public void setStudent_list(List<Student> student_list) {
		this.student_list = student_list;
	}

	
	}


