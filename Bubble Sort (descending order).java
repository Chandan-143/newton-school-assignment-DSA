/*
 * Problem Statement
Given an array, sort the array in reverse order by simply swapping its adjacent elements.
Input
First line of the input contains an integer, N, which denotes the length of the array. Next N inputs are elements of the array that is to be sorted in descending order.

Constraints
1<=N<=1000
-10000<=Arr[i]<=100000
Output
Output sorted array in descending order where each element is space separated.
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
        int temp=0;
        for(int i=0;i<n;i++){
            int f=0;
            for(int j=0;j<n -1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    f=1;
                }
            }
            if(f==0){
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}