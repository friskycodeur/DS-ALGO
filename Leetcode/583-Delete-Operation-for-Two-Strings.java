class Solution {
    public int minDistance(String word1, String word2) {
        if(word1 == null || word1.length() == 0 || word2 == null || word2.length() == 0) return 0;

        int n = word1.length(), m = word2.length();
        int[][] t = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                } else {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }

        return (n - t[n][m]) + (m - t[n][m]);
    }
}