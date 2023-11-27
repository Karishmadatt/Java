package com.jsp.oto.view;

import java.util.Scanner;

import com.jsp.oto.controller.controller;
import com.jsp.oto.model.car;
import com.jsp.oto.model.engine;

public class view {
	static controller con = new controller();
	static car c = new car();
	static engine e = new engine();
	static void fun() {
		Scanner sc=new Scanner(System.in);
		int s;
		System.out.println("1.Car name\n2.Car cost\n3.Car Chassis no\n4.About Engine");
		int input1=sc.nextInt();
		switch(input1) {
		case 1:
			System.out.println("Car name is : "+c.getCar_name());
			System.out.println("Want to read more?");
			System.out.println("1.Yes\n2.No\n");
			s=sc.nextInt();
			if(s==1) {
				fun();
			}
			break;
		case 2:
			System.out.println("Car cost is : "+c.getCost());
			System.out.println("Want to read more?");
			System.out.println("1.Yes\n2.No\n");
			s=sc.nextInt();
			if(s==1) {
				fun();
			}
			break;
		case 3:
			System.out.println("Car Chassis no is : "+c.getChassis());
			System.out.println("Want to read more?");
			System.out.println("1.Yes\n2.No\n");
			s=sc.nextInt();
			if(s==1) {
				fun();
			}
			break;
		case 4:
			System.out.println("want to know more about car engine?");
			System.out.println("1.Engine id\n2.Engine cc\n3.Engine Cylinder\n");
			int input2=sc.nextInt();
			if(input2==1) {
				System.out.println("Engine id is : "+e.getId());
				System.out.println("Want to read more?");
				System.out.println("1.Yes\n2.No\n");
				s=sc.nextInt();
				if(s==1) {
					fun();
				}
			}
			else if(input2==2) {
				System.out.println("Engine cc is : "+e.getCc());
				System.out.println("Want to read more?");
				System.out.println("1.Yes\n2.No\n");
				s=sc.nextInt();
				if(s==1) {
					fun();
				}
			}
			else if(input2==3) {
				System.out.println("No of Cylinder in engine is : "+e.getNo_of_cylinder());
				System.out.println("Want to read more?");
				System.out.println("1.Yes\n2.No\n");
				s=sc.nextInt();
				if(s==1) {
					fun();
				}
			}
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
  public static void main(String[] args) {
		do {
		int s;
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
				   con.insert(c, e); 
				   System.out.println("Insert Successfully!");
				break;
			case 2:
				System.out.println("Enter the id: ");
				System.out.println();
				int input_id = sc.nextInt();
				if(con.find(input_id)==null) {
                	System.out.println("The car id does not exit");
                	System.out.println();
                }else {
				boolean check;
					System.out.println("What you want to update in the car?");
					System.out.println("1.name\n2.cost\n3.chassis\n4.Engine cc\n5.Want to go back?\n");
					int c1 = sc.nextInt();
	              switch(c1) {
					case 1:
						System.out.println("Enter the name");
						String updatename = sc.next();
						check=con.updatename(input_id,updatename);
						if(check) {
							System.err.println("Car name is updated successfully!");
						}else {
							System.out.println("Error caused during the updation of the car name");
						}
						break;
					case 2:
						System.out.println("Enter cost");
						double updatecost = sc.nextInt();
						check=con.updatecost(input_id, updatecost);
						if(check) {
							System.out.println("Car cost is updated successfully!");
						}else {
							System.out.println("Error caused during the updation of the car cost");
						}
						break;
					case 3:
						System.out.println("Enter Chassis no");
						String updatechassis = sc.next();
						check=con.updatechassis(input_id, updatechassis);
						if(check) {
							System.out.println("Car chassis no is updated successfully!");
						}else {
							System.out.println("Error caused during the updation of the car chassis no");
						}
						break;
					case 4:
						System.out.println("Enter cc ");
						double updatedcc = sc.nextDouble();
						check=con.updatecc(input_id, updatedcc);
						if(check) {
							System.out.println("Engine cc is updated successfully!");
						}else {
							System.out.println("Error caused during the updation of the engine cc");
						}

						break;
					case 5:
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
                }
				break;
			case 3:
				System.out.println("Enter the id: ");
				int input = sc.nextInt();
				c = con.find(input);
				if(c!=null) {
					System.out.println("Please tell what do you want to read?");
					System.out.println("1.Car name\n2.Car cost\n3.Car Chassis no\n4.About Engine\n5.Want to go back?\n");
					int input1=sc.nextInt();
					switch(input1) {
					case 1:
						System.out.println("Car name is : "+c.getCar_name());
						System.out.println("What to read more?");
						System.out.println("1.Yes\n2.No\n");
	                     s=sc.nextInt();
						if(s==1) {
							fun();
						}
						break;
					case 2:
						System.out.println("Car cost is : "+c.getCost());
						System.out.println("1.Yes\n2.No\n");
						s=sc.nextInt();
						if(s==1) {
							fun();
						}
						break;
					case 3:
						System.out.println("Car Chassis no is : "+c.getChassis());
						System.out.println("Want to read more?");
						System.out.println("1.Yes\n2.No\n");
						s=sc.nextInt();
						if(s==1) {
							fun();
						}
						break;
					case 4:
						System.out.println("Want to know more about car engine?");
						System.out.println("1.Engine id\n2.Engine cc\n3.Engine Cylinder\n");
						int input2=sc.nextInt();
						if(input2==1) {
							System.out.println("Engine id is : "+e.getId());
							System.out.println("1.Yes\n2.No\n");
							s=sc.nextInt();
							if(s==1) {
								fun();
							}
						}
						else if(input2==2) {
							System.out.println("Engine cc is : "+e.getCc());
							System.out.println("What to read more?");
							System.out.println("1.Yes\n2.No\n");
							s=sc.nextInt();
							if(s==1) {
								fun();
							}
						}
						else if(input2==3) {
							System.out.println("No of Cylinder in engine is : "+e.getNo_of_cylinder());
							System.out.println("What to read more?");
							System.out.println("1.Yes\n2.No\n");
							s=sc.nextInt();
							if(s==1) {
								fun();
							}
						}
						break;
					case 5:
						break;
					default:
						System.out.println("Invalid Choice");
						break;
					}
				}else {
					System.out.println("Sorry,Car does not exist");
				}
            
				break;
				
			case 4:
				System.out.println("1.Sorry,I don't want to delete please go back.\n2.Delete");
				int ch = sc.nextInt();
				switch(ch) {
				case 1:
					break;
				case 2:
					System.out.println("Enter the id: ");
					int input_id1 = sc.nextInt();
					c = con.find(input_id1);
					if(c!=null) {
						con.remove(c);
						System.out.println("Deleted Successfully");
					}else {
						System.out.println("Id does not exist");
					}
					
					break;	
				}
				
				break;
			case 5:
				System.out.println("Terminated!!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
		}

	}
	while(true);
	   	   
	   
}

}
