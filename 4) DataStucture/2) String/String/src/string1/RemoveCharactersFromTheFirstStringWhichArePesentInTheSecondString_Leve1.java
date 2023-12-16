package string1;

import java.util.Scanner;

public class RemoveCharactersFromTheFirstStringWhichArePesentInTheSecondString_Leve1 {
//	Input:
//		string1 = “computer”
//		string2 = “cat”
//		Output: “ompuer”
//		Explanation: After removing characters(c, a, t)
//		from string1 we get “ompuer”.
//
//		Input:
//		string1 = “occurrence”
//		string2 = “car”
//		Output: “ouene”
//		Explanation: After removing characters
//		(c, a, r) from string1 we get “ouene”.
	public static int[] countoccurence(String s2) {
		int count [] = new int[256];
		for(int i=0;i<s2.length();i++) {
			count[s2.charAt(i)]++;
		}
		return count;
	}
	
	public static void solve(String s1, String s2) {
		int count[]=countoccurence(s2);
			}
 public static void main(String[] args) {
	String str1; String str2;
	Scanner sc = new Scanner(System.in);
	str1 = sc.next();
	str2=sc.next();
	solve(str1,str2);
}
}
