package karishma;

import java.util.Scanner;
import java.util.Stack;

public class BalanceParenthesesLevel1 {
	
public static boolean solve(Stack<Character> stk,String s) {
    int n = s.length()-1;char c;
	for(int i=0;i<=n;i++) {
		if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[') {
			stk.push(s.charAt(i));
			continue;
		}
		if(stk.isEmpty())
			return false;
		   switch(s.charAt(i)) {
		   case '}':
			   c=stk.pop();
			   if(c=='(' || s.charAt(i)=='[')
				   return false;
			   break;
		   case ']':
			   c=stk.pop();
			   if(c=='(' || s.charAt(i)=='{')
				   return false;
			  break;
		   case ')':
			   c=stk.pop();
			   if(c=='[' || s.charAt(i)=='{')
				   return false;
			   break;
		   }
		}
	
	return (stk.isEmpty());
	
}
	
public static void main(String[] args) {
	Stack<Character> stk = new Stack<>();
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	if(solve(stk,s)) {
		System.out.println("Balanced");
	}else {
		System.out.println("Not Balanced");
	}
}
}
