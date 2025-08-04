class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 1) return;
        k = k%nums.length;
        rotate(nums, 0, nums.length-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, nums.length-1);
    }

    private static void rotate(int[] nums, int start, int end){
        while(start <= end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i1, int i2){
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp; 
    }


}