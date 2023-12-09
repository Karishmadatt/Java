package com.jsp.mtm.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class StudentController {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
   
	public List<Subject> Insert_List_Of_Subject_Obtained_By_Student(Student student,Subject subject) {
		if(student!=null) {
			List<Subject> subjects = student.getSubjects();
			student.setSubjects(subjects);
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
		return subjects;
		}
		return subjects;
		
		
	}
}
