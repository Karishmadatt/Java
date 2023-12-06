package karishma;

import java.util.Scanner;
import java.util.Stack;



public class ReverseStringLevel1 {
	public static  void solve(Stack<Character> stk,String s) {
	     int n = s.length();int i=0;
	     while(n>0) {
	    	 stk.push(s.charAt(i));
	    	 n--;
	    	 i++;
	     }
	     while(!stk.isEmpty()) {
	          System.out.println(stk.peek());
	          stk.pop();
	     }
	
	}
	public static void main(String[] args) {
		 Stack<Character> stk = new Stack<>();
		    Scanner sc = new Scanner(System.in);
		    String s = sc.next();
		    solve(stk,s);

	}
   }
