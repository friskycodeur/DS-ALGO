class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, left = 0, right  = nums.length-1, k = nums.length-1;
        int[] res = new int[n];
        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[k] = nums[left]*nums[left];
                left++;
            } else  {
                res[k] = nums[right]*nums[right];
                right--;
            }
            k--;
        }
        return res;
    }
}