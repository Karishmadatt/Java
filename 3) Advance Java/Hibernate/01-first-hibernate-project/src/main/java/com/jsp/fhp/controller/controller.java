package com.jsp.fhp.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class controller {
     public static void main(String[] args) {
	  EntityManagerFactory entityManagerFactory =	Persistence.createEntityManagerFactory("pgadmin");
	  System.out.println(entityManagerFactory);
	}
}

