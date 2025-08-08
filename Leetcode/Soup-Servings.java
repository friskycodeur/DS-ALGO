class Solution {
    private double[][] dp;

    public double getProb(int remA, int remB){
        if(remA <= 0 && remB <= 0) return 0.5; // both empty
        if(remA <= 0) return 1.0; // A empty first
        if(remB <= 0) return 0.0; // B empty first

        if (dp[remA][remB] >= 0) return dp[remA][remB];

        double res = 0.25 * (getProb(remA-4, remB) + getProb(remA-3, remB-1) + getProb(remA-2, remB-2) + getProb(remA-1, remB-3));
        return dp[remA][remB] = res;
    }
    
    public double soupServings(int n) {
        if (n > 4800) return 1.0;
        int N = (n+24)/25;
        dp = new double[N + 1][N + 1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], -1.0);
        }
        return getProb(N,N);
    }
}