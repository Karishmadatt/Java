package com.jsp.drishti.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class controller {
public static void main(String[] args) {
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	System.out.println(createEntityManagerFactory);
}
}
