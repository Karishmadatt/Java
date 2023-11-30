package com.jsp.mto.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mto.model.Product;
import com.jsp.mto.model.Review;

public class Insert {
  public static void main(String[] args) {
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = createEntityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	Product product1 = new Product();	
	product1.setId(1);
	product1.setName("Shoes");
	product1.setCost(800);
	
	Review review1 = new Review();
    review1.setId(100);
    review1.setComment("Go for it");
    review1.setHeading("Good");
	
    review1.setProduct(product1);
    Review review2 = new Review();
    review2.setId(101);
    review2.setComment("Worst Product");
    review2.setHeading("Bad");
    review2.setProduct(product1);
    
    entityTransaction.begin();
    entityManager.persist(product1);
    entityManager.persist(review1);
    entityManager.persist(review2);
    entityTransaction.commit();

	
}
}
