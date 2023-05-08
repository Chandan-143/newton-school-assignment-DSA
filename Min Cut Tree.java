/*
 * Problem Statement
Given an integer K and an array height[] of size N, where height[i] denotes the height of the ith tree in a forest. The task is to make a cut of height X from the ground such that at max K units wood is collected. Find the minimum value of X
If you make a cut of height X from the ground then every tree with a height greater than X will be reduced to X and the remaining part of the wood can be collected
Input
The first line contains two integers N and K.
The next line contains N integers denoting the elements of the array height[]

Constraints
1 ≤ N ≤ 105
1 ≤ arr[i] ≤ 105
1 ≤ K ≤ 107
Output
Print a single integer with the value of X.
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

     public static int minValueOfX(int arr[],int n,int k){
            int l=0;
            int h=100000;  // you can calculate max height as well

            while(l<h){
                int mid=l+(h-l)/2;
                int woodCalculated=calculateWood(arr,mid,n);
                if(woodCalculated<=k){
                    h=mid;
                }
                else{
                    l=mid+1;
                }
            }

            return h;
    }

  
    public static int calculateWood(int arr[],int x,int n){
            int sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]-x >0){
                sum = sum + (arr[i]-x);
                }
            }
            return sum;
    }

    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }

        System.out.println(minValueOfX(arr,n,k));
    }
}