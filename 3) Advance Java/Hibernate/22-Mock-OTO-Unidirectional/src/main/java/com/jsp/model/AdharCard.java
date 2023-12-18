package com.jsp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdharCard {
	@Id
private int e_id;
private int adhar_number;
private String name;
private long mobile_number;
private String address;
public int getE_id() {
	return e_id;
}

public AdharCard() {
	super();
}

public void setE_id(int e_id) {
	this.e_id = e_id;
}
public int getAdhar_number() {
	return adhar_number;
}
public void setAdhar_number(int adhar_number) {
	this.adhar_number = adhar_number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobile_number() {
	return mobile_number;
}
public void setMobile_number(long mobile_number) {
	this.mobile_number = mobile_number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
