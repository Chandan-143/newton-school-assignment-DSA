/*
 * Problem Statement
You are given a sequence of numbers of size N. You have to find if there is a way to insert + or - operator in between the numbers so that the result equals K.
Input
The first line of input contains two integers N and K. The next line of input contains N space- separated integers depicting the values of the sequence.

Constraints:-
1 <= N <= 20
-10^15 <= K <= 10^15
0 <= Numbers <=10^13
Output
Print YES if possible else print NO.
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String[] line1 = br.readLine().split(" ");
		int n = Integer.parseInt(line1[0]);
		long k = Long.parseLong(line1[1]);

		String[] line2 = br.readLine().split(" ");

		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(line2[i]);
		}
		boolean ans = checkInsertOperator(arr, k, n, arr[0], 1);
		if (ans == true) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}

	public static boolean checkInsertOperator(long[] arr, long k, int n, long sum, int index) {

		if (index == n) {
			if (sum == k) {
				return true;
			} else {
				return false;
			}
		}

		if (checkInsertOperator(arr, k, n, sum + arr[index], index + 1) == true) {
			return true;
		}

		return checkInsertOperator(arr, k, n, sum - arr[index], index + 1);
		
	}
}