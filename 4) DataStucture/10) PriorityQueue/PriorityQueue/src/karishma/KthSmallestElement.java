package karishma;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElement {
	
	//complexity O(n*log(k))
	
	public static void solve(int arr[],PriorityQueue<Integer> pq,int n,int k) {
		for(int i=0;i<n;i++) {
			pq.offer(arr[i]);
			if(pq.size()>k)
				pq.poll();
		}
		System.out.println(pq.peek());
	}

	public static void main(String[] args) {
//		InputOutput inputOutput = new InputOutput();
		InputOutput.takeinput();
		Scanner sc = new Scanner(System.in);
		int k  = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		solve(InputOutput.arr,pq,InputOutput.n,k);
         
	}

}
