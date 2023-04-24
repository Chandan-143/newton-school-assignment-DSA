/*
 Problem Statement
Given N cities in a line and your initial position, you want to visit all the cities at least once. You can go to one coordinate P to P+D or P-D where D is the number of steps which you choose initially. Your task is to find the maximum value of D such that you can visit all the cities at least once.
Input
The first line of input contains two integers N and X(initial position). The second line of input contains N space separated integers representing the location of cities.

Constraints:-
1 <= N <= 100000
1 <= City[] <= 100000000
Output
Print the maximum value of D such that you can visit all the cities.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static int travelling(int[] arr, int n, int x){
		int ans = 0;
		if(n==1){
			ans = Math.abs(x-arr[0]);
		}
		else if(n==2){
			ans = gcd(Math.abs(x-arr[0]),Math.abs(x-arr[1]));
		}
		else{
			for(int i=0; i<n; i++){
				arr[i] = Math.abs(arr[i]-x);
			}
			ans = arr[0];
			int max = 0;
			for(int i=1; i<n-1; i++){
				max = gcd(arr[i],arr[i+1]);
				ans = Math.min(ans,max);
			}
		}
		return ans;
	}
	public static int gcd(int a, int b){
		if (b == 0){
        	return a;
		}
      	return gcd(b, a % b);
	}
	public static void main (String[] args) {
                      // Your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		int[] city = new int[n];
		for(int i=0; i<n; i++){
			city[i] = s.nextInt();
		}
		System.out.print(travelling(city, n, x));
	}
}