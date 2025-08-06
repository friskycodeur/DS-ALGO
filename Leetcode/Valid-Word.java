class Solution {
    public boolean isValid(String word) {
        if(word == null || word.length() <3) return false;

        boolean conPresent = false, vowPresent = false; 
        for(char c: word.toCharArray()){
            if(c >= '0' && c<= '9') continue;
            if((c>= 'a' && c<= 'z') || (c>= 'A' && c<= 'Z')){
                switch(c){
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                        vowPresent = true;
                        break;
                    default:
                        conPresent = true;
                        break;
                }
            } else {
                return false;
            }
        }  

        return (vowPresent && conPresent);
    }
}