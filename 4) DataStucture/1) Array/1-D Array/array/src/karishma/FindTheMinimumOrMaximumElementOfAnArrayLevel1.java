package karishma;


public class FindTheMinimumOrMaximumElementOfAnArrayLevel1 {

//	Given an array, write functions to find the minimum and maximum elements in it. 
	
	static void min(int arr[],int n) {
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	static void max(int arr[],int n) {
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		ArrayInputOutput.arrayinput();
		min(ArrayInputOutput.arr,ArrayInputOutput.n);
		max(ArrayInputOutput.arr,ArrayInputOutput.n);
	}
}
