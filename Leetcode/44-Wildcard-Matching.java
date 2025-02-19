class Solution {
    static boolean isAllStars(String s, int i) {
        for (int j = 1; j <= i; j++) {
        if (s.charAt(j - 1) != '*')
            return false;
        }
        return true;
    }

    public boolean isMatch(String s, String t) {
        // if(s==null || s.length() == 0|| t==null || t.length() == 0) return false;
        int n = s.length(), m = t.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;

        for (int i = 1; i <= m; i++) {
            dp[0][i] = isAllStars(t,i);
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1) == t.charAt(j-1) || t.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    if(t.charAt(j-1) == '*'){
                        dp[i][j] = dp[i-1][j] || dp[i][j-1];
                    } 
                    else {
                        dp[i][j] = false;
                    }
                }
            }
        }

        return dp[n][m];
    }
}