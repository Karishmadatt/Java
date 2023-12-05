package karishma;

import java.util.*;

public class Utility {
	public void arrayin(int arr[],int n) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public void arrayout(int arr[],int n) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
}
