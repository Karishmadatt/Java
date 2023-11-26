package com.jsp.fhp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SuperModel {
  @Id
  private int id;
  private String name;
  private double height;
  public SuperModel() {
	  
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
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
  
}
