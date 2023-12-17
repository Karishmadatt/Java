package com.jsp.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.controller.Controller;
import com.jsp.model.Department;
import com.jsp.model.Employee;
import com.jsp.model.Project;

public class View {
	static Controller controller = new Controller(); 
//	static Employee employee = new Employee();
//	static Department department = new Department();
//	static Project project = new Project();
	public static void main(String[] args) {
		Scanner myInput=new Scanner(System.in);
//		System.out.println("===========Welcome To Employee Management System============");
		boolean flag=true;
		do {
			System.out.println("1.Insert\n2.Read\n3.Update\n4.Delete\n0.Exit");
			System.out.print("Enter your choice:");
			byte userChoice=myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				flag=false;
				break;
			case 1:
				System.out.println("What you want to insert?");
				System.out.println("1.Employee\n2.Department\n3.Project\n");
				int choice = myInput.nextInt();
				if(choice==1) {
					int count=0;
					System.out.println("How many employee you want to insert?");
					count = myInput.nextInt();
					while(count>0) {
						
						//Taking the employee details from user
						
						Employee employee = new Employee();
						System.out.print("Enter Employee Name:");
						String employee_name=myInput.next();
						myInput.nextLine();
						System.out.print("Enter the Employee Salary:");
						double employee_salary=myInput.nextDouble();
						myInput.nextLine();
						System.out.print("Enter Employee Position: ");
						String position=myInput.next();
						myInput.nextLine();
						System.out.println("Enter the joining date of employee: ");
						String doj = myInput.next();
						myInput.nextLine();
						
						//setting all the employee details
						employee.setName(employee_name);
						employee.setPosition(position);
						employee.setSalary(employee_salary);
						employee.setDateOfJoining(doj);
						
						//Adding all the employee details in employee list
						List<Employee> employee_list = new ArrayList<>();
						employee_list.add(employee);
						
						if(Controller.addEmployee(employee)) {
							System.out.println("Employee detail added successfully");
						}else {
							System.out.println("Please try later");
						}
						
						count--;
					}

				}
				else if(choice==2) {
					
					//Adding department detail
					System.out.println("How many department you want to add?");
					int count = myInput.nextInt();
					while(count>0) {
						
						Department department = new Department();
						System.out.println("Enter Department name: ");
						String department_name = myInput.next();
						myInput.nextLine();
						
						//Setting the department name
						department.setName(department_name);
					    
						if(Controller.addDepartment(department)) {
							System.out.println("Department added successfully");
						}else {
							System.out.println("Please try later");
						}

						
						count--;
					}
									}
				else if(choice==3) {
					
					//Add project detail
					System.out.println("Enter Project name: ");
					String project_name = myInput.next();
					myInput.nextLine();
					System.out.println("Enter Project description: ");
					String project_description = myInput.next();
					myInput.nextLine();
					
					//setting project details
					Project project = new Project();
					project.setName(project_name);
					project.setDescription(project_description);
					
					//Adding the project in the project_list
					List<Project> project_list = new ArrayList<>();
					project_list.add(project);
					if(Controller.addProject(project)) {
						System.out.println("Project added successfully");
					}else {
						System.out.println("Please try later");
					}
					
				}
				
				break;
			case 2:
				Employee employee = new Employee();
				System.out.println("Want you want to read?");
				System.out.println("1.Employee Detail\n2.Department Detail\n3.Project Detail\n");
				int choice2 = myInput.nextInt();
				if(choice2==1) {
					System.out.println("1.Want all employee detail\n2.Want particular employee detail\n");
					int ch = myInput.nextInt();
					if(ch==1) {
						List<Employee> fetchAllEmployee = Controller.fetchAllEmployee();
						for (Employee employee1 : fetchAllEmployee) {
							System.out.println("Employee id: "+employee1.getId());
							System.out.println("Employee name: "+employee1.getName());
							System.out.println("Employee position: "+employee1.getPosition());
							System.out.println("Employee salary: "+employee1.getSalary());
							System.out.println("Employee Date Of Joining: "+employee1.getDateOfJoining());
						}
					}else if(ch==2) {
						System.out.println("Enter the employee id: ");
						int e_id = myInput.nextInt();
						Employee findEmployee = Controller.findEmployee(employee, e_id);
						if(findEmployee!=null) {
							System.out.println("Employee id: "+findEmployee.getId());
							System.out.println("Employee name: "+findEmployee.getName());
							System.out.println("Employee position: "+findEmployee.getPosition());
							System.out.println("Employee salary: "+findEmployee.getSalary());
							System.out.println("Employee Date Of Joining: "+findEmployee.getDateOfJoining());
						}else {
							System.out.println("please try later");
						}
					}
				}
				else if(choice2==2) {
					Department department = new Department();
					System.out.println("1.Want all Department detail\n2.Want particular Department detail\n");
					int ch = myInput.nextInt();
					if(ch==1) {
						List<Department> fetchAllDepartment = Controller.fetchAllDepartment();
						for (Department department1 : fetchAllDepartment) {
							System.out.println("Employee id: "+department1.getId());
							System.out.println("Employee name: "+department1.getName());
						}
					}else if(ch==2) {
						System.out.println("Enter the department id: ");
						int d_id = myInput.nextInt();
						Department finddepartment = Controller.findDepartment(department, d_id);
						if(finddepartment!=null) {
							System.out.println("Employee id: "+finddepartment.getId());
							System.out.println("Employee name: "+finddepartment.getName());
							
						}else {
							System.out.println("please try later");
						}
					}
					
				}
				else if(choice2==3) {
					Project project = new Project();
					System.out.println("1.Want all Project detail\n2.Want particular project detail\n");
					int ch = myInput.nextInt();
					if(ch==1) {
						List<Project> fetchAllProject = Controller.fetchAllProject();
						for (Project project1 : fetchAllProject) {
							System.out.println("Project id: "+project1.getId());
							System.out.println("Project name: "+project1.getName());
							System.out.println("Project Description: "+project1.getDescription());
						}
					}else if(ch==2) {
						System.out.println("Enter the project id: ");
						int p_id = myInput.nextInt();
						Project findProject = Controller.findProject(project, p_id);
						if(findProject!=null) {
							System.out.println("Project id: "+findProject.getId());
							System.out.println("Project name: "+findProject.getName());
							System.out.println("Project position: "+findProject.getDescription());
							
						}else {
							System.out.println("please try later");
						}
					}
				}
				break;

			case 3:
				Employee employee1 = new Employee();
				Department department1 = new Department();
				Project project1 = new Project();
				System.out.println("What you want to update?");
				System.out.println("1.Employee\n2.Department\n3.Project");
				int ch1 = myInput.nextInt();
				if(ch1==1) {
					
					System.out.println("1.Want to update employee details?\n2.Want to assign department to employee?\n3.Want to assign project to employee?\n4.Want to change department of employee?\n5.Want to change project of employee?");
					int ch2 = myInput.nextInt();
					switch(ch2) {
						case 1:
							System.out.println("1.Update Employee name\n2.Update Employee Position\n3.Update Employee Salary\n");
							int ch3=myInput.nextInt();
							System.out.println("Enter employee id: ");
							int e_id = myInput.nextInt();

							if(ch3==1) {
								System.out.println("Enter the updated name: ");
								Object e_name = myInput.next();
								if(Controller.updateEmployeeDetail(e_id,e_name,employee1,ch3)) {
									System.out.println("Employee name is updated successfully");
								}else {
									System.out.println("please try later");
								}
							}else if(ch3==2) {
								System.out.println("Enter the updated employee position: ");
								Object e_position = myInput.next();
								if(Controller.updateEmployeeDetail(e_id,e_position,employee1,ch3)) {
									System.out.println("Employee position is updated successfully");
								}else {
									System.out.println("Please try later");
								}
								
							}else if(ch3==3) {
								System.out.println("Enter the updated employee salary: ");
								Object e_salary = myInput.next();
								if(Controller.updateEmployeeDetail(e_id,e_salary,employee1,ch3)) {
									System.out.println("Employee salary is updated successfully");
								}else {
									System.out.println("Please try later");
								}
								
							}
							break;
						case 2:
					            System.out.println("Enter the employee id: ");
						    	int e_id1 = myInput.nextInt();
						    	System.out.println("Enter the department id: ");
						    	int d_id = myInput.nextInt();
						    	Employee findEmployee = Controller.findEmployee(employee1, e_id1);
						    	Department findDepartment = Controller.findDepartment(department1, d_id);
						    	String d_name = findDepartment.getName();
						    	String e_name = findEmployee.getName();
						    	if(Controller.assignDepartment(d_id,e_id1,findDepartment,employee1)) {
						    		System.out.println("Department "+d_name+" is assign to employee "+e_name+" successfully");
						    	}else {
						    		System.out.println("please try later");
						    	}
						    
							break;
						case 3:
							System.out.println("Enter the employee id: ");
					    	int e_id2 = myInput.nextInt();
					    	System.out.println("Enter the department id: ");
					    	int d_id2=myInput.nextInt();
							System.out.println("Enter the project id: ");
							int p_id = myInput.nextInt();
							Employee findEmployee2 = Controller.findEmployee(employee1, e_id2);
							Department findDepartment2 = Controller.findDepartment(findEmployee2.getDepartment(), d_id2);
							Project findProject = Controller.findProject(project1,  p_id);
							if(Controller.assignProject(employee1,e_id2,d_id2,p_id,project1)) {
								System.out.println("Project "+findProject.getName()+" is assign to employee "+findEmployee2.getName()+" of department "+findDepartment2.getName());
							}else {
								System.out.println("Please try later");
							}
							
							break;
						case 4:
							System.out.println("Enter the employee id: ");
					    	int e_id3 = myInput.nextInt();
                            System.out.println("Enter the department id: ");
							int d_id1 = myInput.nextInt();
							System.out.println("Enter the new department id: ");
							int new_d_id = myInput.nextInt();
							if(Controller.changeDepartment(employee1,e_id3,department1,d_id1,new_d_id)) {
								System.out.println("Department of employee is change");
								
							}else {
								System.out.println("please try later");
							}
							
							break;
						case 5:
							System.out.println("Enter the employee id: ");
					    	int e_id4 = myInput.nextInt();
                            System.out.println("Enter the department id: ");
							int d_id3 = myInput.nextInt();
							System.out.println("Enter the project id: ");
							int p_id1 = myInput.nextInt();
							System.out.println("Enter the new project id: ");
							int new_p_id1 = myInput.nextInt();
							Employee findEmployee3 = Controller.findEmployee(employee1, e_id4);
							Project findProject2 = Controller.findProject(project1, p_id1);
							if(Controller.changeProject(employee1,e_id4,d_id3,project1,p_id1,new_p_id1)) {
								System.out.println("project of employee "+findEmployee3.getName() + " is change from "+findProject2.getName()+" to "+Controller.findProject(project1, new_p_id1).getName());
								
							}else {
								System.out.println("please try later");
							}
							break;
						default:
							System.out.println("Invalid choice");
							break;
					}
					
					
				}else if(ch1==2) {
					System.out.println("Enter the department id: ");
					int d_id = myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter the updated department name");
					String d_name = myInput.next();
					myInput.nextLine();
					if(Controller.updateDepartment(department1,d_name,d_id)) {
						System.out.println("Department name updated successfully");
					}else {
						System.out.println("please try later");
					}
					
				}else if(ch1==3) {
					
					System.out.println("Enter the Project id: ");
					int p_id = myInput.nextInt();
					myInput.nextLine();
					System.out.println("What you want to update?");
					System.out.println("1.Project Name\n2.Project Description\n");
					int ch = myInput.nextInt();
					if(ch==1) {
						System.out.println("Enter the updated project name");
						String p_name = myInput.next();
						myInput.nextLine();
						if(Controller.updateProjectDetail(p_id,p_name,project1,ch)) {
							System.out.println("Project detail updated successfully");
						}else {
							System.out.println("please try later");
						}
					}else if(ch==2) {
						System.out.println("Enter the updated project description");
						String p_description = myInput.next();
						myInput.nextLine();
						if(Controller.updateProjectDetail(p_id,p_description,project1,ch)) {
							System.out.println("Project detail updated successfully");
						}else {
							System.out.println("please try later");
						}
					}
					

				}
				
				break;
				
						
			case 4:
				System.out.println("What you want to remove?");
				System.out.println("1.Employee\n2.Department\n3.Project\n");
				int choice1 = myInput.nextInt();
				Employee employee2 = new Employee();
				Department department = new Department();
				Project project = new Project();
				if(choice1==1) {
					System.out.println("Enter the employee id: ");
					int e_id = myInput.nextInt();
					if(Controller.deleteEmployee(employee2,e_id)) {
						System.out.println("Employee is remove successfully");
					}else {
						System.out.println("please try later");
					}
				}
				else if(choice1==2) {
					System.out.println("Enter the department id: ");
					int d_id = myInput.nextInt();
					if(Controller.deleteDepartment(department,d_id)) {
						System.out.println("Department is remove successfully");
					}else {
						System.out.println("please try later");
					}

				}
				else if(choice1==3) {
					System.out.println("Enter the project id: ");
					int p_id = myInput.nextInt();
					if(Controller.deleteProject(project,p_id)) {
						System.out.println("Project is remove successfully");
					}else {
						System.out.println("please try later");
					}

				}
					
				break;

			default:
				break;
			}
			
		} while (flag);	
			
		}
	
	}




