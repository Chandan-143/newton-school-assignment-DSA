
/*

Problem Statement
Given an integer N, the task is to find the number of divisors of N which are divisible by 2.
Input
The input line contains T, denoting the number of testcases. First line of each testcase contains integer N

Constraints:
1 <= T <= 50
1 <= N <= 10^9
Output
For each testcase in new line, you need to print the number of divisors of N which are exactly divisble by 2
Example
Input:
2
9
8

Output
0
3

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
        int count;
        for(int i=1;i<=n;i++){
            int m=sc.nextInt();
            count=0;
            for(int j=1;j<=Math.sqrt(m);j++){
                if(m%j==0){
                   if(j%2==0){
                    count++;
                }
                if(j*j!=m){
                   if((m/j)%2==0){
                       count++;
                    }
                }
            }
        }
        
        System.out.println(count); 
        }

    }
}