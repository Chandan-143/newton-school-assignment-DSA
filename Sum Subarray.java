/*
 * Problem Statement
You are given an array Arr of N integers. A subarray is good if the sum of elements of that subarray is greater than or equal to K. Print the length of good subarray of minimum length.
Input
First line of input contains N and K.
Second line of input contains N integers representing the elements of the array Arr.

Constraints
1 <= N <= 100000
1 <= Arr[i] <= 100000
1 <= K <= 1000000000000
Output
Print the length of good subarray of minimum length.
Example
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
 public static int goodSubArray(int[] arr, int n, long k){
		long sum = 0l;
		int start = 0;
		int end = 0;
		int minLength = n + 1;
		while (start < n && end < n && sum < k){
			sum += arr[end++];
			while(sum >= k ){
				if (end-start < minLength){
					minLength = (end-start);
					// break;
				}else{
					sum = sum - arr[start++];
				}
			}
		}
		return minLength;
	}
	public static void main (String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		long k = inp.nextLong();
		int[] arr = new int[n];
		for (int i = 0 ; i < n ; i++){
			arr[i] = inp.nextInt();
		}
		int z = goodSubArray(arr, n, k);
		System.out.print(z);
	}
}