class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int a=1;a<n;a++){
            int b = n-a;
            if(hasNoZero(a) && hasNoZero(b)){
                return new int[]{a,b};
            }
        }
        
        return new int[2];
    }

    private boolean hasNoZero(int num){
        while (num>0){
            if(num%10 ==0) return false;
            num/=10;
        }
        return true;
    }
}