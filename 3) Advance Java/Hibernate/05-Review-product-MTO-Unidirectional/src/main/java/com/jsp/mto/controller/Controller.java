package com.jsp.mto.controller;

import java.io.BufferedReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mto.model.Product;
import com.jsp.mto.model.Review;

public class Controller {
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = createEntityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	Product product = new Product();
	Review review = new Review();
	
  public boolean Insert(int review_id,Review rev,Product product) {
      if(rev!=null && product!=null) {
       entityTransaction.begin();
       entityManager.persist(product);
   	   entityManager.persist(rev);
   	   entityTransaction.commit();
        return true;
      }
      return false;
	   	   
   }
  public Review find_review(int review_id) {
	  return entityManager.find(Review.class,review_id);
	   }
  public boolean update_heading(String heading,Review review) {
	  if(review!=null) {
		  review.setHeading(heading);
		  entityTransaction.begin();
		  entityManager.merge(review);
		  entityTransaction.commit();
          return true;
	  }
	  	  return false;
  }
  
  public boolean update_comment(String comment,Review review) {
	  if(review!=null) {
		  review.setComment(comment);
		  entityTransaction.begin();
		  entityManager.merge(review);
		  entityTransaction.commit();
          return true;
	  }
	  	  return false;
  }

}
