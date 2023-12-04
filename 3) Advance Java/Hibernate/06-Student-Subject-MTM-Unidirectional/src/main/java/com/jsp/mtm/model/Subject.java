package com.jsp.mtm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Subject{
	@Id
	private int id;
	private String name;
	private String description;
	private String trainer;
	
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


