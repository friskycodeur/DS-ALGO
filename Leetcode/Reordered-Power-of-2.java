class Solution {
    private int[] digitCount(int val){
        int[] cnt = new int[10];
        while(val>0){
            cnt[val%10]++;
            val/=10;
        }
        return cnt;
    }

    public boolean reorderedPowerOf2(int n) {
        int[] target = digitCount(n);

        for(int i=1;i>0 && i<=1_000_000_000;i<<=1){
            if(Arrays.equals(target,digitCount(i))){
                return true;
            }
        }

        return false;
        
    }
}