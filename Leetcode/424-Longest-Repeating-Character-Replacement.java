class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freqMap = new HashMap<>();
        int left =0, maxFreq = 0, maxLen = 0;

        for(int right=0;right<s.length();right++){
            char currChar = s.charAt(right);
            freqMap.put(currChar,freqMap.getOrDefault(currChar,0)+1);
            maxFreq = Math.max(maxFreq, freqMap.get(currChar));

            if ((right - left + 1 - maxFreq) > k){
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar)-1);
                //if(freqMap.get(leftChar) == 0) freqMap.remove(leftChar);
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
    }
}