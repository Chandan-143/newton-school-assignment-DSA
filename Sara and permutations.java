/*
 * Problem Statement
Sara loves problems on permutation but this time she stuck on a problem and asks for your help.
Given a permutation of N integers as Arr[], your task is to check for each K(1 <= K <= N) there exists a subarray of size K such that it is also a permutation of K integers.

Note:- A permutation of N integers is a sequence of size N where every element from 1- N are present.
Input
The first line of input contains a single integer N denoting the size of permutation, the next line of input contains N space separated integers depicting the permutaiton.

Constraints:-
1 <= N <= 100000
1 <= Arr[i] <= N
Output
Print N space separated integers either 1 or 0. Print 1 if there exist a permutation K for the ith number else print 0.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        HashMap <Integer, Integer> map =new HashMap<>();
        int arr[] = new int[n];
        for(int i=0; i<n ; i++){
            arr[i]  =sc.nextInt();
            map.put(arr[i], i);
        }
        int l=n,r=-1;
        for(int k=1; k<=n;k++){
            int ind =map.get(k);
            l=Math.min(l,ind);
            r=Math.max(r,ind);
            if(r-l+1 == k)
                System.out.print(1+" ");
            else
                System.out.print(0+" ");
        }
    }
}