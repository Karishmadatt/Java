package karishma;

import java.util.*;

public class CountNumberOfOccurence {
	
public static void solve_bruteforce(int arr[],int n,int x) {
	int res=0;
	for(int i=0;i<n;i++) {
		if(x==arr[i]) {
			res++;
		}
	}
	System.out.println("Occurence of "+x+" is "+res+" times");
}

public static void solve_binarysearch(int arr[],int n,int find) {
	
}

 public static void main(String[] args) {
	/*Scanner sc = new Scanner(System.in);
	int find = sc.nextInt();
	ArrayInputOutput inout = new ArrayInputOutput();
	inout.arrayinput();
    solve_bruteforce(inout.arr,inout.n,find);
//	solve_binarysearch(inout.arr,inout.n,find);
//	solve_binarysearch_improved(inout.arr,inout.n,find);
//	solve_collection(inout.arr,inout.n);
//	inout.arrayoutput();
    */
//    my code start
    
	 Scanner sc = new Scanner(System.in);
		int n=5;
		Vector<Integer> vec = new Vector<>();
	    
	    //int[] arr = new int[5];
	    
	    for(int i=0;i<n;i++){
	        vec.add(i);
	    }
	    
	    
	    // 0 1 2 3 4
	    for (int i=0;i<n ;i++ ){
	        System.out.println(vec.get(i));
	    } 
	    
	    // 1 2 3 4 5
	    fun(vec,n);
	    
	    // 0
	    for (int i=0;i<n ;i++ ){
	        System.out.println(vec.get(i));
	    } 
	 
    //end code
}
 
	 public static void fun(Vector<Integer> vec,int n){
	     
	     for(int i=0;i<n;i++){
	         vec.set(i,vec.get(i)*100);
	     }
	
	}
}
