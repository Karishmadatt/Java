package com.jsp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
private int p_id;
private String name;

@OneToOne
AdharCard adharCard;

public AdharCard getAdharCard() {
	return adharCard;
}
public void setAdharCard(AdharCard adharCard) {
	this.adharCard = adharCard;
}
public Person() {
	super();
}
public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
