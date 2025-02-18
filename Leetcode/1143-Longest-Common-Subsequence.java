class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1 == null || text1.length() == 0 || text2 == null || text2.length() == 0) return 0;
        int n = text1.length(), m = text2.length();
        int[][] t = new int[n+1][m+1];
        
        /* Recursive Approach
        return findLCS(text1, text1.length(), text2, text2.length());
        */

        /* Memoization

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                t[i][j] = -1;
            }
        }

        return findLCS(text1, n, text2, m, t);
        */

        // top-down

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                } else {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        
        return t[n][m];
    }

    /* Recursive Approach

    public int findLCS(String s1, int n,String s2,int m){
        if(n==0 || m==0){
            return 0;
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return 1 + findLCS(s1, n-1, s2, m-1); 
        }

        return Math.max(findLCS(s1, n, s2, m-1) , findLCS(s1, n-1, s2, m));
    }

    */

    /* Memoization

    public int findLCS(String s1, int n,String s2,int m, int[][] t){
        if(n==0 || m==0){
            return 0;
        }

        if(t[n][m] != -1){
            return t[n][m];
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return t[n][m] = 1 + findLCS(s1, n-1, s2, m-1, t); 
        }

        return t[n][m] = Math.max(findLCS(s1, n, s2, m-1, t) , findLCS(s1, n-1, s2, m, t));
    }

    */

}