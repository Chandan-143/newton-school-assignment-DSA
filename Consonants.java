/*

<---Question--->

Problem Statement
Given a string s. Print the string after removing all vowels.
Input
The only line of input contains a string of lowercase characters.

1 <= |S| <= 100000
Output
Print the string after removing all vowels.
Example
Sample Input 1:
dtcpt

Output:
dtcpt

Explanation:
There are no vowels in this string.

Sample Input 2:
ehoqggi

Output:
hqgg

Explanation:
There are three vowels in this string 'i' , 'e' and 'o'.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
   // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i=0; i<s. length(); i++){
            if(s.charAt(i) =='a'|| s.charAt(i)=='e'|| s.charAt(i) =='i'|| s.charAt(i)=='o'|| s.charAt(i) =='u'){
                continue;
            }
            else
            {
                System.out.print(s.charAt(i));
            }
        }  
    }

}