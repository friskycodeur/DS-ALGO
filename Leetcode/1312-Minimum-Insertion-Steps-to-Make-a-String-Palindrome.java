class Solution {
    public int minInsertions(String s) {
        if(s == null || s.length() == 0) return 0;

        int n = s.length();
        String s2 = new StringBuilder(s).reverse().toString();
        int[][] t = new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1) == s2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                } else {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }

        return n-t[n][n];
    }
}