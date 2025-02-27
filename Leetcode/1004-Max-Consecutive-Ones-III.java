class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0, left = 0, maxLen = 0;
        for(int right =0; right < nums.length; right++){
            if(nums[right] == 0) zeroCount++;
            while(zeroCount > k && left <= right){
                if(nums[left] == 0) zeroCount--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}