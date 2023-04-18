/*
 
 Problem Statement
Given a number n find the number of prime numbers less than equal to that number.
Input
There is only one integer containing value of n.

Constraints:-
1 <= n <= 10000000
Output
Return number of primes less than or equal to n
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input
5

Sample Output
3

Explanation:-
2 3 and 5 are the required primes.

Sample Input
5000

Sample Output
669
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean Prime(long n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false; 
            } 
        }
        return true; 
    }

    static void Isprime(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(Prime(i)){
                count++;
            }
        }
         System.out.println(count);
    }
    public static void main (String[] args) {
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       Isprime(n);
        }
       
    
}