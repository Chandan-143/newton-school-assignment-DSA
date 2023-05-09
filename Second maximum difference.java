/*
 * Problem Statement
Given an array of n integers. Print the second maximum difference between any two numbers in the array.
Input
First line contains n.
Next line contains n space separated integers.

Constraints
3 <= n <= 105
1 <= arr[i] <= 109
Output
A single integer denoting the answer.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {

        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int x=arr[n-1] - arr[1];
        int y=arr[n-2] - arr[0];
        
        System.out.print(Math.max(x,y));
        // System.out.println(toPrint(arr,n));
        
    }
}