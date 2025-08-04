class Solution {
    public boolean check(int[] nums) {
        if(nums == null || nums.length <= 1) return true;
        int unsortedPairCount = 0, n = nums.length;

        if(nums[n-1] > nums[0]) unsortedPairCount++;

        for(int i=0; i<n-1;i++){
            if(nums[i] > nums[i+1]) unsortedPairCount++; 
        }

        return unsortedPairCount <= 1 ? true : false;
    }
}