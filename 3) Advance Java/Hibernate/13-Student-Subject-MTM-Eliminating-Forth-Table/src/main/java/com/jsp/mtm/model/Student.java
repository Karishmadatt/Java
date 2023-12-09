package com.jsp.mtm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
	public class Student{
	@Id
	private int id;
	private String name;
	private String email;
	private long mobile_number;
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn(name="my_student_id"),
	inverseJoinColumns = @JoinColumn(name="my_subject_id"))
	 List<Subject>subjects_list;
	public Student() {
		super();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public List<Subject> getSubjects() {
		return subjects_list;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects_list = subjects;
	}
	
	}

