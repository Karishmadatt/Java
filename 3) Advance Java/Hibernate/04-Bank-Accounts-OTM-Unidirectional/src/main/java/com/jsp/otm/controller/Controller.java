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
	static Bank bank = new Bank();
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
	public Account findAccount(int id) {
		List<Account> accounts = bank.getAccounts();
		return entityManager.find(Account.class, id);

	}
	public boolean updatename(int id,String name) {
       if(findBank(id)!=null) {
    	   bank.setName(name);
    	   entityTransaction.begin();
    	   entityManager.merge(bank);
    	   entityTransaction.commit();
    	   return true;
       }
       return false;
	}
	
	public boolean remove(int id) {
		if(findBank(id)!=null) {
			List<Account> accounts = bank.getAccounts();
			entityTransaction.begin();
			entityManager.remove(bank);
			for (Account account : accounts) {
				entityManager.remove(account);
			}
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
