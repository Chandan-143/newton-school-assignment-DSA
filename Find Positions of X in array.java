/*
 * Problem Statement
Given an integer array arr[] of size N and an element X. The task is to find and print the indices of the given element if it is present in array if not then print “Not found” without quotes.

Note: The elements may be present more than once.
Input
The first line of input contains T, denoting the number of test cases.
The first line of each test case contains N and X, N is the size of array and X is an element. Second line contains elements of array space separated. If not present then print "Not found" without quotes

Constraints:
1 <= T <= 100
1 <= N, X <= 10000
1 <= arr[i] <= 100000
Output
For each test case in new line you need to print all the positions where you find the X separated by space.
Assume 0-indexing
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code ']
		Scanner sc= new Scanner (System.in);
		int T=sc.nextInt();
		while(T>0){
			int n=sc.nextInt();
			int x=sc.nextInt();
			int arr[]=new int [n];
			
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			
			int temp=0;
			for(int i=0; i<n; i++){
				if(x == arr[i]){
					System.out.print(i+ " ");
					temp++;
				}
			
			}
			
			if(temp==0){
				System.out.print("Not found");
			}
			System.out.println();
			T--;

		}  
			
	}
}