/*
 Problem Statement
Given a sequence of n numbers such that the difference between the consecutive terms is constant, find the missing term in logarithmic time. Assume that the first and last elements are always part of the input sequence and the missing number lies between index 1 to n-1.
Solve the problem using divide and conquer approach.
Input
first line contain a single integer N.
second line contain N space separated integer A[i].
Output
print missing number in given array.

Constraint :
1<=N<=10^5
1<=A[i]<=10^9
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static int Missing(int[] arr){
      
        int ei = 0, si = arr.length - 1;
 
        int between = (arr[arr.length - 1] - arr[0]) / arr.length;
        while (ei <= si)
        {
            int mid = si - (si - ei) / 2;
            if (mid + 1 < arr.length && arr[mid + 1] - arr[mid] != between) {
                return arr[mid + 1] - between;
            }
            if (mid - 1 >= 0 && arr[mid] - arr[mid - 1] != between) {
                return arr[mid - 1] + between;
            }
            if (arr[mid] - arr[0] != (mid - 0) * between) {
                si = mid - 1;
            }
            else {
                ei = mid + 1;
            }
        }
        return -1;
    }
 
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
        }
         System.out.println(Missing(arr1));
    }
}