/*
 * Problem Statement
Given a one-dimensional sorted array A containing N integers.

You are also given an integer target, find if there exists a pair of elements in the array whose difference is equal to the target.
Approach this problem in O(n).
Input
The first line contains a single integer N.
The second line contains N space- separated integer A[i].
The third line contains an integer target.

Constraints
1<=N<=10^5
0<=A[i]<=10^9
0<=target<=10^9
Output
Print Yes if pair with given difference exists in our array otherwise print No.
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
            A[i]=in.nextInt();
        
        int target=in.nextInt();
        
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
               if(target==A[j]-A[i]){
                   System.out.print("Yes");
                   return;
               }
            }
        }
        System.out.print("No");
    }
}