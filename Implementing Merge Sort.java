/*
 * Problem Statement
Given an unsorted array, your task is to sort the array using merge sort.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function implementMergeSort() that takes 3 arguments.
arr: input array
start: starting index which is 0
end: ending index of array

Constraints
1 <= T <= 100
1 <= N <= 106
0 <= Arr[i] <= 109

Sum of 'N' over all test cases does not exceed 106
Output
You need to return the sorted array. The driver code will print the array in sorted form.

 */

 public static int[] implementMergeSort(int arr[], int start, int end)
    {
        mergeSort(arr,start,end);
        return arr;
    }
    public static void merge(int arr[], int start, int mid, int end) {
        int n1 = mid-start+1;
        int n2 = end-mid;
        
        int a[] = new int[n1];
        int b[] = new int[n2];
        
        for(int i = 0; i < n1; ++i)
            a[i] = arr[start+i];
        
        for(int i = 0; i < n2; ++i)
            b[i] = arr[mid+1+i];
        
        int i = 0, j = 0, k = start;
        
        while(i < n1 && j < n2) {
            if(a[i] < b[j])
                arr[k++] = a[i++];
            else
                arr[k++] = b[j++];
        }

        //Some elements left inside a array
        while(i < n1)
            arr[k++] = a[i++];
        
        //Some elements are left inside b array
        while(j < n2)
            arr[k++] = b[j++];
    }
    
    public static void mergeSort(int arr[], int start, int end) {
        if(start < end) {
            int mid = (start+end)/2;
            
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            
            merge(arr, start, mid, end);
        }
    }