package com.jsp.oto.bidirectional.eliminate.duplicate.fk.reverve.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car {
@Id
private int id;
private String car_name;
private String chasis;
private double cost;
@OneToOne(mappedBy="car")
Engine engine;
public Car() {
	
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
public String getChasis() {
	return chasis;
}
public void setChasis(String chasis) {
	this.chasis = chasis;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public Engine getEng() {
	return engine;
}
public void setEng(Engine eng) {
	this.engine = eng;
}


}
