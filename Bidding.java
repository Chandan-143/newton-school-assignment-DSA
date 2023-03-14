/*
Alice, Bob and Charlie are bidding for an artifact at an auction. Alice bids A rupees, Bob bids B rupees, and Charlie bids C rupees (where A, B, and C are distinct). According to the rules of the auction, the person who bids the highest amount will win the auction. Determine who will win the auction.
Input
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains three integers A, B, and C, — the amount bid by Alice, Bob, and Charlie respectively.

Constraints
1 ≤ T ≤ 1000
1 ≤ A, B, C ≤ 1000
A, B, and C are distinct.
Output
For each test case, output who (out of Alice, Bob, and Charlie) will win the auction.
Example
Sample Input :
4
200 100 400
155 1000 566
736 234 470
124 67 2

Sample Output :
Charlie
Bob
Alice
Alice

Explanation :

Charlie wins the auction since he bid the highest amount.

Bob wins the auction since he bid the highest amount.

Alice wins the auction since she bid the highest amount.

Alice wins the auction since she bid the highest amount.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for(int i=1;i<=T;i++){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=sc.nextInt();
            if(A>B && A>C){
                System.out.println("Alice");
            }
            else if(B>A && B>C){
                System.out.println("Bob");
            }
            else if(C>A && C>B){
                System.out.println("Charlie");
            }
            else{
                return;
            }
        }
    }
}