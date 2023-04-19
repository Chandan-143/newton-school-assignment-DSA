/*
 
Problem Statement
Given a integer N, your task is to calculate the number of divisors in factorial of N.
Input
Input contains a single integer depicting value of N.

Constraints:-
1 < = N < = 100
Output
Print the number of divisors in N!.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input:-
3

Sample Output:-
4

Sample Input:-
5

Sample Output:-
16
 */


//  solution


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    /*
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long fect=1;
        int i;
        int divisor=1;
        for(i=1;i<=100;i++){
            fect=fect*i;
        }
        for(i=1;i<fect;i++){
        if(fect%i==0){
            divisor++;
           }
        }
        System.out.println(divisor);
    }
}
*/


static Vector<Integer> allPrimes=new Vector<Integer>();
    public static void main (String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            System.out.println(factorialDivisors(n));
    }
         static void sieve(int n){

        boolean []prime=new boolean[n+1];
        for(int i=0;i<=n;i++)
        prime[i]=true;
        for (int p=2; p*p<=n; p++){
        if (prime[p] == true){
            for (int i=p*2; i<=n; i += p)
                prime[i] = false;
        }
    }
            for (int p=2; p<=n; p++)
                if (prime[p])
                    allPrimes.add(p);
        }
        static long factorialDivisors(int n){
            sieve(n);
            long result = 1;
            for (int i=0; i < allPrimes.size(); i++){
                long p = allPrimes.get(i);
                long exp = 0;
                while (p <= n)
                {
                    exp = exp + (n/p);
                    p = p*allPrimes.get(i);
            }
            result = result*(exp+1);
        }
        return result;
    }
}