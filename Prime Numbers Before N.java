/*
 

Problem Statement
Find the number of prime numbers before N (Including that number too).
Input
The first line of the input contains the number of test cases T.
Next T lines contain the value N.

Constraints
1 <= T <= 1e5
1 <= N <= 1e5
Output
Print the number of primes number before that number.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1:
2
3
11

Sample Output 1:
2
5
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    /*
    static boolean Prime(int n){
        if(n==1|| n==0){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
           
        for(int i=0;i<N;i++){
            int count=0;
            int X=sc.nextInt();
            for(int j=0;j<X;j++){
                if(Prime(j)){ 
                    count++;
                }
            }
            System.out.println(count);
        }   
    }
}
*/


    public static  int [] booleanArray(int num){

        boolean [] bool  = new boolean[num+1];
        int [] count = new int [num+1];
         bool[0] = true;
         bool[1] = true;

         for(int i=2; i*i<=num; i++){
             if(bool[i]==false){
                 for(int j=i*i; j<=num; j+=i)
                     bool[j] = true;
             }
         }

         int counter = 0;
         for(int i=1; i<=num; i++){
             if(bool[i]==false){
                 counter = counter+1;
                 count[i] = counter;
             }
             else
             {
                 count[i] = counter;
             }
         }
         return count;
    }
    public static void main (String[] args) throws IOException {
        InputStreamReader ak = new InputStreamReader(System.in);
        BufferedReader hk = new BufferedReader(ak);

        int[] v = booleanArray(100000);
        int t = Integer.parseInt(hk.readLine());
        for (int i = 1; i <= t; i++) {
            int a = Integer.parseInt(hk.readLine());
            System.out.println(v[a]);
        }
    }
}