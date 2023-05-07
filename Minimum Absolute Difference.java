/*
 * Problem Statement
you have given two integer arrays A and B of length N sorted in non-decreasing order. Calculate the minimum possible difference between elements of A and B.
Solve this problem in O(N) complexity.
Input
first- line contains a single integer N
second and third lines contain N space- separated integer A[i] and B[i].
Output
Print the minimum absolute difference between two elements from A and B.
 */

 import java.io.*;
import java.util.*;



class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0 ; i < N ; i++){
            B[i] = sc.nextInt();
        }
            int i = 0;
            int j = 0;
            int minPosDiff = Integer.MAX_VALUE;
        while(i < N && j < N){
            int diff = Math.abs(A[i] - B[j]);
            minPosDiff = Math.min(minPosDiff , diff);
            if(A[i] < B[j]){
                i++;
            }else{
                j++;
            }
        }
        System.out.println(minPosDiff);
    }
}