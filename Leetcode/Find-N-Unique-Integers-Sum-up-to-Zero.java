class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int idx = 0, half = n/2;
        if((n&1) == 1) {
            ans[idx++] = 0;
        }

        while(idx<n){
            ans[idx++] = half;
            ans[idx++] = (-1)*half;
            half--;
        }

        return ans;

    }
}