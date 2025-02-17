class Solution {
    public int findTargetSumWays(int[] arr, int d) {
        int sum = 0, n = arr.length;
        for(int num: arr) sum += num;
        sum -= d;
        if(sum < 0 || (sum&1)==1) return 0;
        int s1 = sum/2;
        
        int[][] dp = new int[n+1][s1+1];
        
        // initialization
        
        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }
        
        // logic
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=s1;j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[n][s1];

    }
}