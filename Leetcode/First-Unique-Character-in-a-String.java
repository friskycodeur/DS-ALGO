class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> freq_map =new HashMap<Character,Integer>();
\t\tfor(Character ch: s.toCharArray()){
\t\t\tfreq_map.put(ch, freq_map.getOrDefault(ch,0)+1);
\t\t}

\t\tfor(int i=0;i<s.length();i++){
\t\t\tif(freq_map.get(s.charAt(i)) == 1) return i;
\t\t}

\t\treturn -1;
    }
}