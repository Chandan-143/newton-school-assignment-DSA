// Problem Statement
// The grasshopper is located on the numeric axis at the point with coordinate x0. Having nothing else to do he starts jumping between integer points on the axis. Making a jump from a point with coordinate x with a distance d to the left moves the grasshopper to a point with a coordinate x−d, while jumping to the right moves him to a point with a coordinate x+d. The grasshopper is very fond of positive integers, so for each integer, i starting with 1 the following holds: exactly I minute after the start he makes a jump with a distance of exactly i. So, in the first minutes, he jumps by 1, then by 2, and so on.
// The direction of a jump is determined as follows: if the point where the grasshopper was before the jump has an even coordinate, the grasshopper jumps to the left, otherwise he jumps to the right.
// Find exactly which point the grasshopper will be at after exactly n jumps.
// Input
// The input consists of two space- separated integers x0 and n denoting the coordinate of the grasshopper's initial position and the number of jumps.

// Constraints
// −1014 ≤ x0 ≤ 1014
// 0 ≤ n ≤ 1014
// Output
// Print the coordinate of the point the grasshopper will be at after making n jumps from the point x0.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();

       if(x%2!=0){
           if(n%4==0){
               System.out.println(x);
           }
           else if(n%4==1){
               System.out.println(x+n);

           }
           else if(n%4==2){
               System.out.println(x-1);
               
           }
            else if(n%4==3){
               System.out.println(x-n-1);
               
           }
       }
       else {
           if(n%4==0){
               System.out.println(x);

           }
           else if(n%4==1){
               System.out.println(x-n);

           }
           else if(n%4==2){
               System.out.println(x+1);
               
           }
             else if(n%4==3){
               System.out.println(x+n+1);
               
           }
       }
    }
}