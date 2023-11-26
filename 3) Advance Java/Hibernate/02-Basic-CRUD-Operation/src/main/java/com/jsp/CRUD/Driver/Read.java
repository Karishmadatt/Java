package com.jsp.CRUD.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.CRUD.model.Crush;

public class Read {
 public static void main(String[] args) {
  	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
  	EntityManager entityManager = entityManagerFactory.createEntityManager();
  	EntityTransaction entityTransaction = entityManager.getTransaction();
  	
  	Crush crush = entityManager.find(Crush.class, 1);
  	if (crush != null) {
		System.out.println("Id : "+crush.getId());
		System.out.println("Name : "+crush.getName());
		System.out.println("Crush : "+crush.getIg_id());
		System.out.println("No. of ex : "+crush.getNo_of_ex());
		System.out.println("Status : "+crush.isStatus());
	}else {
		System.out.println("No record associated with given id.");
	}
}
}
