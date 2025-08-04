class Solution {
    public int removeDuplicates(int[] nums) {
        int populationIdx = 0;
        for(int i=1;i< nums.length;i++){
            if(nums[populationIdx] != nums[i]){
                nums[populationIdx+1] = nums[i];
                populationIdx++;
            }
        }
        return populationIdx+1;
    }
}