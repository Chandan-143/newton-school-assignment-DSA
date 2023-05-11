/*
 * Problem Statement
Given an array of N elements and a number K. The task is to arrange array elements according to the absolute difference with K, i. e., element having minimum difference comes first and so on.


Note : If two or more elements are at equal distance arrange them in same sequence as in the given array.
Input
First line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of test case contains two space separated integers N and K. Second line of each test case contains N space separated integers.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= K <= 10^4
1 <= A[i] <= 10^4

Sum of N over all test cases does not exceed 2*10^5
Output
For each test case print the given array in the order as described above.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void rearrange(int[] arr, int n, int x){
        TreeMap<Integer, ArrayList<Integer> > m = new TreeMap<>();
 
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(x - arr[i]);
            if (m.containsKey(diff)) {
                ArrayList<Integer> al = m.get(diff);
                al.add(arr[i]);
                m.put(diff, al);
            }
            else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(arr[i]);
                m.put(diff, al);
            }
        }
        int index = 0;
        for (Map.Entry entry : m.entrySet()) {
            ArrayList<Integer> al = m.get(entry.getKey());
            for (int i = 0; i < al.size(); i++)
                arr[index++] = al.get(i);
        }
    }
 
   
    static void printArray(int[] arr, int n){
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
    }
    public static void main (String[] args) {
      
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            } 
                 rearrange(arr, n, m);
                    printArray(arr, n);
        }
    }
}