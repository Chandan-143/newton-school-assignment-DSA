/*
 * Problem Statement
Given an integer K, find a positive integer x such that K = x2 + 3*x. If no such positive integer x exists, print -1.
Input
First and the only line of the input contains an integer K.

Constraints:
1 <= K <= 1018
Output
Print a positive integer x such that the above equation satisfies. If no such integer x exists, print -1.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
		long k=sc.nextLong();
		long ans=-1;
		long kk = (int)Math.sqrt(k);

		long l=1, r=kk;
		while(l<=r){
			long mid = (l+r)/2;
			long x=mid;
			long curr = (x*x)+(3*x);
			if(curr == k){
				ans=mid;
				break;
			}else if(curr<k){
				l=mid+1;
			}else{
				r=mid-1;
			}
			
		}
		System.out.println(ans);
		

	}
}