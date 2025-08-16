class Solution {
    public int maximum69Number (int num) {
        int earliestSixIdx = -1, tempNum = num, i = 0;
        while(tempNum > 0){
            if(tempNum%10 == 6){
                earliestSixIdx = i;
            }
            tempNum /= 10;
            i++;
        }

        return num + (3 * (int)Math.pow(10, earliestSixIdx));
    }
}