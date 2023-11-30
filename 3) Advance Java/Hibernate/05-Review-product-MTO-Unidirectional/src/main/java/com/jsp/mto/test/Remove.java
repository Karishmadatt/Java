package com.jsp.mto.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mto.model.Review;

public class Remove {
	public static void main(String[] args) {
		Review review = new Review();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Review find = entityManager.find(Review.class, 101);
		if(find!=null) {
			entityTransaction.begin();
			entityManager.remove(find);
		     entityTransaction.commit();
		}else {
			System.out.println("Review does not exist");
		}

	}

}
