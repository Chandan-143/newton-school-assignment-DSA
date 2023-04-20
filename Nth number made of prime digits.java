/*
 * Problem Statement
Given a number 'N'. The task is to find the Nth number whose each digit is a prime number(<10) i.e 2, 3, 5, 7. In other words you have to find nth number of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.
Input
The first line contains a single integer T i.e. the number of test cases. The first and only line of each test case consists of a single integer N.

Constraints:
1 <= T <= 100
1 <= N <= 100000
Output
For each testcase print the nth number of the given sequence made of prime digits in a new line.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Input:
2
10
21

Output:
33
222

Explanation:
Testcase 1: 10th number in the sequence of numbers whose each digit is prime is 33.
Testcase 2: 21th number in the sequence of numbers whose each digit is prime is 222.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  static void nthprimedigitsnumber(long n)
    {
    
        long len = 1;
 
        long prev_count = 0;
        while (true) {
            
            long curr_count = (long)(prev_count + Math.pow(4, len));
            if (prev_count < n && curr_count >= n)
                break;
            len++;
 
            prev_count = curr_count;
        }
        for (int i = 1; i <= len; i++) {
            for (long j = 1; j <= 4; j++) {
                if (prev_count + Math.pow(4, len - i) < n)
                    prev_count += Math.pow(4, len - i);
                else {
                    if (j == 1)
                        System.out.print("2");
                    else if (j == 2)
                        System.out.print("3");
                    else if (j == 3)
                        System.out.print("5");
                    else if (j == 4)
                        System.out.print("7");
                    break;
                }
            }
        }
        System.out.println();
    }
 
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int T=sc.nextInt();
       nthprimedigitsnumber(T);
        }
    }
}