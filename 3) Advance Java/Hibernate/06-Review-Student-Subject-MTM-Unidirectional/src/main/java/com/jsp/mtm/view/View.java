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
			break;
		case 4:
			break;
		}
	}while(true);
}
}
