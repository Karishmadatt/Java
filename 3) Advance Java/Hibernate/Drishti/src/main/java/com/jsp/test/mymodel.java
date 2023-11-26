package com.jsp.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class mymodel {
   @Id
   private int link;
   private String month;
   private boolean check;
   private String year_name;
   public mymodel() {
	   
   }
public int getLink() {
	return link;
}
public void setLink(int link) {
	this.link = link;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public boolean isCheck() {
	return check;
}
public void setCheck(boolean check) {
	this.check = check;
}
public String getYear_name() {
	return year_name;
}
public void setYear_name(String year_name) {
	this.year_name = year_name;
}
   
}
