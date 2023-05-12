/*
 * Problem Statement
Given an sorted array Arr[] of size N, containing both negative and positive integers, you need to print the squared sorted output.

Note Try using two pointer approach
Input
The first line of input contains T, denoting the number of test cases. Each testcase contains 2 lines. The first line contains the N size of the array. The second line contains elements of an array separated by space.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10000
-10000 ≤ A[i] ≤ 10000

The Sum of N over all test cases does not exceed 10^6
Output
For each test case you need to print the sorted squared output in new line
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static void twoPointer(int[] arr) {
    int[] result = new int[arr.length];
    int left = 0, right = arr.length - 1;
    int i = 0;
    while (left <= right) {
        if (Math.abs(arr[left]) > Math.abs(arr[right])) {
            result[i++] = arr[left] * arr[left];
            left++;
        } else {
            result[i++] = arr[right] * arr[right];
            right--;
        }
    }
    Arrays.sort(result);
    for (int num : result) {
        System.out.print(num + " ");
    }
    System.out.println();
}

     public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);
	 int t=sc.nextInt();
	 while(t-->0){
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0; i<n; i++){
			 arr[i]=sc.nextInt();
			 
		 }
		 twoPointer(arr);
	 }
	 }
}