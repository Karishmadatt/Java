package karishma;

import java.util.Scanner;

class CreationOfThread_02 extends Thread {
    //using thread class
     void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
             if (swapped == false)
                break;
        }
    }
    
     int search(int arr[],int r,int l,int x) {
    	if(r<=l) {
    		return 0;
    	}else {
    	  int mid=(l+r)/2;
    	  if(arr[mid]==x) {
    		  return mid;
    	  }
    	  else if(arr[mid]>x) {
    		  return search(arr, r-1, l, x);
    	  }
    	  else {
    		  return search(arr, r+1,l, x);
    	  }
    	}
    }
    
     void fun(int arr[],int r,int l,int x) {
    	int s = search(arr,r,l,x); s+=1;
    	System.out.println("The element is found at index "+ s);
    }
    
     void print(int arr[],int n) {
    	for(int i=0;i<n;i++) {
    	   System.out.println(arr[i]+" ");
    	}
    	System.out.println();
    }

}

public class CreationOfThread_01{
	public static void main(String[] args) {

		
		CreationOfThread_02 t1 = new CreationOfThread_02();
		CreationOfThread_02 t2 = new CreationOfThread_02();
		CreationOfThread_02 t3 = new CreationOfThread_02();

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
		   arr[i]=sc.nextInt();
		}
		
		t1.start();
		t1.bubbleSort(arr, n);
		t2.start();
		t2.print(arr,n);
		t3.start();
		t3.fun(arr, n-1, 0, 2);

	
}
	}

