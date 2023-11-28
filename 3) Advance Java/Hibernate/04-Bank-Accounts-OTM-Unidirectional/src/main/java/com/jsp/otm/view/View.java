package com.jsp.otm.view;

import java.util.ArrayList;
import java.util.List;

import com.jsp.otm.controller.Controller;
import com.jsp.otm.model.Account;
import com.jsp.otm.model.Bank;

public class View {
	static Controller controller = new Controller(); 
	public static void main(String[] args) {
		
		Bank sbi = new Bank();
		sbi.setId(1);
		sbi.setName("SBI");
		sbi.setBacontact(1233444);
		sbi.setHeadquaters("Mumbai");
		
		Account account1=new Account();
		account1.setId(11);
		account1.setName("Shubham");
		account1.setAccount_number(123344);
		account1.setContact(1233244);
		account1.setBalance(300.44);
		
		Account account2=new Account();
		account2.setId(22);
		account2.setName("Vaibhav");
		account2.setAccount_number(1238944);
		account2.setContact(13244);
		account2.setBalance(400.44);
		
		Account account3=new Account();
		account3.setId(33);
		account3.setName("Aakash");
		account3.setAccount_number(45678);
		account3.setContact(678678);
		account3.setBalance(500.44);
		
		
		ArrayList<Account> accounts=new ArrayList<Account>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
		sbi.setAccounts(accounts);
		
		if (controller.addBankandAccounts(sbi, accounts)) {
			System.out.println("Data Inserted");
		} else {
			System.out.println("Unable to insert data");
		}
		
		
		
		
		Bank findBank = controller.findBank(1);
		if (findBank!=null) {
			System.out.println(findBank.getId());
			System.out.println(findBank.getName());
			System.out.println(findBank.getHeadquaters());
			System.out.println(findBank.getBacontact());
			List<Account> accounts2 = findBank.getAccounts();
			
			for (Account accounts3 : accounts2) {
				System.out.println(accounts3.getId());
				System.out.println(accounts3.getName());
				System.out.println(accounts3.getBalance());
				System.out.println(accounts3.getContact());
				System.out.println(accounts3.getAccount_number());
			}
		}
		
	}
}
