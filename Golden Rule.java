/*
 * Problem Statement
Nishu loves to arrange things in order. Nishu sticks to his “Golden rule” that every set of numbers must be in ascending order. Unfortunately, that is not always the case. Nishu defines a “violation” as a situation when a smaller number comes after a larger number in the set, which violates the ascending order.

Given a set of integers, Nishu needs to find out the total number of such violations.
Input
First line contain a single integer N.
Second line contain N space separated integer A[i].
Output
Print number of violation.


 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}