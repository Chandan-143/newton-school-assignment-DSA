/*
 * Problem Statement
Given a string s of length n. Find all the repeating characters and count their occurrence. A character is a repeating character if it occurs more than once.
Input
First line contains n.
Next line contains the string s.

Constraints
1 ≤ n ≤ 105
s contains only lowercase English letters.
Output
Print all the repeating characters and their frequency. Print in order from 'a' to 'z'.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count[]= new int [256];
        String s1 = sc.next();
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
        }
        for (int i=0;i<256;i++){
            if(count[i]>1){
                System.out.println((char) (i)+" "+count[i]);
            }
        }
    }
}