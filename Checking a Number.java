/*
<--Question-->

Problem Statement
Write a program to check whether a number is positive, negative or zero using switch case.
Input
The first line of the input contains the number

Constraints
-109 ≤ n ≤ 109
Output
Print the single line wether it's "Positive", "Negative" or "Zero"
Example
Sample Input :
13

Sample Output :
Positive

Sample Input :
-13

Sample Output :
Negative
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        switch(n){
            case 0:
            System.out.println("Zero");
            break;
            default:
        switch(n>>31){
                case 0:
                System.out.println("Positive");
                break;
                default:
                System.out.println("Negative");
            }
           
        }
        sc.close();
    }
}