class Solution {
    public int majorityElement(int[] nums) {
        int currMajor = 0;
        int currMajorCnt = 0;

        for(int num:nums){
            if(currMajorCnt == 0){
                currMajor = num;
                currMajorCnt++;
            } else if(currMajor == num) {
                currMajorCnt++;
            } else {
                currMajorCnt--;
            }
        }

        return currMajor;
        
    }
}