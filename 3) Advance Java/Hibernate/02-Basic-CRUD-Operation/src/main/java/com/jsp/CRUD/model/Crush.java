package com.jsp.CRUD.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Crush {
 @Id
 private int id;
 private String name;
 private String ig_id;
 private int no_of_ex;
 private boolean status;
 public Crush(){
	 
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
public String getIg_id() {
	return ig_id;
}
public void setIg_id(String ig_id) {
	this.ig_id = ig_id;
}
public int getNo_of_ex() {
	return no_of_ex;
}
public void setNo_of_ex(int no_of_ex) {
	this.no_of_ex = no_of_ex;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
}
