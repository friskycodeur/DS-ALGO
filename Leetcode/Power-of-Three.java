class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        /* double logVal = Math.log(n)/Math.log(3);
        return logVal == Math.ceil(logVal); */
        return 1162261467 % n == 0;
    }
}