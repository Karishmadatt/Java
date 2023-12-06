package karishma;

import java.util.Scanner;
import java.util.Stack;

public class BalanceParenthesesLevel1 {
	
public static void solve(Stack<Character> stk,String s,int i) {
	boolean check = true;
	while(check) {
		if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[') {
			stk.push(s.charAt(i));i++;
		}
		else {
			check=false;
		}
	}
	System.out.println(i);
	while(!stk.isEmpty()) {
		if((s.charAt(i)=='(' && stk.peek()!=')') ||( s.charAt(i)=='{' && stk.peek()!='}')  || (s.charAt(i)=='[' && stk.peek()!=']') ) {
			break;
		}else {
			i++;
			stk.pop();
		}
	}
	if(stk.isEmpty()) {
		System.out.println("Balanced");
	}else {
		System.out.println("Not Balanced");
	}
}
	
public static void main(String[] args) {
	Stack<Character> stk = new Stack<>();
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	solve(stk,s,0);
}
}
