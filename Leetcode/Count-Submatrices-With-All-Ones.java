class Solution {
    public int numSubmat(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] dp = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j] == 1){
                    dp[i][j] = (j==0 ? 1 : dp[i][j-1] + 1);
                }
            }
        }

        int ans = 0;
        for(int j = 0; j <cols; j++){
            for(int i=0;i<rows;i++){
                if(mat[i][j] == 1){
                    int width = dp[i][j];
                    for(int k=i;k>=0 && dp[k][j] >0; k--){
                        width = Math.min(width, dp[k][j]);
                        ans+= width;
                    }
                }
            }
        }

        return ans;
    }
}