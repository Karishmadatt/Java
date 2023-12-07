package karishma;

import java.util.Scanner;

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
	Scanner sc = new Scanner(System.in);
	int find = sc.nextInt();
	ArrayInputOutput inout = new ArrayInputOutput();
	inout.arrayinput();
    solve_bruteforce(inout.arr,inout.n,find);
//	solve_binarysearch(inout.arr,inout.n,find);
//	solve_binarysearch_improved(inout.arr,inout.n,find);
//	solve_collection(inout.arr,inout.n);
//	inout.arrayoutput();
}
}
