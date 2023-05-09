/*
 * Problem Statement
Given an array A[] of size N, containing positive integers. You need to sort the elements of array using Insertion sort algorithm.
Input
First line of the input denotes number of test cases T. First line of the testcase is the size of array N and second line consists of array elements separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 10^3
1 <= A[i] <= 10^3
Output
For each testcase print the sorted array in a new line.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void sort(int arr[], int n){
         for(int i=1;i<n;i++){
            int k=arr[i]; // take each and every element
            int j=i-1;
            while(j>=0 && arr[j]>k){ // go back
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=k; // inserting it in right position
        }
    }
    public static void main (String[] args) {
     Scanner sc= new Scanner(System.in);
     int t=sc.nextInt();

     while(t-->0){
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         sort(arr,n);
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }
    }
}