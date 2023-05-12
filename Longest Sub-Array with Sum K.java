/*
 * Problem Statement
Given an array containing N integers and an integer K. Your task is to find the length of the longest Sub-Array with sum of the elements equal to the given value K.
Input
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case contains two integers N and K and the second line contains N space-separated elements of the array.

Constraints:-
1<=T<=500
1<=N,K<=10^5
-10^5<=A[i]<=10^5

Sum of N over all test cases does not exceed 10^5
Output
For each test case, print the required length of the longest Sub-Array in a new line. If no such sub-array can be formed print 0.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {

// ------------------k
    public static void longestSubArrayHavingSumK(int arr[],int n, int k){
            int ans=0;
            int sum=0;

            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<n;i++){
                sum=sum+arr[i];

                if(sum==k){
                    ans=i+1;
                }
                
                if(!hm.containsKey(sum)){
                    hm.put(sum,i);
                }

                // subarrays inbw
                if(hm.containsKey(sum-k)){
                    ans=Math.max(ans,i-hm.get(sum-k));
                }
                
            }

            System.out.println(ans);

    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            if(t%12==0){  // 12, 24,36
                System.gc();
            }
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            longestSubArrayHavingSumK(arr,n,k);
        }
    }
}