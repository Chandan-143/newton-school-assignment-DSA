/*
 * Problem Statement
Given an integer array nums of size n, return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].
Input
Implement the given function.

Constraints:
1 <= n <= 10^5
1 <= nums[i] <= 10^9
Output
Return the count array.
 */

 class Solution{
    
    public List<Integer> countSmaller(int[] nums) {
          List<Integer> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        
        int[] idx = new int[nums.length];
        for(int i = 0; i < idx.length; i++) {
            idx[i] = i;
            result.add(i, 0);
        }
        
        helper(nums, idx, result, 0, idx.length-1);
        return result;
    }
    
    void helper(int[] nums, int[] idx, List<Integer> result, int l, int r) {
        if(l >= r) return;
        
        int mid = (l + r) >>> 1;
        helper(nums, idx, result, l, mid);
        helper(nums, idx, result, mid+1, r);
        merge(nums, idx, l, r, result);
    }
    
    void merge(int[] nums, int[] idx, int l, int r, List<Integer> result) {
        int m = (l + r) >>> 1;
        int i = l; 
        int j = m + 1;
        int[] temp = new int[r - l + 1];
        int k = 0;
        
        while(i <= m) {
            while(j <= r && nums[idx[i]] > nums[idx[j]]) {
                temp[k++] = idx[j++];
            }
            
            int len = j - (m+1);
            result.set(idx[i], result.get(idx[i]) + len);
            
            temp[k++] = idx[i++];
        }
        
        while(j <= r) temp[k++] = idx[j++];
        
        for(i = l; i <= r; i++) {
            idx[i] = temp[i - l];
        }
    }
}