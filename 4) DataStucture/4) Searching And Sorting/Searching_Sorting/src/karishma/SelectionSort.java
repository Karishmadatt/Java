package karishma;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selection_sort(int arr[],int n) {
	
		for(int i=0;i<n-1;i++) {
			int min = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;

		}
	}
	
   public static void main(String[] args) {
	Utility u = new Utility();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]=new int[n];
	u.arrayin(arr, n);
	selection_sort(arr,n);
	u.arrayout(arr, n);
}
}
