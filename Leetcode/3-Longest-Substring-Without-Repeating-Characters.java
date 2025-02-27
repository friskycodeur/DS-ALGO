class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp = new HashMap<Character,Integer>();
        int l = 0;
        int maxLen = 0;
        for(int r=0;r<s.length();r++){
            char currChar = s.charAt(r);
            if(mp.containsKey(currChar) && mp.get(currChar) >= l){
                l = mp.get(currChar) + 1;
            }
            maxLen = Math.max(maxLen, r-l+1);
            mp.put(currChar, r);
        }
        return maxLen;
    }
}