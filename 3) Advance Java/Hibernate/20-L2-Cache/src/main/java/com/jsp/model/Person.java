package com.jsp.model;

import java.time.LocalDateTime;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Cacheable
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(nullable = true)
private String name;
@Column(unique = true)
private long mobile;
@Column(updatable = false)
private boolean gender;
//@CreationTimestamp
//@Column(insertable = false)
//private LocalDateTime dob;
@Column(nullable = false,unique = true)
private String email;

public Person() {
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
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public boolean isGender() {
	return gender;
}
public void setGender(boolean gender) {
	this.gender = gender;
}
//public LocalDateTime getDob() {
//	return dob;
//}
//public void setDob(LocalDateTime dob) {
//	this.dob = dob;
//}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
