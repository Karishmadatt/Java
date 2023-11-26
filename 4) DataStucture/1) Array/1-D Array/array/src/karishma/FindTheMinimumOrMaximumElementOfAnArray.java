package karishma;

import java.util.Scanner;

public class FindTheMinimumOrMaximumElementOfAnArray {

//	Given an array, write functions to find the minimum and maximum elements in it. 
	
	static void min(int arr[],int n) {
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	static void max(int arr[],int n) {
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println(n);
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		min(arr,n);
		max(arr,n);
	}
}
