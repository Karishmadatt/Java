package com.jsp.mto.controller;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

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
  public Product find_product(int product_id) {
	  return entityManager.find(Product.class, product_id);
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
  
  public boolean update_review_comment(String comment,Review review) {
	  if(review!=null) {
		  review.setComment(comment);
		  entityTransaction.begin();
		  entityManager.merge(review);
		  entityTransaction.commit();
          return true;
	  }
	  	  return false;
  }
  public boolean update_product_name(String name,Review review) {
	  if(review!=null) {
		  Product product2 = review.getProduct();
          product2.setName(name);
          entityTransaction.begin();
          entityManager.merge(review);
          entityTransaction.commit();
          return true;
	  }
	  	  return false;
  }
  public boolean update_product_cost(int cost,Review review) {
	  if(review!=null) {
		  Product product2 = review.getProduct();
          product2.setCost(cost);
          entityTransaction.begin();
          entityManager.merge(review);
          entityTransaction.commit();
          return true;
	  }
	  	  return false;
  }
  public boolean delete_review(int review_id,Review review) {
	  if(review!=null) {
		  entityTransaction.begin();
		  entityManager.remove(review);
		  entityTransaction.commit();
		  return true;
	  }
	  return false;
  }
  
//  public List<Review> Get_Product_Review(int review_id,Review review,int product_id){
//	  List<Review> product_reviews=new ArrayList<>();
//	  Product product2 = review.getProduct();
//	  while(product2.getId()==2)
//	  return product_reviews;
//  }
  
  public boolean delete_product(int review_id,Review review,int product_id) {
	  if(review!=null) {
//		  Product product2 = review.getProduct();k
		  entityTransaction.begin();
		  Product find_product = find_product(product_id);
		  if(find_product!=null) {
			  entityManager.remove(find_product);
		  }
//		  entityTransaction.begin();
//		  while(product2!=null) {
//			  entityManager.remove(review);
//		  }
//		  entityManager.remove(product2);
		  entityTransaction.commit();
		  return true;
	  }
	  return false;
  }

}
