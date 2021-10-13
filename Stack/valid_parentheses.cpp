//https://leetcode.com/problems/valid-parentheses/

class Solution {
public:
    bool isValid(string s) {
        stack<int> st;
        int n=s.size();
        for(int i=0;i<n;i++){
            if(s[i]=='(' or s[i]=='[' or s[i]=='{'){
                st.push(s[i]);
            }else{
                if(st.empty()) return false;
                char c =st.top();
                st.pop();
                if((s[i]==')' && c=='(') or (s[i]==']' && c=='[') or (s[i]=='}' && c=='{')){
                    
                }else{
                    return false;
                }
            }
        }
        if(st.empty()) return true;
        return false;
    }
};