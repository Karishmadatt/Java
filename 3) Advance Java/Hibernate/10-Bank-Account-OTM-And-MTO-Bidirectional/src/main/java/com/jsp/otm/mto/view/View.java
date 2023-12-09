package com.jsp.otm.mto.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.otm.mto.controller.Controller;
import com.jsp.otm.mto.model.Account;
import com.jsp.otm.mto.model.Bank;

public class View {
public static void main(String[] args) {
	do {
		System.out.println("1.Insert\n2.Read\n3.Update\n4.Delete");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		Bank bank = new Bank();
		Account account = new Account();
		Controller controller = new Controller();
		switch(ch) {
		case 1:
			System.out.println("1.Add Bank\n2.Add Account in the Bank");
			int ch1 = sc.nextInt();
			if(ch1==1) {
//				List<Bank> bank_list = new ArrayList<>();
//				System.out.println("How many Bank you want to add?");
//				int n = sc.nextInt();
				
//				while(n>0) {
//					Bank bank1 = new Bank();
//					System.out.println("Enter the Bank Id: ");
//					int bank_id = sc.nextInt();
//					System.out.println("Enter Bank name: ");
//					String bank_name = sc.next();
//					System.out.println("Enter the location: ");
//					String bank_location = sc.next();
//					bank1.setId(bank_id);
//					bank1.setName(bank_name);
//					bank1.setLocation(bank_location);
//					bank_list.add(bank1);
//					if(controller.add_bank(bank1.getId(), bank1)) {
//						System.out.println("Bank Added Successfully");
//					}else {
//						System.out.println("Please try later");
//					}
//					n--;
//				}
//			}else if(ch1==2) {
//				System.out.println("How many account you want to add");
//				int n = sc.nextInt();
//				List<Account> account_list = new ArrayList<>();
//				while(n>0) {
//					Account account1 = new Account();
//					System.out.println("Enter the Account Id: ");
//					int account_id = sc.nextInt();
//					System.out.println("Enter the name: ");
//					String account_holder_name = sc.next();
//					System.out.println("Enter the balance: ");
//					double account_balance = sc.nextDouble();
//					account1.setId(account_id);
//					account1.setAccount_holder_name(account_holder_name);
//					account1.setBalance(account_balance);
//					account1.setBank(bank);
//					
//					bank.setAccounts(account_list);
//					if(controller.add_account(n, bank, account_id, account1)) {
//						System.out.println("Account added successfully");
//					}else {
//						System.out.println("please try later");
//					}
//				}
				Bank bank1 = new Bank();
				System.out.println("Enter the Bank Id: ");
				int bank_id = sc.nextInt();
				System.out.println("Enter Bank name: ");
				String bank_name = sc.next();
				System.out.println("Enter the location: ");
				String bank_location = sc.next();
				bank1.setId(bank_id);
				bank1.setName(bank_name);
				bank1.setLocation(bank_location);
				
				System.out.println("How many account you want to add");
				int n = sc.nextInt();
				List<Account> account_list = new ArrayList<>();
				while(n>0) {
					Account account1 = new Account();
					System.out.println("Enter the Account Id: ");
					int account_id = sc.nextInt();
					System.out.println("Enter the name: ");
					String account_holder_name = sc.next();
					System.out.println("Enter the balance: ");
					double account_balance = sc.nextDouble();
					account1.setId(account_id);
					account1.setAccount_holder_name(account_holder_name);
					account1.setBalance(account_balance);
					account1.setBank(bank1);
					account_list.add(account1);
					bank1.setAccounts(account_list);
					if(Controller.add_account(n, account_id, account1)) {
						System.out.println("Account added successfully");
					}else {
						System.out.println("please try later");
					}
					n--;
	
			}
				}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}while(true);
}
}
