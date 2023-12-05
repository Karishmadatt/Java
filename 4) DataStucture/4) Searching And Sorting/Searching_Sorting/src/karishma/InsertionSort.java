package karishma;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionsort(int arr[],int n) {
		for(int i=1;i<n;i++) {
			int j=i-1;int key=arr[i];
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j-=1;
			}
			arr[j+1]=key;
		}
	}
	
public static void main(String[] args) {
	Utility u = new Utility();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]=new int[n];
	u.arrayin(arr, n);
	insertionsort(arr,n);
	u.arrayout(arr, n);
}
}
