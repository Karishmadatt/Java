package com.jsp.mtm.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class Insert {
 public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	Student student1 = new Student();
	student1.setId(1);
	student1.setName("Karishma");
	student1.setEmail("karishmadatt2000@gmail.com");
	student1.setMobile_number(43343);
	
	Subject sub1=new Subject();
	sub1.setId(1);
	sub1.setName("Java");
	sub1.setTrainer("avd");
	sub1.setDescription("Java_Trainer");
	
	Subject sub2=new Subject();
	sub2.setId(2);
	sub2.setName("JavaScript");
	sub2.setTrainer("abc");
	sub2.setDescription("JavaScript_Trainer");
	
	List<Subject> subjects = new ArrayList<Subject>();
	subjects.add(sub1);
	subjects.add(sub2);
	student1.setSubjects(subjects);
	entityTransaction.begin();
	entityManager.persist(student1);
	entityManager.persist(sub1);
	entityManager.persist(sub2);
	entityTransaction.commit();
	
	//considering we have subject already existing in subject table now if I want to add new a student and assign  available subject
    
	
}
}
