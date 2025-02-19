class Solution {
    public int maxDifference(String s) {
        int odd = Integer.MIN_VALUE, even = Integer.MAX_VALUE;
        Map<Character, Integer> mp =  new HashMap<>();

        for(char c: s.toCharArray()){
            mp.put(c,1+ mp.getOrDefault(c,0));
        }

        for(char c: mp.keySet()){
            int currFreq = mp.get(c);
            if((currFreq&1) == 0){
                even = Math.min(even,currFreq);
            } else {
                odd = Math.max(odd, currFreq);
            }
        }

        return odd-even;
        
    }
}