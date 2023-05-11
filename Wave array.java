/*
 * Problem Statement
Given an N-size array of unique integers, your task is to print the array in a waveform, i. e a1 >= a2 <= a3 >= a4 <= a5.. . print the lexicographically smallest array possible.
Input
The first line of input contains a single integer N, next line contains N space-separated integers depicting the values of the array.

Constraints:-
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 109
Output
Print the array in wave form as mentioned.
 */

 class Main {
    private static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    private static long lcm(long a, long b){
        return ((a*b) / gcd(a,b));
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long res = 1;

        for(int i=1; i<=n; i++){
            res = lcm(res,i);
        }
        System.out.println(res);
    }
}