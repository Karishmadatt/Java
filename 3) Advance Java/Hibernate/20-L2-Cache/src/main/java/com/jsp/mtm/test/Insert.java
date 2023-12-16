package com.jsp.mtm.test;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.model.Person;



public class Insert {
 public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager1 = entityManagerFactory.createEntityManager();
	EntityManager entityManager2 = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager1.getTransaction();
	Person person1 = new Person();
//	person1.setName("karishma");
//	person1.setMobile(123456789);
//	person1.setGender(true);
//	person1.setEmail("karishma@gmail.com");
	Person find1 = entityManager1.find(Person.class, 1);
	System.out.println("person id: "+find1.getId());
	System.out.println("person name: "+find1.getName());
	Person find2 = entityManager2.find(Person.class, 1);
	System.out.println("person id: "+find2.getId());
	System.out.println("person name: "+find2.getName());
//	Person person2 = new Person();
//	person2.setName("kirti");
//	person2.setMobile(123456789);
//	person2.setGender(true);
//	Person find1 = entityManager.find(Person.class, 2);
//    System.out.println(find1.getId());
//    System.out.println(find1.getName());
//    Person find2 = entityManager.find(Person.class, 2);
//    find2.setName("Shruti");
//    System.out.println(find2.getId());
//    System.out.println(find2.getName());
//	entityTransaction.begin();
//	entityManager.persist(find);
//	entityManager1.persist(person1);
//	entityManager.persist(person2);
//	entityManager.merge(find2);
//	entityTransaction.commit();
//	Person findUpdate = entityManager.find(Person.class, 2);
//	 System.out.println(findUpdate.getId());
//	 System.out.println(findUpdate.getName());
//	Student student1 = new Student();
//	student1.setId(1);
//	student1.setName("Karishma");
//	student1.setEmail("karishmadatt2000@gmail.com");
//	student1.setMobile_number(43343);
//	
//	Subject sub1=new Subject();
//	sub1.setId(1);
//	sub1.setName("Java");
//	sub1.setTrainer("avd");
//	sub1.setDescription("Java_Trainer");
//	
//	Subject sub2=new Subject();
//	sub2.setId(2);
//	sub2.setName("JavaScript");
//	sub2.setTrainer("abc");
//	sub2.setDescription("JavaScript_Trainer");
//	
//	List<Subject> subjects = new ArrayList<Subject>();
//	subjects.add(sub1);
//	subjects.add(sub2);
//	student1.setSubjects(subjects);
//	entityTransaction.begin();
//	entityManager.persist(student1);
//	entityManager.persist(sub1);
//	entityManager.persist(sub2);
//	entityTransaction.commit();
	
	//considering we have subject already existing in subject table now if I want to add new a student and assign  available subject
    
	
}
}
