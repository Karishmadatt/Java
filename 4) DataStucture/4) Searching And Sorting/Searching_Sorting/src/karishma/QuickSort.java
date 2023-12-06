package karishma;

import java.util.Scanner;

public class QuickSort {
		
public static int partition(int arr[],int p,int q){
	    int x = arr[p];
	    int i = p;int temp;
	    for(int j=p+1;j<=q;j++){
	        if(arr[j]<=x) {
	            i++;
	            temp=arr[j];
	            arr[j]=arr[i];
	            arr[i]=temp;
	        }
	    }
	    temp=arr[i];
	    arr[i]=arr[p];
	    arr[p]=temp;
	    return i;
	}

public static void quicksort(int arr[],int p,int q){
	    if(p>=q) return;
	    int m = partition(arr,p,q);
	    quicksort(arr,p,m-1);
	    quicksort(arr,m+1,q);
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();int arr[]=new int[n];
		Utility u = new Utility();
		u.arrayin(arr, n);
		quicksort(arr,0,n-1);
		u.arrayout(arr, n);
	}
}

