/*
 * Problem Statement
Alice and Bob are playing a game with a binary string S of length N and an empty string T. They both take turns and Alice plays first. In Alice's turn, she picks the first character of string S, appends the character to either the front or back of string T and deletes the chosen character from string S. In Bob's turn, he picks the last character of string S, appends the character to either the front or back of string T and deletes the chosen character from string S. The game stops when S becomes empty. Alice wants the resultant string T to be lexicographically smallest, while Bob wants the resultant string T to be lexicographically largest possible. Find the resultant string T, if both of them play optimally.
Input
The first line of input will contain a single integer T, denoting the number of test cases. Each test case consists of multiple lines of input. The first line of each test case contains a single integer N - the length of the string S. The next line is the binary string S.

Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 1000
S can only contain the characters 0 or 1.
Output
For each test case, print the the resultant string T, if both of them play optimally.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		   String str=in.next();
		   String str1="";
		   int a=0;
		   int b=n-1;
		   for (int i=0;i<n/2 ;i++ ){
		     char c=str.charAt(a);
		     if(c=='1')str1=str1+c;
		     else str1=c+str1;
		      char c1=str.charAt(b);
		     if(c1=='0')str1=str1+c1;
		     else str1=c1+str1;
		     a++;b--;
		   } 
		   if(n%2!=0){
		    char c=str.charAt(a);
		     if(c=='1')str1=str1+c;
		     else str1=c+str1;
			 }
		     System.out.println(str1);
		}
	}
}