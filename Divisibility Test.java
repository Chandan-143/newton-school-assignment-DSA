/*
 * Problem Statement
You are given a big number in form of a string A of characters from 0 to 9.

Check whether the given number is divisible by 30 .
Input
The first argument is the string A.

Constraints
1 ≤ |A| ≤ 105
Output
Return "Yes" if it is divisible by 30 and "No" otherwise.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input :
3033330

Sample Output:
Yes
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int sum=0;
        int  n=str.length();
        int lastDisits=str.charAt(n-1)-'0';
        for(int i=0;i<n;i++){
            sum+=str.charAt(i)-'0';
        }
        if(sum%3==0 && lastDisits==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}