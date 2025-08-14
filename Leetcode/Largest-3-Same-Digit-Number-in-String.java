class Solution {
    public String largestGoodInteger(String num) {
        if(num==null || num.isEmpty()) return "";
        char currChar = '/', maxChar = '/';
        int sz = 0;
        String ans = "";
        for(char ch: num.toCharArray()){
            // check if char is latest or not
            if(ch == currChar){
            // if yes size++
                sz++;
            } else {
                // if not, check size so far
                // if size >= 3, then check if currChar > maxChar, if yes populate maxChar by currChar
                // now set size to 1 and currChar to num.charAt(i)

                if(sz>=3 && currChar > maxChar){
                    maxChar = currChar;
                }
                currChar = ch;
                sz = 1;
         
           }
        }

        if(sz>=3 && currChar > maxChar){
            maxChar = currChar;
        }

        return maxChar == '/' ? ans : ans + String.valueOf(maxChar).repeat(3);
    }
}