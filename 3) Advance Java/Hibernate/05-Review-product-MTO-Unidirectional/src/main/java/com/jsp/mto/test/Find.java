package com.jsp.mto.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mto.model.Product;
import com.jsp.mto.model.Review;

public class Find {
public static void main(String[] args) {
	Review review = new Review();
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	Review find = entityManager.find(Review.class, 101);
	if(find!=null) {
		System.out.println("Review Id: "+find.getId());
		System.out.println("Review Heading: "+find.getHeading());
		System.out.println("Review Comment: "+find.getComment());
		System.out.println("Product Details");
		Product product = find.getProduct();
		System.out.println("Product Id: "+product.getId());
		System.out.println("Product Name: "+product.getName());
		System.out.println("Product Cost: "+product.getCost());
		
	}else {
		System.out.println("Review does not exit");
	}
}
}
