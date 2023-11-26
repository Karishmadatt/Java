package com.jsp.CRUD.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.CRUD.model.Crush;

public class delete {
public static void main(String[] args) {
   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
   EntityManager entityManager = entityManagerFactory.createEntityManager();
   EntityTransaction entityTransaction = entityManager.getTransaction();
   
   entityTransaction.begin();
   Crush crush = entityManager.find(Crush.class, 2);
   if(crush!=null) {
	   entityManager.remove(crush);
   }else {
	   System.out.println("Record with given id does not exit , no update operation performed");
   }
   entityTransaction.commit();
   
}
}
