package com.jsp.oto.view;

import java.util.Scanner;

import com.jsp.oto.controller.controller;
import com.jsp.oto.model.car;
import com.jsp.oto.model.engine;

public class view {
  public static void main(String[] args) {
	controller control = new controller();
	car c = new car();
	engine e = new engine();
	do {
		controller con = new controller();
		car car = new car();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Insert\n2.Update\n3.Read\n4.Delete\n5.Exit");
		int userchoice=sc.nextInt();
		switch(userchoice) {
			case 1:
				System.out.println("Enter car id: ");
				System.out.println();
				int id = sc.nextInt();
				System.out.println("Enter car name: ");
				String name = sc.next();
				System.out.println();
				System.out.println("Enter the cost: ");
				System.out.println();
				int cost = sc.nextInt();
				System.out.println("Enter Chassis no: ");
				System.out.println();
				String chassis = sc.next();
				System.out.println("Enter Cc: ");
				int cc = sc.nextInt();
				System.out.println();
			    System.out.println("Enter engine id: ");
			    int e_id = sc.nextInt();
			    System.out.println();
			    System.out.println("Enter no of cylinder: ");
			    int cylinder = sc.nextInt();
			    System.out.println();
				   c.setId(id);
				   c.setCar_name(name);
				   c.setCost(cost);
				   c.setChassis(chassis);
				   e.setCc(cc);
				   e.setId(e_id);
				   e.setNo_of_cylinder(cylinder);
				   c.setEng(e);
				   control.insert(c, e); 
				   System.out.println("Insert Successfully!");
				break;
			case 2:
				System.out.println("What you want to update?");
				System.out.println("Enter the id: ");
				System.out.println();
				int input_id = sc.nextInt();
				if(con.find(input_id)!=null) {
                	System.out.println("The car id does not exit");
                	System.out.println();
                }else {

				System.out.println("1.Car\n2.Engine");
				int choice = sc.nextInt();
				if(choice==1) {
					System.out.println("What you want to update in the car?");
					System.out.println("1.Id\n2.name\n3.cost\n4.chassis");
					int c1 = sc.nextInt();
	              switch(c1) {
					case 1:
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
				}else if(choice==2) {
					
				}
                }
				break;
			case 3:
				System.out.println("Enter the id: ");
				int input = sc.nextInt();
				car = con.find(input);
            
				break;
			case 4:
				System.out.println("Enter the id: ");
//				System.out.println();
				int input_id1 = sc.nextInt();
				car = con.find(input_id1);
				if(car!=null) {
					con.remove(car);
					System.out.println("Deleted Successfully");
				}else {
					System.out.println("Id does not exist");
				}
				
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid Choice");
		}

	}
	while(true);
	   	   
	   
}

}
