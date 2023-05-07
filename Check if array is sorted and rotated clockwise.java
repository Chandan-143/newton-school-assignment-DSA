/*
 * Problem Statement
Given an array arr[] of N distinct integers, check if this array is Sorted and Rotated clockwise. A sorted array is not considered sorted and rotated, i.e., there should be at least one rotation.
Note:-
The array can be sorted both increasingly and decreasingly
Input
The first line of input contains the number of test cases T. Each test case contains 2 lines, the first line contains N, the number of elements in the array, and the second line contains N space-separated elements of the array.

Constraints:
1 <= T <= 50
3 <= N <= 10^3
1 <= A[i] <= 10^4



Output
Print "Yes" if the given array is sorted and rotated, else Print "No", without Inverted commas.

 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
  public static boolean sortedRotatedArrayInc(int arr[], int N) {
          int dipIndex = -1;
          for (int i = 0; i < N - 1; i++) {
               if (arr[i] > arr[i + 1]) {
                    dipIndex = i + 1;
                    break;
               }
          }
          if (dipIndex == -1) {
               return false;
          }
          for (int i = dipIndex; i < N - 1; i++) {
               if (arr[i] > arr[i + 1]) {
                    return false;
               }
          }
          if (arr[N - 1] < arr[0]) {
               return true;
          } else {
               return false;
          }
     }
     public static boolean sortedRotatedArrayDec(int arr[], int N) {
          int dipIndex = -1;
          for (int i = 0; i < N - 1; i++) {
               if (arr[i] < arr[i + 1]) {
                    dipIndex = i + 1;
                    break;
               }
          }
          if (dipIndex == -1) {
               return false;
          }
          for (int i = dipIndex; i < N - 1; i++) {
               if (arr[i] < arr[i + 1]) {
                    return false;
               }
          }
          if (arr[N - 1] > arr[0]) {
               return true;
          } else {
               return false;
          }
     }
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int T = sc.nextInt();
               while (T-- > 0) {
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    for (int i = 0; i < n; i++) {
                         arr[i] = sc.nextInt();
                    }
                    if (sortedRotatedArrayInc(arr, n) || sortedRotatedArrayDec(arr, n)) {
                         System.out.println("Yes");
                    } else {
                         System.out.println("No");
                    }
               }
          }
     }
}