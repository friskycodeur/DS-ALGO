class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> pmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(pmap.containsKey(target-nums[i])){
                return new int[]{pmap.get(target-nums[i]),i};
            }
            pmap.put(nums[i],i);
        }
        return new int[]{};
    }
}