package karishma;
import java.util.*;
public class KthSmallestORLargestElementInUnsortedArrayLevel1 {
 //first approach is using sort inbuilt functiion sort the array and then get the kth smallest element in the array
 //second approach is using merge sort , sort the array and then get the kth smallest element in the array
 //third approach is using quick sort .......
 //forth approach is using binary search find the kth smallest array
 //using the priorityqueue.............
 //In the previous code we already seen the merge sort and in the searching sorting we will see the quicksort so here we will see the 
 // first approach the priority queue approach will be available in the priorityqueue folder and same for the binarysearch , quicksort 
// and the merge the solutin will be available in the searching and sorting folder.
	
 //first approach using the sort inbuilt function
  static void solve(int arr[],int n,int k) {
	  Arrays.sort(arr);
	  System.out.println(arr[k-1]);
  }
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  ArrayInputOutput.arrayinput();
	  int k = sc.nextInt();
	  solve(ArrayInputOutput.arr,ArrayInputOutput.n,k);
  }

 
}
