/*
Problem Statement
Write a program to print the pattern of "*" in the form of the Right Angle Triangle.
See the below example for clarity.
Input
Since this is a functional problem, you don't have to worry about the input. It will be handled by driver code. You just have to complete printTriangle().

In the custom input area, you can provide any positive integer and check whether your code is working or not.
Output
Print the right angle triangle of height 5 as shown.
Example
Sample Input:
No Input

Sample Output:-
*
* *
* * *
* * * *
* * * * *

*/

class Solution {
public static void printTriangle(){
// Your code here
for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println(" ");
}
}
}
