/*

<---Question--->

Problem Statement

Some Data types are given below:-
Integer
Long
float
Double
char
Your task is to take input in the given format and print them in the same order.
Input
You don't have to worry about input, you just have to complete the function printDataTypes()
Output
Print each element in a new line in the same order as the input.
Note:- Print float round off to two decimal places and double to 4 decimal places.
Example
Sample Input:-
2
2312351235
1.21
543.1321
c

Sample Output:-
2
2312351235
1.21
543.1321
c
*/

static void printDataTypes(int a, long b, float c, double d, char e)
{
      System.out.println(a);
      System.out.println(b);
      System.out.printf("%.2f\n",c);
      System.out.printf("%.4f\n",d);
      System.out.println(e);
}