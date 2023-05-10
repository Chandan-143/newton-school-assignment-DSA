/*
 * Problem Statement
You are given an unsorted array of length n and must sort it using merge sort while also printing the amount of merges that occur throughout the sorting process.
Input
The first line of input will be n, which represents the array's length, followed by the n array items in the second line.

Constraints:
0<= n <=100000
Output
First- line should be the sorted array and the second should be the number of mergers that occurs when the array is sorted using merge sort.
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    // static int mergeSort(int arr[], int si,int mid,int ei){
    //     int merge[]= new int[ei-si+1];

    //     int dx1=si;
    //     int dx2= mid+1;
    //     int x=0;
    //     while(dx1<=mid && dx2 <= ei){
    //         if(arr[dx1]<=arr[dx2]){
    //             merge[x++]=arr[dx1]
    //         }
    //     }
    //     if(ei<si){

    //     }
    // }

    // Bobble Sort

    static void Bobble(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
           
        }
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        Bobble(arr);
        System.out.println();
        System.out.println(n-1);
        
    } 
}