/*
 * Problem Statement
Given an unsorted integer array having distinct integers, find a pair with the given sum in it.
First element of pair > second element of pair
Input
First line of input contains a single integer N, next line contains N space separated integers depicting the values of array and third line consist target sum.

Constraints:
2<=N<=5*(10^5)
1<=A[i], target<=2*(10^9)
Target
Output
Print the pair of integers which sum is target.
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
        //  int k=sc.nextInt();
        int arr[]= new int [n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
         int x=sc.nextInt();

        // pair sum=x
        // quick sort/ merge sort
        //Two pointers approach
        Arrays.sort(arr);

        int i=0;
        int j=n-1;

        while(i<j){
            if((arr[i]+arr[j])<x){
                i++;
            }
            else if((arr[i]+arr[j])>x){
                j--;
            }
            else{
                System.out.println("Pair found ("+arr[j]+", "+arr[i]+")");
                return;
            }
        }

        // 39
        System.out.println("Pair not found");
    }
}