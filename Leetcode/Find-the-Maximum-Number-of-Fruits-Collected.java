class Solution {
    int n;
    int[][] dp1;
    int[][] dp2;


    public int solveBottomLeftChild(int i, int j, int[][] fruits){
        if(i == n-1 && j== n-1) return 0;
        if(i<=j) return 0;
        if(dp1[i][j] != -1) return dp1[i][j];

        int maxFruits = 0;
        int currFruits = fruits[i][j];

        if(i-1>=0) maxFruits = Math.max(maxFruits, currFruits + solveBottomLeftChild(i-1,j+1, fruits)); 
        if(j+1<n) maxFruits = Math.max(maxFruits, currFruits + solveBottomLeftChild(i,j+1, fruits)); 
        if(i+1<n) maxFruits = Math.max(maxFruits, currFruits + solveBottomLeftChild(i+1,j+1, fruits)); 

        return dp1[i][j] = maxFruits;
    }

    public int solveTopRightChild(int i, int j, int[][] fruits){
        if(i == n-1 && j== n-1) return 0;
        if(i>=j) return 0;
        if(dp2[i][j] != -1) return dp2[i][j];

        int maxFruits = 0;
        int currFruits = fruits[i][j];

        if(j-1>=0) maxFruits = Math.max(maxFruits, currFruits + solveTopRightChild(i+1,j-1, fruits)); 
        if(j+1<n) maxFruits = Math.max(maxFruits, currFruits + solveTopRightChild(i+1,j+1, fruits)); 
        if(i+1<n) maxFruits = Math.max(maxFruits, currFruits + solveTopRightChild(i+1,j, fruits)); 

        return dp2[i][j] = maxFruits;
    }

    public int maxCollectedFruits(int[][] fruits) {
        n = fruits.length;
        dp1 = new int[n][n];
        dp2 = new int[n][n];

        for(int[] row: dp1) Arrays.fill(row,-1);
        for(int[] row: dp2) Arrays.fill(row,-1);

        int ans = 0;

        for(int i=0;i<n;i++){
            // top left child 
            ans+= fruits[i][i];
        }

        ans+= solveTopRightChild(0, n-1, fruits);
        ans+= solveBottomLeftChild(n-1, 0 , fruits);

        return ans;
    }
}