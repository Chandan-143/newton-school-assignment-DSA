/*
 * Problem Statement
Given an array of integers A and a number K, find maximum sum of a subarray of size K.
Input
The first line of input contains two integers N and K, denoting the number of elements in the array and the subarray size respectively.
The next line contains N integers denoting the elements of the array respectively.

1 <= K <= N <= 200000
-200000 <= A[i] <= 200000
Output
Print a single integer denoting the maximum sum of subarray of size K.

 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();//size of aaray
        int k=in.nextInt();
        int A[]=new int[n];
        int B[]=new int[(n-k)+1];
        for(int i=0;i<n;i++)
           A[i]=in.nextInt();
        
        for(int i=0;i<n-k+1;i++){
            int sum=0;
            int a=i;
            int j=k;
            while(j>=1){
                sum+=A[a++];
                j--;
            }
            B[i]=sum;
        }
        int big=B[0];
        for(int a=1;a<n-k+1;a++){
           // System.out.print(B[a]+" ");
            if(big<B[a]){
                big=B[a];
            }
        }
        System.out.println(big);
        //System.out.println(B[3]);
    }
}