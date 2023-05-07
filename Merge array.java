/*
 * Problem Statement
Given two sorted array your task is to merge these two arrays into a single array such that the merged array is also sorted
Input
First line contain two integers N and M the size of arrays
Second line contains N separated integers the elements of first array
Third line contains M separated integers elements of second array

Constraints:-
1<=N,M<=104
1<=arr1[], arr2[] <=105
Output
Output the merged array
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        int n1=arr1.length;
        int n2=arr2.length;
        while (i<n1 && j <n2){
         
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n1)
            arr3[k++] = arr1[i++];

        while (j < n2)
            arr3[k++] = arr2[j++];
    }
         
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int nnn[]=new int[n];
        int mmm[]=new int[m];

        for(int i=0;i<n;i++){
            nnn[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            mmm[i]=sc.nextInt();
        }
        int arr1[]=new int[n+m];
        mergeArrays(nnn,mmm,arr1);
        for(int i=0;i<n+m;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}