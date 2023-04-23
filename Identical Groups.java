/*
 Problem Statement
Myra has x red colour balls and y blue colour balls. She wants to distribute these balls into identical groups without any balls left. What is the largest number of groups she can make?

Identical groups mean there are equal number of same coloured balls in each group.
Input
A single line containing two integers x and y.

Constraints:
1<=x, y<=10000000
Output
Return the largest number of groups that can be made.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int Gcd(int x, int y){
        int gcd=1;
        for(int i=1; i<=x && i<=y; i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }return gcd;
    }

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int fect=Gcd(x,y);
        System.out.println(fect);
    }
}