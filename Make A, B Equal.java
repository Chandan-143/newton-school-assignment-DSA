/*

Problem Statement
You are given two arrays A and B of n elements, each element is either 0 or 1.

You can make operations of 2 kinds:

Pick an index i and change A[i] to 1−A[i].
Rearrange the array A however you want.

Find the minimum number of operations required to make a equal to b.
Input
First line contains n.
Next line contains n space separated integers denoting Array A.
Next line contains n space separated integers denoting Array B.

Constraints
1 <= n <= 105
0 <= A[i], B[i] <= 1
Output
A single integer denoting required operations.
Example
Input:
3
1 0 1
0 0 1

Output:
1

Explanation :
change A[0].

Input:
4
1 1 0 0
0 1 1 1

Output:
2

Explanation :
change A[2] and then rearrange.

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void A(int arr[], int arr1[], int n ){
        int x=0;
        int y=0;
        int z=0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
            x++;
        }
    }
        for(int i=0;i<n;i++){
            if(arr1[i]==1){
                 y++;
            }
        if(arr[i]!=arr1[i]){
            z++;
        }
       
    }
    int ans=Math.min(z,Math.abs(x-y)+1);
        System.out.println(ans);
}

    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        A(arr,arr1,n);
            
        }
    }