package karishma;

import java.util.Scanner;



public class InputOutput {
	static Scanner sc = new Scanner(System.in);
	static int n= sc.nextInt();
	static int arr[]=new int[n];


	
	static void takeinput() {
		// TODO Auto-generated method stub
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		
	}

 public static void main(String[] args) {
	takeinput();
	printoutput();
	PQinput()
}

static void printoutput() {
	// TODO Auto-generated method stub
	 for(int i=0;i<n;i++) {
		 System.out.println(arr[i]);
	 }

	
}
 }
