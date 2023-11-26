package com.jsp.oto.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class car {
   @Id
   private int id;
   private String car_name;
   private String chassis;
   private double cost;
   
   @OneToOne
   engine eng;
   public car(){
	   
   }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCar_name() {
	return car_name;
}
public void setCar_name(String car_name) {
	this.car_name = car_name;
}
public String getChassis() {
	return chassis;
}
public void setChassis(String chassis) {
	this.chassis = chassis;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public engine getEng() {
	return eng;
}
public void setEng(engine eng) {
	this.eng = eng;
}
   
}
