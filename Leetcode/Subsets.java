class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> op = new ArrayList<>();
        subsets(nums, op, 0);
        return res;
    }

    public void subsets(int[] nums, ArrayList<Integer> op, int idx) {
        if(idx >= nums.length){
            res.add(new ArrayList<>(op));
            return;
        }
        
        subsets(nums, new ArrayList<>(op), idx+1);
        op.add(nums[idx]);
        subsets(nums, new ArrayList<>(op), idx+1);
    }
}