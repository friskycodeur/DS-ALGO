class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int left = 0, n = nums.length, maxLen = Integer.MIN_VALUE;

        for(int right = 0; right < n; right++){
            if(nums[right] == 0) {
                maxLen = Math.max(maxLen, right - left);
                left = right + 1;
            }
        }
        
        return Math.max(maxLen, n - left);
        
    }
}