/*
 * Problem Statement
Given two sorted arrays A and B of size n and m respectively, return the median of the two sorted arrays.
Input
The first line of input contains n, m the length of arrays A and B.
The next two lines contain the input of arrays A and B.

Constraints
1 ≤ n, m ≤ 1000
-106 ≤ A[i], B[i] ≤ 106
Output
Print the median of two sorted arrays upto two decimal places.
 */

 import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] A = new int[n];
        int[] B = new int[m];
        
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }
        
        double median = findMedian(A, B);
        System.out.printf("%.2f", median);
    }
    
    public static double findMedian(int[] A, int[] B) {
        int totalLength = A.length + B.length;
        int[] merged = new int[totalLength];
        
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }
        
        while (i < A.length) {
            merged[k++] = A[i++];
        }
        
        while (j < B.length) {
            merged[k++] = B[j++];
        }
        
        if (totalLength % 2 == 0) {
            int mid = totalLength / 2;
            return (merged[mid - 1] + merged[mid]) / 2.0;
        } else {
            int mid = totalLength / 2;
            return merged[mid];
        }
    }
}