class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int res = 0, n = nums.length;
        if(n < 1) return 0;
        for(int i=0;i<n;i++){
            if(isGoodNumber(nums, i-k, i+k, i, n)){
                res += nums[i];
            }
        }
        return res;
    }

    public boolean isGoodNumber(int[] nums, int left, int right, int idx, int n){
        // left 
        if(left >= 0 && nums[left] >= nums[idx]){
            return false;
        }

        // right
        if(right < n && nums[right] >= nums[idx]){
            return false;
        }

        return true;
    }
}