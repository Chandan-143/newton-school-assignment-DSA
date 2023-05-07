/*
 * Problem Statement
Given an array Arr[] of size N as input, your task is to count the number of triplets Arr[i], Arr[j] and Arr[k] such that:-
i < j < k and the difference between every 2 elements of triplets is less than or equal to P i. e |Arr[i] - Arr[j]| <= P, |Arr[i] - Arr[k]| <= P and |Arr[j] - Arr[k]| <= P
Input
The first line of input contains two space- separated integers N and P.
next line contains N space separated integers depicting the values of the Arr[].

Constraints:-
3 <= N <= 105
1 <= Arr[i], P <= 109
0 <= i <= N-1
Output
Return the count of triplets that satisfies the above conditions.

 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int p= sc.nextInt();

		int arr[]= new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);

		long ans = 0;
		int k=1;
		for(int i=0; i< n-2; i++){
			if(k <= i){
				k=i+1;
			}
			while(k!=n && arr[k]-arr[i] <=p)
				k++;

			int terms = (k-1)-i;
			if(terms >=2)
				ans += (terms*(terms-1))/2;
		}
		System.out.println(ans);
    }
}