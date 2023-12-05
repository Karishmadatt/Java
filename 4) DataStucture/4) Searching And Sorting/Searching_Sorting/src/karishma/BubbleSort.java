package karishma;

import java.util.Scanner;

public class BubbleSort {
	
	public static void bubblesort(int arr[],int n) {
		boolean check;int temp;
		for(int i=0;i<n-1;i++) {
			check=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					check=true;
				}
			}
			if(!check) {
				break;
			}
		}
	}
	
public static void main(String[] args) {
	Utility u = new Utility();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]=new int[n];
	u.arrayin(arr, n);
	bubblesort(arr,n);
	u.arrayout(arr, n);
}
}
