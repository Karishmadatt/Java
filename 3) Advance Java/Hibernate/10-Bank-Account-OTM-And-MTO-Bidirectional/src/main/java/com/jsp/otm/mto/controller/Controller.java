package com.jsp.otm.mto.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otm.mto.model.Account;
import com.jsp.otm.mto.model.Bank;

public class Controller {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
   
	public static boolean add_bank(int bank_id , Bank bank) {
		if(bank!=null) {
            entityTransaction.begin();
            entityManager.persist(bank);
            entityTransaction.commit();
            return true;
		}
		return false;
	}
	
	public static boolean add_account(int bank_id ,int account_id , Account account) {
		Bank find_bank = find_bank(bank_id);
		if(find_bank!=null && account!=null) {
            entityTransaction.begin();
            entityManager.persist(account);
            entityTransaction.commit();
            return true;
		}
		return false;
	}

	public static Bank find_bank(int bank_id) {
		return entityManager.find(Bank.class, bank_id);
		
	}
//	public static Bank update(Bank bank) {
//		.
//	}

}
