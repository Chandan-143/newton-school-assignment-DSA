/*
 * Problem Statement
A string is called AB string if it's of length at least 2 and all it's characters are A except the last character which is B.

You have an empty string s, you can do the following operation any number of times.

Choose any position of s and insert any AB string in that position.

You are given a string t of some length containing only A and B. Find out if it is possible to convert s to t after some operations.
Input
First line contains N denoting the length of t.
Next line contains t.

Constraints
1 <= N <= 105
t contains only A and B.
Output
Output "YES" or "NO".
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static void main(String[] args) {
      Scanner in= new Scanner(System.in);
       int n=Integer.parseInt(in.next());
        String s=in.next();
        
        int cnt=0;
        int f=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == 'A'){
                if(cnt == 0){
                    if(f == 0){
                        f=-1;
                        break;
                    }
                }
                else cnt--;
            }
            else{
                cnt++;
                f=1;
            }
        }
        if(f == -1 || cnt != 0){
            System.out.print("NO");
        }
        else{
             System.out.print("YES");
        } 
    }
}