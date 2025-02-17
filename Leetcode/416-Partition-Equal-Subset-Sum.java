class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0, n = nums.length;
        for(int num: nums){
            totalSum += num;
        }
        if((totalSum & 1) == 1) return false;

        int reqSum = totalSum / 2;

        boolean[][] t = new boolean[n+1][reqSum+1];

        // Initialization Phase

        for(int j=0;j<reqSum+1;j++){
            t[0][j] = false;
        }

        for(int i=0;i<n+1;i++){
            t[i][0] = true;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=reqSum;j++){
                if(nums[i-1] <= j){
                    t[i][j] = (t[i-1][j-nums[i-1]]) || t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][reqSum];

    }
}