package com.jsp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.model.AdharCard;
import com.jsp.model.Person;

public class Test {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Person person = new Person();
	AdharCard adharcard = new AdharCard();
	
	person.setP_id(1);
	person.setName("karishma");
		
	adharcard.setE_id(343243);
	adharcard.setAdhar_number(565440935);
	adharcard.setMobile_number(234341234);
	adharcard.setName("karishma_datt");
	adharcard.setAddress("adfldkjfda");
	person.setAdharCard(adharcard);

	
	
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(adharcard);
	entityTransaction.commit();
}
}
