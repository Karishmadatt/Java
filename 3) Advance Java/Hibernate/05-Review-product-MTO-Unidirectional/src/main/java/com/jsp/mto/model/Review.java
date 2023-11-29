package com.jsp.mto.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Review {
@Id
private int id;
private String heading;
private String comment;
public Review() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getHeading() {
	return heading;
}
public void setHeading(String heading) {
	this.heading = heading;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}

}
