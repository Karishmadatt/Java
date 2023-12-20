package karishma;

public class testclass implements test{
 @Override
 public  double add(double num1,double num2) {
	 
	 return num1+num2;
 }
 @Override
 public double circle(int r) {
	 return 3.14*r*r;
 }
 @Override
 public double square(int s) {
	 return s*s;
 }
 @Override
 public double rectangle(int l,int b) {
	 return l*b;
 }
 public static void main(String[] args) {
	   
	  double ans = new testclass().add(2.5, 2.5);
	System.out.println(ans);
}
}
