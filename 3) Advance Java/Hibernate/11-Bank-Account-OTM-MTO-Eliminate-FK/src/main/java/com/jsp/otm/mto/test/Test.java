package com.jsp.otm.mto.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otm.mto.model.Account;
import com.jsp.otm.mto.model.Bank;

public class Test {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
    Bank bank = new Bank();
//   bank.setId(1);
//   bank.setName("SBI");
//   bank.setLocation("Virar");
   
//   Account account = new Account();
//   List<Account> accounts = new ArrayList<Account>();
//   account.setId(100);
//   account.setAccount_holder_name("karishma");
//   account.setBalance(15000);
//   account.setBank(bank);
//   accounts.add(account);
//   bank.setAccounts(accounts);
//   
//   entityTransaction.begin();
//   entityManager.persist(bank);
//   entityManager.persist(account);
//   entityTransaction.commit();
//   
//   Bank find = entityManager.find(Bank.class, 1);
//   System.out.println("Bank id"+find.getId());
//   System.out.println("Bank name"+find.getName());
//   System.out.println("Bank location: "+find.getLocation());
//   
//   List<Account> accounts2 = find.getAccounts();
//   for (Account account3 : accounts2) {
//	System.out.println("account id: "+account3.getId());
//	System.out.println("account holder name: "+account3.getAccount_holder_name());
//	System.out.println("account balance: "+account3.getBalance());
	
//}
   
   
    
}
}
