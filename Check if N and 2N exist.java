/*
 * Problem Statement
Given an integer array A of size N. Find whether there exist two index i and j such that i != j and A[i] = 2 * A[j].
Input
First line contains an integer N.
Next line contains N space separated integers denoting elements of array.

Constraints
1 <= N <= 10^5
1 <= Ai <= 10^5
Output
Print "YES" if there exist two index i and j which fulfil the above constraints. Otherwise print "NO".
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static boolean binarySearch(int arr[],int l,int r,int k){
        if(l<=r) { // if this is false, no element to search
            int mid = l + (r - l) / 2;

            if (arr[mid] == k) {
                return true;
            } else if (arr[mid] < k) {  // ignore left side to search
                return binarySearch(arr, mid + 1, r, k);
            } else if (arr[mid] > k) {  // ignore right side to search
                return binarySearch(arr, l, mid - 1, k);
            }
        }
        return false; 
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr); 
        boolean possible=false;
        for(int i=0;i<=n-2;i++){
            if(binarySearch(arr,i+1,n-1,2*arr[i])){
                possible=true;
                break;
            }
        }
        if(possible){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}