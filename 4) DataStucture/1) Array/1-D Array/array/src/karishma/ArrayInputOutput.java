package karishma;

import java.util.Scanner;

public class ArrayInputOutput {
	static Scanner sc =new Scanner(System.in);
	static int n= sc.nextInt();
	static int arr[]= new int[n];
	
	static void arrayinput() {
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		
	   }
		
	}
	static void arrayoutput() {
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		
	   }
	}
	
     public static void main(String[] args) {
		arrayinput();
		arrayoutput();
	}
}
