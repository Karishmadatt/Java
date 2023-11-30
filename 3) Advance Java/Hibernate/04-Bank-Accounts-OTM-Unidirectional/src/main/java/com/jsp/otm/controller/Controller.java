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
	static Account acc=new Account();
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
	public Bank findBank(int id)
	{
		return entityManager.find(Bank.class, id);
	}
	public Account findAccount(int id) {
//		List<Account> a = bank.getAccounts();
		return entityManager.find(Account.class, id);

	}
	public boolean updateAccName(int id,String name) {
		Account findacc=findAccount(id);
       if(findacc!=null) {
    	   findacc.setName(name);
    	   entityTransaction.begin();
    	   entityManager.merge(acc);
    	   entityTransaction.commit();
    	   return true;
       }
       return false;
	}
	
	public boolean updateAccContactNo(int id,long no) {
		Account findacc=findAccount(id);
       if(findacc!=null) {
    	   findacc.setContact(no);
    	   entityTransaction.begin();
    	   entityManager.merge(acc);
    	   entityTransaction.commit();
    	   return true;
       }
       return false;
	}
	
	public boolean updateAccBalance(int id,double balance) {
		Account findacc=findAccount(id);
       if(findacc!=null) {
    	   findacc.setBalance(balance);
    	   entityTransaction.begin();
    	   entityManager.merge(acc);
    	   entityTransaction.commit();
    	   return true;
       }
       return false;
	}
	
	public boolean remove(int id,Bank bk) {
		if(findBank(id)!=null) {
			List<Account> accounts = bk.getAccounts();
			entityTransaction.begin();
			entityManager.remove(bk);
			for (Account account : accounts) {
				entityManager.remove(account);
			}
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public boolean removeAcc(int id,Bank bk) {
		if(findAccount(id)!=null) {
			List<Account> accounts = bk.getAccounts();
			System.out.println(accounts);
			entityTransaction.begin();
			for (Account acc : accounts) {
				if(acc.getId()==id) {
					entityManager.remove(acc);
					entityTransaction.commit();
					return true;
				}
			}
			
		}
		return false;

	}

}
