/*
 * Problem Statement
Given an array arr[] of N positive integers. Write a Program for a centered mean of array elements except the smallest and largest elements. print the final centered mean of the array.
Input
There will be a single line of input containing number of elements in the array.
Next line contains N elements of the array arr.

Constraints:
1 <= N <= 104
1 <= arr[i] <= 105
Output
print the final centered mean of array.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int findElement(int arr[], int n)
    {
    
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
      
       
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            suffixSum[i] = suffixSum[i + 1] + arr[i];
      
   
        for (int i = 1; i < n - 1; i++)
            if (prefixSum[i] == suffixSum[i])
                return arr[i];
      
        return -1;
    }
    public static void main (String[] args) {
        // Your code here

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println(findElement(arr,n)-2);
    }
}