package com.jsp.mtm.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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
	
	public Subject find_subject(int subject_id,Subject subject) {
		return entityManager.find(Subject.class, subject_id);
	}
	
	public Student find_student(int student_id , Student student) {
		return entityManager.find(Student.class, student_id);
	}
	
	public boolean All_the_subject_detail() {
		String hql = "SELECT s FROM Subject s";
		TypedQuery<Subject> createNamedQuery = entityManager.createQuery(hql, Subject.class);
		List<Subject> resultList = createNamedQuery.getResultList();
		for (Subject subject2 : resultList) {
			System.out.println("subject id: "+subject2.getId());
			System.out.println("subject name: "+subject2.getName());
			System.out.println("subject description: "+subject2.getDescription());
			System.out.println("subject trainer: "+subject2.getTrainer());
            return true;
		}

		return false;
	}
	public boolean All_the_student_detail() {
		String hql = "SELECT s FROM Student s";
		TypedQuery<Student> createNamedQuery = entityManager.createQuery(hql, Student.class);
		List<Student> resultList = createNamedQuery.getResultList();
		for (Student subject2 : resultList) {
			System.out.println("student id: "+subject2.getId());
			System.out.println("student name: "+subject2.getName());
			System.out.println("student email: "+subject2.getEmail());
			System.out.println("student contact no: "+subject2.getMobile_number());
              return true;
		}

		return false;
	}


}
