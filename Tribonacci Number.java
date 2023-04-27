/*
 * Problem Statement
Fibonacci numbers are interesting but Tribonacci numbers are more interesting.
A Tribonacci number T(n) is the sum of the preceding three elements in a series. Consider its first three numbers to be 0, 0, and 1. i. e T(1) = 0, T(2) = 0, T(3) = 1.
Given a number N, your task is to return the nth Tribonacci number.
Input
The input contains a single integer N.

Constraints:-
1 <= N <= 20
Output
Return the Nth Tribonacci number.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void febo(int n){
        int t1=0;
        int t2=0;
        int t3=1;
        
        for(int i=4;i<=n;i++){
            int last=t1+t2+t3;
            t1=t2;
            t2=t3;
            t3=last;

            
        }System.out.println(t3);
        
    }
    public static void main (String[] args) {
        // Your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        febo(n);
    }
}