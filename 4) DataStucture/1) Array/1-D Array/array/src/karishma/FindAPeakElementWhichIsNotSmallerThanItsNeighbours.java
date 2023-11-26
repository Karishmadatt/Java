package karishma;

import java.util.Scanner;

public class FindAPeakElementWhichIsNotSmallerThanItsNeighbours {
//	Find a peak element which is not smaller than its neighbours
//	Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
//
//	Note: If the array is increasing then just print the last element will be the maximum value.
//
//	Example:
//
//	Input: array[]= {5, 10, 20, 15}
//	Output: 20
//	Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
//
//	Input: array[] = {10, 20, 15, 2, 23, 90, 67}
//	Output: 20 or 90
//	Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
	
	static void BruteForce_Approach(int arr[],int n) {
		if(n==1) {
		System.out.println(arr[n]);
		}
		else if(arr[0]>=arr[1]) {
			System.out.println(arr[0]);
		}
		else if(arr[n-1]>=arr[n-2]) {
			System.out.println(arr[n-1]);
		}else {
			for(int i=1;i<n-1;i++) {
				if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]) {
					System.out.println(arr[i]);
					return;
				}
			}
		}
	}
	
	static void BinarySearch_WithoutRecursion(int arr[],int n) {
		int l =0;
		int r = n-1;
		int mid=0;
		while(l<=r) {
			mid = (l+r)>>1;
		  if((mid ==0 || arr[mid-1]<=arr[mid]) &&( mid == n-1 || arr[mid+1]<=arr[mid])) {
			  System.out.println(arr[mid]);
			  return;
		  }
		  if( mid>0 && arr[mid-1]>arr[mid]) {
			  r = mid-1;
		  }else {
			  l=mid+1;
		  }
		}
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
//		BruteForce_Approach(arr,n);
		BinarySearch_WithoutRecursion(arr,n);
	}
	
}
