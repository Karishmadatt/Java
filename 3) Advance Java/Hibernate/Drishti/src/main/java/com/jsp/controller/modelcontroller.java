package com.jsp.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class modelcontroller {
   public static void main(String[] args) {
	 EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	 System.out.println(createEntityManagerFactory); 
}
}
