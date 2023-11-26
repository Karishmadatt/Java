package com.jsp.CRUD.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class utility {
   public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
   public static EntityManager entityManager = entityManagerFactory.createEntityManager();
   public static EntityTransaction entityTransaction = entityManager.getTransaction();
}
