class Solution {
    public String largestGoodInteger(String num) {
        if(num==null || num.isEmpty()) return "";
        char maxChar = Character.MIN_VALUE;
        for(int i=0; i< num.length()-2;i++){
            char currChar = num.charAt(i);
            if(currChar == num.charAt(i+1) && currChar == num.charAt(i+2)){
                if(currChar>maxChar) maxChar = currChar;
                if(maxChar == '9') break; 
            }
        }

        return maxChar > Character.MIN_VALUE ? String.valueOf(maxChar).repeat(3) : "";
    }
}