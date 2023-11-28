package com.jsp.otm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
@Id
private int id;
private String name;
private String headquaters;
private long bacontact;
@OneToMany
List<Account> accounts;
public Bank(){
	
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
public String getHeadquaters() {
	return headquaters;
}
public void setHeadquaters(String headquaters) {
	this.headquaters = headquaters;
}
public long getBacontact() {
	return bacontact;
}
public void setBacontact(long bacontact) {
	this.bacontact = bacontact;
}
public List<Account> getAccounts() {
	return accounts;
}
public void setAccounts(List<Account> accounts) {
	this.accounts = accounts;
}


}
