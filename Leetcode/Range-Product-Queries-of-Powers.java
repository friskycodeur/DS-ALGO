class Solution {
    int MOD = 1_000_000_007;

    private int powerProduct(int start, int end, ArrayList<Integer> powers){
        int res = 1;
        for(int i=start;i<=end;i++){
            res = (int)((long)res * powers.get(i) % MOD);
        }
        return res;
    }

    private ArrayList<Integer> calcPowers(int n){
        ArrayList<Integer> powers = new ArrayList<>();
        int i=0;
        while(n != 0){
            int x = n & -n;
            powers.add(x);
            n-=x;
        }
        return powers;
    }
    
    public int[] productQueries(int n, int[][] queries) {
        int sz = queries.length;
        int[] ans = new int[sz];
        ArrayList<Integer> powers = calcPowers(n);

        for(int i=0;i<sz;i++){
            ans[i] = powerProduct(queries[i][0], queries[i][1], powers);
        }

        return ans;
    }
}