package karishma;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStackUsingQueueLevel1 {
	
public static void solve(Stack<Integer> stk,int n) {
	Queue<Integer> q = new LinkedList<Integer>();
	while(!stk.isEmpty()) {
		q.add(stk.peek());stk.pop();
	}
	while(!q.isEmpty()) {
		stk.push(q.peek());
		q.poll();
	}
	while(!stk.isEmpty()) {
		System.out.println(stk.peek());stk.pop();
	}
	
}
	
 public static void main(String[] args) {
	Stack<Integer> stk = new Stack<>();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int temp;
	for(int i=0;i<n;i++) {
		temp=sc.nextInt();
		stk.push(temp);
	}
	solve(stk,n);
}
}
