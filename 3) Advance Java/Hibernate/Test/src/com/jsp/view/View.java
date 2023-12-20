package com.jsp.view;

import java.util.Scanner;

//import com.jsp.controller.Area;
import com.jsp.model.Circle;
import com.jsp.model.Rectangle;
import com.jsp.model.Shape;
import com.jsp.model.Triangle;

public class View {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Area controller = new Area();
		
		double pi = 3.14;
		do {
			System.out.println("Calculate Area\n");
			System.out.println("1.Circle\n2.Rectangle\n3.Triangle\n");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the radius of circle");
				int radius = sc.nextInt();
				Shape shape = new Circle();
				System.out.println(shape.area(radius, pi));
				break;
			case 2:
				System.out.println("Enter the length of rectangle");
				int length = sc.nextInt();
				System.out.println("Enter the breadth of rectangle");
				int breadth = sc.nextInt();
				Shape shape1 = new Rectangle();
				System.out.println(shape1.area(length, breadth));
				break;
			case 3:
				System.out.println("Enter the base of triangle");
				int base = sc.nextInt();
				System.out.println("Enter the height of triangle");
				int height = sc.nextInt();
				Shape shape2 = new Triangle();
                System.out.println(shape2.area(base, height));
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (true);
	}
}
