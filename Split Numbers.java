/*
 * 
 

Problem Statement
You are given a multiset (i. e. a set that can contain multiple equal integers) containing 2n integers. Determine if you can split it into exactly n pairs (e.g. each element should be in exactly one pair) so that the sum of the two elements in each pair is odd (i. e. when divided by 2, the remainder is 1).
Input
The first line of input contains an integer n. The second line of the input contains 2n integers a1, a2, …, a2n, (0≤ai≤100) denoting the numbers in the set.

Constraints
1 ≤ n ≤ 100
0 ≤ ai ≤ 100
Output
Print "Yes" if it can be split into exactly n pairs so that the sum of the two elements in each pair is odd, and "No" otherwise.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
2
2 3 4 5
Sample Output 1
Yes

Sample Input 2
3
2 3 4 5 5 5
Sample Output 2
No

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean possible = true;
        int oddCount = 0, evenCount = 0;
        for (int i = 0; i < 2*n; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        if (oddCount != evenCount) {
            possible = false;
        }
        System.out.println(possible ? "Yes" : "No");
        sc.close();
    
    }
}

