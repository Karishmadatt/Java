package com.jsp.mtm.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
				Subject subject = new Subject();
				System.out.println("Enter the subject id: ");
				int sub_id = sc.nextInt();
			    Subject Subject_Exist=controller.find(sub_id,subject);
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
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}while(true);
}
}
