package com.jsp.mtm.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;
import com.jsp.mtm.view.View;

public class Controller {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	View view = new View();
    
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
		if(resultList!=null) {
		for (Subject subject2 : resultList) {
			System.out.println("subject id: "+subject2.getId());
			System.out.println("subject name: "+subject2.getName());
			System.out.println("subject description: "+subject2.getDescription());
			System.out.println("subject trainer: "+subject2.getTrainer());
           }
		return true;
		}

		return false;
	}
	public boolean All_the_student_detail() {
		String hql = "SELECT s FROM Student s";
		TypedQuery<Student> createNamedQuery = entityManager.createQuery(hql, Student.class);
		List<Student> resultList = createNamedQuery.getResultList();
		if(resultList!=null) {
		for (Student subject2 : resultList) {
			System.out.println("student id: "+subject2.getId());
			System.out.println("student name: "+subject2.getName());
			System.out.println("student email: "+subject2.getEmail());
			System.out.println("student contact no: "+subject2.getMobile_number());
		}
		return true;
		}

		return false;
	}
	
	public boolean updateStudentName(Student student , String name) {
		if(student!=null) {
			student.setName(name);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return true;

		}
		return false;
	}
	
	public boolean updateStudentEmail(Student student , String email) {
		if(student!=null) {
			student.setEmail(email);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return true;

		}
		return false;
	}
	
	public boolean updateStudentContact(Student student , long contact) {
		if(student!=null) {
			student.setMobile_number(contact);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return true;

		}
		return false;
	}
	
	public boolean deleteExistingSubject(Student student ,Subject subject , List<Subject> subject_list , int subid) {
		if(student!=null && subject!=null) {
			Subject temp=null;
			entityTransaction.begin();
			if(find_subject(subid, subject)!=null) {
				for (Subject subject2 : subject_list) {
					if(subject2.getId()==subid) {
						temp=subject2;
						break;
					}
				}
			    subject_list.remove(temp);
			    entityManager.remove(subject);
			    entityTransaction.commit();
			    return true;
			}else {
				System.out.println("subject does not exist");
				return false;
			}
		}
		return false;
	}
	
   public boolean deleteStudent(Student student) {
	   if(student!=null) {
		   entityTransaction.begin();
		   entityManager.remove(student);
		   entityTransaction.commit();
		   return true;
	   }
	   return false;
   }
   
   public void delete(Subject temp,List<Subject>subject_list) {
	   subject_list.remove(temp);
   }
   
   public boolean deleteSubject(Subject subject,int subid,List<Subject>subject_list) {
	   if(subject!=null) {
		   entityTransaction.begin();
		   Subject temp=null;
			for (Subject subject2 : subject_list) {
					if(subject2.getId()==subid) {
						temp=subject2;
						delete(temp,subject_list);
						break;
					
		     }
		   
		}
		   entityManager.remove(subject);
		   entityTransaction.commit();
		   return true;
	   }else {
		   System.out.println("Subject does not exist");
		   return true;
	   }
	   return false;
   }

}
