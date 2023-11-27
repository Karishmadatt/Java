package karishma;


public class ReverseAnArrayLevel1 {

	static void reverse(int arr[],int n) {
		int start =0;int end =n-1;int temp;
		while(start<=end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;end--;
		}
	}
	
	public static void main(String[] args) {
		ArrayInputOutput.arrayinput();
		reverse(ArrayInputOutput.arr,ArrayInputOutput.n);
		ArrayInputOutput.arrayoutput();
	
	}
}
