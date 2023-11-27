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
   public car find(int id) {
	   car find = createEntityManager.find(car.class, id);
	   return find;
   }
   public void remove(car c) {
	  entityTransaction.begin();
	  createEntityManager.remove(c);
	  createEntityManager.remove(c.getEng());
	  entityTransaction.commit();
   }
   public boolean updatecost(int id,double cost) {
	   car c = find(id);
	   if(c!=null){
		   c.setCost(cost);
		   entityTransaction.begin();
		   createEntityManager.merge(c);
		   entityTransaction.commit();
		   return true;
	   }
	   return false;
   }
   public boolean updatename(int id, String name) {
	   car c = find(id);
	   if(c!=null){
		   c.setCar_name(name);
		   entityTransaction.begin();
		   createEntityManager.merge(c);
		   entityTransaction.commit();
		   return true;
	   }
	   return false;
   }
   public boolean updatechassis(int id, String s) {
	   car c = find(id);
	   if(c!=null){
		   c.setChassis(s);;
		   entityTransaction.begin();
		   createEntityManager.merge(c);
		   entityTransaction.commit();
		   return true;
	   }
	   return false;
   }
   public boolean updatecc(int id, double cc) {
	   car c = find(id);
	   if(c!=null){
		   e.setCc(cc);
		   entityTransaction.begin();
		   createEntityManager.merge(e);
		   entityTransaction.commit();
		   return true;
	   }
	   return false;
   }



}