package com.jsp.mto.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.jsp.mto.controller.Controller;
import com.jsp.mto.model.Product;
import com.jsp.mto.model.Review;

public class View {
public static void main(String[] args) throws IOException {
	Controller controller = new Controller();
//	Product product = new Product();
	do {
		
	Review review = new Review();
	System.out.println("1.Give Review to a product\n2.Read the review of a product\n3.Update the Review\n4.Delete the Reveiw\n");
	Scanner sc = new Scanner(System.in);
	int ch = sc.nextInt();
	switch (ch) {
	case 1:
		System.out.println("Please give the product detail: ");
		System.out.println("Enter the Product Id: ");
		int product_id = sc.nextInt();
		System.out.println("Enter the Product Name: ");
		String product_name = sc.next();
		System.out.println("Enter the Product Cost: ");
		int product_cost = sc.nextInt();
		Product product = new Product();
		product.setId(product_id);
		product.setName(product_name);
		product.setCost(product_cost);
		System.out.println("How many review you want to give?");
		int count = sc.nextInt();
		while(count!=0) {
		 Review review1 = new Review();
		 System.out.println("Enter the Id: ");
		 int review_id = sc.nextInt();
		 System.out.println("Enter the heading of the review: ");
		 String review_heading = sc.next();
//		 System.out.println();
		 System.out.println("Enter the comment : ");
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 String comment;
		 try {
		  comment = reader.readLine();
		    review1.setId(review_id);
			 review1.setHeading(review_heading);
			 review1.setComment(reader.readLine());
			 review1.setProduct(product);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(controller.Insert(review_id,review1,product)){
			 System.out.println("Review is Added to the system");
		 }else{
			 System.out.println("Please try later");
		 }
		 count--;
		}
		
		break;
	case 2:
			System.out.println("Enter the review id: ");
			int review_id1 = sc.nextInt();
		    Review review1 = new Review();
			Review find_review=controller.find_review(review_id1);
			if(find_review!=null){
				System.out.println("Review Details");
			     System.out.println("Review id: "+find_review.getId());
			     System.out.println("Review Heading: "+find_review.getHeading());
			     System.out.println("Review comment: "+find_review.getComment());
			     System.out.println("Want to read product details?\n1.Yes\n2.No");
			     int s = sc.nextInt();
			     if(s==1) {
			    	 Product product2 = find_review.getProduct();
			    	 System.out.println("Product Detail");
			    	 System.out.println("Product Id: "+product2.getId());
			 		System.out.println("Product Name: "+product2.getName());
			 		System.out.println("Product Cost: "+product2.getCost());
			     }else {
			    	 break;
			     }
			}else {
				System.out.println("Review does not exit");
			}
		
		break;
	case 3:
		System.out.println("Enter review id: ");
		int r_id = sc.nextInt();
		Review find_review2=controller.find_review(r_id);
		if(find_review2!=null) {
			System.out.println("What you want to update?");
			System.out.println("1.Product\n2.Review\n");
			int ch2 = sc.nextInt();
			if(ch2==2) {
			System.out.println("Choose the option");
			System.out.println("1.Review heading\n2.Review Comment\n");
			int c=sc.nextInt();
			switch(c) {
			case 1:
					System.out.println("Enter the heading");
					String heading = sc.next();
					if(controller.update_heading(heading,find_review2)) {
						System.out.println("Update operation is done successfully");
					}else {
						System.out.println("Please try later");
					}
				
				break;
			case 2:
				System.out.println("Enter the comment");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				String updated_comment = reader.readLine();
				if(controller.update_review_comment(updated_comment,find_review2)) {
					System.out.println("Update operation is done successfully");
				}else {
					System.out.println("Please try later");
				}
				
				break;
			}
			}else if(ch2==1) {
				System.out.println("Enter product id: ");
				int productid = sc.nextInt();
				System.out.println("What you want to update in the product?");
				System.out.println("1.product name\n2.product cost\n");
				int ch1=sc.nextInt();
				if(ch1==1) {
					System.out.println("Enter the name: ");
					String updatedname = sc.next();
					if(controller.update_product_name(updatedname,find_review2)) {
						System.out.println("Product name is updated successfully");
					}else {
						System.out.println("Please try later,some problem occured in the system");
					}
				}else if(ch1==2) {
					System.out.println("Enter the cost: ");
					int updatedcost = sc.nextInt();
					if(controller.update_product_cost(updatedcost,find_review2)) {
						System.out.println("Product cost is updated successfully");
					}else {
						System.out.println("Please try later,some problem occured in the system");
					}
				}
				
				
			}
		}else {
			System.out.println("Review does not exit");
		}
		break;
	case 4:
		System.out.println("What you want to delete");
		System.out.println("1.product\n2.reviews of the product\n");
		int ch1 = sc.nextInt();
		System.out.println("Enter the review id: ");
		int review_id = sc.nextInt();
		Review find_review3 = controller.find_review(review_id);
		if(find_review3!=null) {
		 if(ch1==2) {
			if(controller.delete_review(review_id,find_review3)) {
				System.out.println("Review is deleted successfully");
			}else {
				System.out.println("Please try later,some problem occured in the system");
			}
		 }else if(ch1==1) {
			 System.out.println("Enter the product id: ");
				int product_id1 = sc.nextInt();
			 if(controller.delete_product(review_id,find_review3,product_id1)) {
				 System.out.println("Product is deleted successfully");
			 }else {
				 System.out.println("Please try later,some problem occured in the system");
			 }
		 }
		 
		}else {
			System.out.println("Review does not exist");
		}

		
		
		break;
		default:
			break;
	}
	}while(true);
}
}

