package com.jsp.otm.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.otm.controller.Controller;
import com.jsp.otm.model.Account;
import com.jsp.otm.model.Bank;

public class View {
	static Controller controller = new Controller(); 
	public static void main(String[] args) {
		Scanner myInput=new Scanner(System.in);
//		System.out.println("===========Welcome To ABC Bank Management System============");
		boolean flag=true;
		do {
			List<Account> accounts=new ArrayList<Account>();
			System.out.println("1.Insert\n2.Read\n3.Update\n4.Delete\n0.Exit");
			System.out.print("Enter your choice:");
			byte userChoice=myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				flag=false;
				break;
			case 1:
				System.out.print("Enter Bank ID:");
				int bank_id=myInput.nextInt();
				myInput.nextLine();
				System.out.print("Enter Bank Name:");
				String bank_name=myInput.nextLine();
				System.out.print("Enter Bank Headquater's Location:");
				String bank_location=myInput.nextLine();
				System.out.print("Enter Bank's Contact Number:");
				long bank_contact=myInput.nextLong();
				myInput.nextLine();
				Bank sbi = new Bank();
				sbi.setId(bank_id);
				sbi.setName(bank_name);
				sbi.setBacontact(bank_contact);
				sbi.setHeadquaters(bank_location);
				System.out.println("How Many Accounts you want to insert:");
				int insert_account=myInput.nextInt();
				myInput.nextLine();
				while (insert_account!=0) {
					Account account1=new Account();
					
					System.out.println("Enter Account ID:");
					int account_id=myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter Account Number:");
					long account_number=myInput.nextLong();
					myInput.nextLine();
					System.out.println("Enter Account Holder Name:");
					String account_holder_name=myInput.nextLine();
					System.out.println("Enter Account Balance:");
					double account_balance=myInput.nextDouble();
					myInput.nextLine();
					System.out.println("Enter Account Holder's Contact Number:");
					long account_contact_no=myInput.nextLong();
					myInput.nextLine();
					account1.setId(account_id);
					account1.setName(account_holder_name);
					account1.setAccount_number(account_number);
					account1.setContact(account_contact_no);
					account1.setBalance(account_balance);
					
					accounts.add(account1);
					System.out.println(accounts);
					sbi.setAccounts(accounts);
					if (controller.addBankandAccounts(sbi, accounts)) {
						System.out.println("Data Inserted");
					} else {
						System.out.println("Unable to insert data");
					}
					insert_account--;					
				}
				
				break;
			case 2:
				System.out.println("Enter the Bank id : ");
				int id = myInput.nextInt();
				Bank findBank = controller.findBank(id);
				if (findBank!=null) {
					System.out.println("What you want to read?");
					System.out.println("1.Bank Name\n2.Bank Headquater's\n3.Bank Contact Number\n4.Bank Accounts\n");
					int ch = myInput.nextInt();
					if(ch==1) {
						System.out.println("Bank Name:"+findBank.getName());

					}else if(ch==2) {
						System.out.println("Bank Headquater's Location:"+findBank.getHeadquaters());
					}else if(ch==3) {
						System.out.println("Bank Contact Number:"+findBank.getBacontact());
					}else if(ch==4) {
                          List<Account> accounts2 = findBank.getAccounts();
						
						
						for (Account accounts3 : accounts2) {
							System.out.println("Account ID:"+accounts3.getId());
							System.out.println("Account Number"+accounts3.getAccount_number());
							System.out.println("Account Name:"+accounts3.getName());
							System.out.println("Account Balance:"+accounts3.getBalance());
							System.out.println("Account Contact:"+accounts3.getContact());
						}

					}
		
				}
				break;

			case 3:
				System.out.println("Enter the Bank Id: ");
				int id2=myInput.nextInt();
				System.out.println("Enter the Account id: ");
				int acc_id1=myInput.nextInt();
				System.out.println("What you want to update?");
				System.out.println("1.Account Holder Name\n2.Contact Number\n3.Balance\n");
				int ch = myInput.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter the name: ");
					String name = myInput.next();
					if(controller.findAccount(acc_id1)!=null) {
						controller.updateAccName(acc_id1, name);
							System.out.println("Name is updated Successfully");
					}else {
						System.out.println("Account Id is Invalid");
					}
					break;
				case 2:
					System.out.println("Enter the Contact Number: ");
					long no=myInput.nextLong();
					if(controller.findAccount(acc_id1)!=null) {
						controller.updateAccContactNo(acc_id1, no);
							System.out.println("Contact No is updated Successfully");
						
					}else {
						System.out.println("Account Id is Invalid");
					}
					break;
				case 3:
					System.out.println("Enter the Balance : ");
					double bal = myInput.nextDouble();
					if(controller.findAccount(acc_id1)!=null) {
						controller.updateAccBalance(acc_id1, bal);
							System.out.println("Balance is updated successfully");
						
					}else {
						System.out.println("Account Id is Invalid");
					}

				default:
					break;
				}
	
				break;

			case 4:
			    System.out.println("Enter the Bank ID: ");
			    int id1 = myInput.nextInt();
				Bank findBank1 = controller.findBank(id1);
				if(findBank1!=null) {
					System.out.println("Enter the Account ID: ");
					int acc_id = myInput.nextInt();
				    Account acc= controller.findAccount(acc_id);
				    if(acc!=null) {
				     controller.removeAcc(acc_id,findBank1);
				    	System.out.println("Account delete Successfully");
				    }else {
				    	System.out.println("Account not deleted");
				    }
//					if(controller.remove(id1,findBank1)) {
//						System.out.println("Bank id deleted successfully");
//					}else {
//						System.out.println("Error");
//					}

				}else {
					System.out.println("Bank does not exist");
				}
				
	
				break;

			default:
				break;
			}
			
		} while (flag);	
			
		}
	
	}



