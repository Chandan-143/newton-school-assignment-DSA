/*
 * Problem Statement
Print a sequence of numbers starting with N, without using loop, in which A[i+1] = A[i] - 5, if A[i]>0, else A[i+1] = A[i] + 5 repeat it until A[i]=N.

Note:- Once you change a operation you need to continue doing it.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function PrintPattern() that takes the integer N and the integer curr (curr = N) and bool flag (flag = true) as a parameter.

Constraints:
1<=T<=10
0 < N < 1000
Output
Print the pattern with space-separated integers.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input:
2
16
10

Sample Output:
16 11 6 1 -4 1 6 11 16
10 5 0 5 10

Explanation:
We basically first reduce 5 one by one until we reach a negative or 0. After we reach 0 or negative, we one by one add 5 until we reach N.
 */


 static void printPattern(int n,int curr, boolean flag)
{
//Enter your code here
  System.out.print(curr+" ");

  if(flag==false && curr==n){
      return;
  }
  if(curr<=0){
       flag=false;
  }
  if(flag){
       printPattern(n,curr-5,flag);
  }
  else{
      printPattern(n,curr+5,flag);
  }
}