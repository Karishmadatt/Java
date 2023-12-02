package com.jsp.mtm.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class Controller {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
    
	public boolean insert_new_subject(Student student , Subject subject) {
		if(student!=null && subject!=null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityManager.persist(subject);
			entityTransaction.commit();
			return true;
		}
		
		return false;
	}
	public boolean insert_already_exist_subject(Student student) {
		if(student!=null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
			return true;
		}

		return false;
	}
	
	public Subject find(int subject_id,Subject subject) {
		return entityManager.find(Subject.class, subject_id);
	}
}
