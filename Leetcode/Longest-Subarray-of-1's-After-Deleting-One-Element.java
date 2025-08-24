class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0, left = 0, maxLen = Integer.MIN_VALUE;
        for(int right =0; right < nums.length; right++){
            if(nums[right] == 0) zeroCount++;
            while(zeroCount > 1 && left <= right){
                if(nums[left] == 0) zeroCount--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }
}