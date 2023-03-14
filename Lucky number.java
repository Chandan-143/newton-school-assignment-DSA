/*
<--Question-->
Problem Statement
A 2n digits number is said to be lucky if sum of n most significant digits is equal to sum of n least significant digits.

Given a number find out if the number is lucky or not?
Input
First line contains n.
Next line contains a number of 2n digits.

Constraints
1 ≤ n ≤ 105
Number contains digits only.
Output
Print "LUCKY" if the number is lucky otherwise print "UNLUCKY".
Example
Input:
3
213411

Output:
LUCKY

Explanation :
sum of 3 most significant digits = 2 + 1 + 3 = 6
sum of 3 least significant digits = 4 + 1 + 1 = 6

Input:
1
69

Output:
UNLUCKY
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
        sc.nextLine();
        String s = sc.nextLine();
        
        int s1 = 0;
        for(int i = 0; i<n; i++){
            s1+=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        int s2 = 0;
        for(int i = n; i<s.length(); i++){
            s2+=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if (s1 == s2){
            System.out.println("LUCKY");
        }
        else{
            System.out.println("UNLUCKY");
        }

    }
}