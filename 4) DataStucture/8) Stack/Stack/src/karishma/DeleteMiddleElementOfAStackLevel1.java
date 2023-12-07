package karishma;

import java.util.Scanner;
import java.util.Stack;

public class DeleteMiddleElementOfAStackLevel1 {
//	Given a stack with push(), pop(), and empty() operations, 
//	The task is to delete the middle element of it without using any additional data structure.
//	        Input  : Stack[] = [1, 2, 3, 4, 5]
//			Output : Stack[] = [1, 2, 4, 5]
//
//			Input  : Stack[] = [1, 2, 3, 4, 5, 6]
//			Output : Stack[] = [1, 2, 4, 5, 6]
	
	public static void solve(Stack<Integer> stk,int n,int i) {
		if(stk.isEmpty() || i==n) {
			return;
		}
	    int x=stk.pop();
		solve(stk,n,i++);
		if(i!=n/2) {
			stk.push(x);
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp;
		while(n>0) {
			temp=sc.nextInt();
			stk.push(temp);n--;
		}
		solve(stk,n,0);
		while(!stk.isEmpty()) {
			System.out.println(stk.peek()+" ");stk.pop();
		}

		
	}
}
