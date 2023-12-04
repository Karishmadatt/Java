package com.jsp.mtm.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import com.jsp.mtm.controller.Controller;
import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class View {
public static void main(String[] args) {
	Controller controller = new Controller();
	do {
		System.out.println("1.Insert\n2.Read\n3.Update\n4.Delete");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("1.Insert Student\n2.Insert Student and Subject\n3.Insert subject\n4.Insert subject to existing student\n");
			int ch3=sc.nextInt();
			switch(ch3) {
			case 1:
				Student student1 = new Student();
				System.out.println("Please give the student detail");
				System.out.println("Enter the student id: ");
				int s_id1 = sc.nextInt();
				System.out.println("Enter the student name: ");
				String s_name1 = sc.next();
				System.out.println("Enter the student email_id: ");
				String s_email1=sc.next();
				System.out.println("Enter the student contact no: ");
				long s_contact1=sc.nextLong();
				student1.setId(s_id1);
				student1.setName(s_name1);
				student1.setEmail(s_email1);
				student1.setMobile_number(s_contact1);
				if(controller.insert_already_exist_subject(student1)) {
					System.out.println("Student detail is inserted successfully");
				}else {
					System.out.println("Please try later");
				}
				
				break;
			case 2:
				Student student = new Student();
				Subject subject = new Subject();
				List<Subject> subjects_list = new ArrayList<Subject>();
				System.out.println("Please give the student detail");
				System.out.println("Enter the student id: ");
				int s_id = sc.nextInt();
				System.out.println("Enter the student name: ");
				String s_name = sc.next();
				System.out.println("Enter the student email_id: ");
				String s_email=sc.next();
				System.out.println("Enter the student contact no: ");
				long s_contact=sc.nextLong();
				student.setId(s_id);
				student.setName(s_name);
				student.setEmail(s_email);
				student.setMobile_number(s_contact);
				System.out.println("How many subject you want to add?");
				int no_of_subject = sc.nextInt();
				while(no_of_subject>0) {
					Subject subject1 = new Subject();
					System.out.println("Enter the subject id: ");
					int sub_id = sc.nextInt();
				    Subject Subject_Exist=controller.find_subject(sub_id,subject1);
				    if(Subject_Exist!=null) {
				    	subjects_list.add(Subject_Exist);
				    	student.setSubjects(subjects_list);
				    	if(controller.insert_already_exist_subject(student)) {
				    		System.out.println("Student with respective subject is added in database");
				    	}else {
				    		System.out.println("please try later");
				    	}
				     }else {
				    	System.out.println("Seems like you want to insert new subject\nplease give subject detail");
				    	System.out.println("Enter the subject name: ");
						String sub_name = sc.next();
						System.out.println("Enter trainer name: ");
						String sub_trainer = sc.next();
						System.out.println("Give description: ");
						String sub_des=sc.next();
						subject.setId(sub_id);
						subject.setName(sub_name);
						subject.setTrainer(sub_trainer);
						subject.setDescription(sub_des);
						subjects_list.add(subject);
						student.setSubjects(subjects_list);
						if(controller.insert_new_subject(student,subject)) {
							System.out.println("Student with respective subject is added in database");
						}else {
							System.out.println("Please try later, some problem occured in the system.");
						}

				    }
					
	             no_of_subject--;
				}

				break;
			case 3:
				Student student2 = new Student();
				System.out.println("Enter the student id: ");
				int s_id2 = sc.nextInt();
				Student find_student2 = controller.find_student(s_id2, student2);
				if(find_student2!=null) {
					
				}
				break;
			case 4:
				Student student3 = new Student();
				List<Subject> subjects_list1 = new ArrayList<Subject>();
				System.out.println("Enter the student id: ");
				int s_id3 = sc.nextInt();
				Student find_student3 = controller.find_student(s_id3, student3);
				if(find_student3!=null) {
					System.out.println("How many subject you want to add?");
					int no_of_subject1 = sc.nextInt();
					while(no_of_subject1>0) {
						Subject subject1 = new Subject();
						System.out.println("Enter the subject id: ");
						int sub_id = sc.nextInt();
					    Subject Subject_Exist=controller.find_subject(sub_id,subject1);
					    if(Subject_Exist!=null) {
					    	subjects_list1.add(Subject_Exist);
					    	student3.setSubjects(subjects_list1);
					    	if(controller.insert_already_exist_subject(student3)) {
					    		System.out.println("Student with respective subject is added in database");
					    	}else {
					    		System.out.println("please try later");
					    	}
					     }else {
					    	System.out.println("Seems like you want to insert new subject\nplease give subject detail");
					    	System.out.println("Enter the subject name: ");
							String sub_name = sc.next();
							System.out.println("Enter trainer name: ");
							String sub_trainer = sc.next();
							System.out.println("Give description: ");
							String sub_des=sc.next();
							subject1.setId(sub_id);
							subject1.setName(sub_name);
							subject1.setTrainer(sub_trainer);
							subject1.setDescription(sub_des);
							subjects_list1.add(subject1);
							student3.setSubjects(subjects_list1);
							if(controller.insert_new_subject(student3,subject1)) {
								System.out.println("Student with respective subject is added in database");
							}else {
								System.out.println("Please try later, some problem occured in the system.");
							}

					    }
						
		             no_of_subject1--;
					}
					
				}else {
					System.out.println("Student does not exist");
				}
				
			default:
				System.out.println("Invalid Choice");
				break;
			}
		break;
		case 2:
			Student student1 = new Student();
			Subject subject1 = new Subject();
			System.out.println("What you want to read?");
			System.out.println("1.Student Details\n2.Subject Details\n");
			int ch1 = sc.nextInt();
			if(ch1==1) {
				System.out.println("1.Want particuler student detail\n2.Want all the student details\n");
				int ch2 = sc.nextInt();
				if(ch2==1) {
					System.out.println("Which student data you want to read, mention student id: ");
					int student_id = sc.nextInt();
					Student find_student = controller.find_student(student_id, student1);
					if(find_student!=null) {
						System.out.println("student id: "+find_student.getId());
						System.out.println("student name: "+find_student.getName());
						System.out.println("student email: "+find_student.getEmail());
						System.out.println("student contact no: "+find_student.getMobile_number());
					}

				}else if(ch2==2) {
					if(controller.All_the_student_detail()) {
						
					}else {
						System.out.println("please try later");
					}
				}
			}else if(ch1==2) {
				System.out.println("1.Want particular subject detail\n2.All the subject detail\n");
				int ch2=sc.nextInt();
				if(ch2==1) {
					System.out.println("Enter the subject id: ");
					int sub_id = sc.nextInt();
					Subject find_subject = controller.find_subject(sub_id,subject1);
					if(find_subject!=null) {
						System.out.println("subject id: "+find_subject.getId());
						System.out.println("subject name: "+find_subject.getName());
						System.out.println("subject description: "+find_subject.getDescription());
						System.out.println("subject trainer: "+find_subject.getTrainer());
					}else {
						System.out.println("subject doen't exist");
					}
				}else if(ch2==2) {
					if(controller.All_the_subject_detail()) {
						System.out.println("Above data is all the subject detail");
					}else {
						System.err.println("please try later");
					}
				}
			}
			break;
		case 3:
			Student student = new Student();
			Subject subject = new Subject();
			List<Subject> subjects_list1 = new ArrayList<Subject>();
			System.out.println("1.What you want to update?");
			System.out.println("1.student name\n2.student email id\n3.student contact no\n4.student subjects\n");
			int ch4 = sc.nextInt();
			System.out.println("Enter student id: ");
        	int sid = sc.nextInt();
        	Student find_student = controller.find_student(sid, student);
        	if(find_student!=null) {
        	
	        switch(ch4) {
	        case 1:	        	
	        	System.out.println("Enter the student name: ");
	        	String name = sc.next();
	        	if(controller.updateStudentName(find_student, name)) {
	        		System.out.println("Student Name is updated Successfully");
	        	}else {
	        		System.out.println("please try later");
	        	}
	        	break;
	        case 2:
	        	System.out.println("Enter the student email id: ");
	        	String email = sc.next();
	        	if(controller.updateStudentEmail(find_student, email)) {
	        		System.out.println("Student email is updated Successfully");
	        	}else {
	        		System.out.println("please try later");
	        	}
	        	break;
	        case 3:
	        	System.out.println("Enter the student contact no: ");
	        	long contact = sc.nextLong();
	        	if(controller.updateStudentContact(find_student, contact)){
	        		System.out.println("Student Name is updated Successfully");
	        	}else {
	        		System.out.println("please try later");
	        	}
	        	break;
	        case 4:
	            List<Subject> list = find_student.getSubjects();
	        	System.out.println("1.want to delete the existing subject\n2.want to add the subject\n");
	        	int choice = sc.nextInt();
	        	if(choice==1) {
	        		System.out.println("Enter the subject id: ");
	        		int subid = sc.nextInt();
	        		if(controller.deleteExistingSubject(find_student, subject, list, subid)) {
	        			System.out.println("subject deleted successfully");
	        		}else {
	        			System.out.println("==========Error==========");
	        		}
	        	}else if(choice==2) {
	        		System.out.println("How many subject you want to add?");
					int no_of_subject = sc.nextInt();
					while(no_of_subject>0) {
						Subject subject2 = new Subject();
						System.out.println("Enter the subject id: ");
						int sub_id = sc.nextInt();
					    Subject Subject_Exist=controller.find_subject(sub_id,subject2);
					    List<Subject> _subjects_list1 = find_student.getSubjects();
					    if(Subject_Exist!=null) {
					    	System.out.println("hello");
					    	subjects_list1.add(Subject_Exist);
					    	find_student.setSubjects(subjects_list1);
					    	if(controller.insert_new_subject(find_student, subject)) {
					    		System.out.println("Student with respective subject is added in database");
					    	}else {
					    		System.out.println("please try later");
					    	}
					     }else {
					    	System.out.println("Seems like you want to insert new subject\nplease give subject detail");
					    	System.out.println("Enter the subject name: ");
							String sub_name = sc.next();
							System.out.println("Enter trainer name: ");
							String sub_trainer = sc.next();
							System.out.println("Give description: ");
							String sub_des=sc.next();
							subject2.setId(sub_id);
							subject2.setName(sub_name);
							subject2.setTrainer(sub_trainer);
							subject2.setDescription(sub_des);
							subjects_list1.add(subject2);
							student.setSubjects(subjects_list1);
							if(controller.insert_new_subject(student,subject2)) {
								System.out.println("Student with respective subject is added in database");
							}else {
								System.out.println("Please try later, some problem occured in the system.");
							}

					    }
						
		             no_of_subject--;
					}

	        	}
	        	break;
	        }
        	}else {
        		System.out.println("Sorry but student does not exist");
        	}
			break;
		case 4:
			
			System.out.println("1.Want to delete student\n2.Want to delete subject");
			int choice1 = sc.nextInt();
			System.out.println("Enter the student id: ");
			int sid1 = sc.nextInt();
			Student student2 = new Student();
			switch(choice1) {
			case 1:
				 Student find_student2 = controller.find_student(sid1,student2);
			       if(find_student2!=null) {
			    	   if(controller.deleteStudent(find_student2)) {
			    		   System.out.println("Student is deleted successfully");
			    	   }else {
			    		   System.out.println("=======Error========");
			    	   }
			       }else {
			    	   System.out.println("Student does not exit");
			       }
				break;
			case 2:
				Subject subject2 = new Subject();
				System.out.println("Enter the subject id: ");
				int subid=sc.nextInt();
				Subject find_subject = controller.find_subject(subid, subject2);
				
//				if(find_subject!=null) {
//					controller.deleteSubject(subject2, subid, subjects_list1);
//				}else {
//					System.out.println("Subject does not exist");
//				}
				
				break;
			}
			
			break;
		}
	}while(true);
	
}
}

