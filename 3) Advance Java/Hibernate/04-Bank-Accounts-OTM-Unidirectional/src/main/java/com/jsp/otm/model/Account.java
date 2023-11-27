package com.jsp.otm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
  @Id
 int id;
 long contact;
 double balance;
 long account_number;
public Account() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balace) {
	this.balance = balace;
}
public long getAccount_number() {
	return account_number;
}
public void setAccount_number(long account_number) {
	this.account_number = account_number;
}

 
 
}
