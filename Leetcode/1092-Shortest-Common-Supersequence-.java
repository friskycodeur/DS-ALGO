class Solution {
    public String shortestCommonSupersequence(String text1, String text2) {
        if(text1 == null || text1.length() == 0 || text2 == null || text2.length() == 0) return text1+text2;
        int n = text1.length(), m = text2.length();
        int[][] t = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                } else {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        
        return getSCS(text1, text2, t, n, m);
    }

    public String getSCS(String s1, String s2, int[][] t, int n, int m){
        StringBuilder sb = new StringBuilder();
        int i = n, j = m;
        while(i>0 && j>0){
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                sb.append(s1.charAt(i - 1));
                i--;j--;
            } else {
                // If not matching, we need to explore both paths: up and left
                if (t[i - 1][j] == t[i][j]) {
                    sb.append(s1.charAt(i-1));
                    i--;
                }
                else {
                    sb.append(s2.charAt(j-1));
                    j--;
                }
            }
        }

        // Add remaining characters from s1 and s2
        while (i > 0) {
            sb.append(s1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            sb.append(s2.charAt(j - 1));
            j--;
        }

        return sb.reverse().toString();
    }
}