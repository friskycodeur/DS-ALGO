class Solution {
    Map<List<Integer>, Integer> resMap = new HashMap<>();

//    List<> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> op = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(op, new ArrayList<>(), nums, 0);
        return op;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            // Skip duplicates at the same recursive tree level
            if (i > start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}