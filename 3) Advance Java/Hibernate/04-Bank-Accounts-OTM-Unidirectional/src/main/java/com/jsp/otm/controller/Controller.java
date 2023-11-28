package com.jsp.otm.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otm.model.Account;
import com.jsp.otm.model.Bank;

public class Controller {
	static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pgadmin");
	static EntityManager entityManager=entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction=entityManager.getTransaction();
	public boolean addBankandAccounts(Bank bank,List<Account>accounts)
	{
		if (bank!=null && accounts!=null) {
			entityTransaction.begin();
			entityManager.persist(bank);
			for(Account account:accounts)
			{
				entityManager.persist(account);
			}
			entityTransaction.commit();
			return true;
		} 
		return false;
	}
	public Bank findBank(Object primaryKey)
	{
		return entityManager.find(Bank.class, primaryKey);
	}
}
