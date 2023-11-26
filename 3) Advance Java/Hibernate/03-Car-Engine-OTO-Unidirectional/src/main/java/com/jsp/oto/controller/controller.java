package com.jsp.oto.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.oto.model.car;
import com.jsp.oto.model.engine;

public class controller {

   static EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
   static EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
   static EntityTransaction entityTransaction = createEntityManager.getTransaction();
   
   car c = new car();
   engine e = new engine(); 
   
   public boolean insert(car c,engine e) {;
	  if(c!=null && e!=null) {
		  entityTransaction.begin();
		   createEntityManager.persist(c);
		   createEntityManager.persist(e);
		   entityTransaction.commit();
		   return true;
	  }
	  return false;
	  
   }

}