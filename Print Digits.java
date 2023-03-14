/*
<--Question-->

Problem Statement
Given a natural number N, your task is to print all the digits of the number in English words. The words have to separate by space and in lowercase English letters.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Print_Digit() that takes integer N as a parameter.

Constraints:-
1 ≤ N ≤ 107
Output
Print the digits of the number as shown in the example.
Note:-
Print all digits in lowercase English letters
Example
Sample Input:-
1024

Sample Output:-
one zero two four

Sample Input:-
2

Sample Output:-
two
*/

static void Print_Digits(int N){
//Enter your code here
String str="";
while(N>0){
    int rem=N%10;
     if(rem==1)str="one "+str;
    else if(rem==2)str="two "+str;
    else if(rem==3)str="three "+str;
    else if(rem==4)str="four "+str;
    else if(rem==5)str="five "+str;
    else if(rem==6)str="six "+str;
    else if(rem==7)str="seven "+str;
    else if(rem==8)str="eight "+str;
    else if(rem==9)str="nine "+str;
    else if(rem==0)str="zero "+str;
    //  N=N/10;

     N/=10;
}
       System.out.println(str);
}