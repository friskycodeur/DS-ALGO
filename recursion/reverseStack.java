import java.util.Stack;

public class Solution {
    
	public static void reverseStack(Stack<Integer> st) {
		if(st.size()==1){
			return;
		}
		int val = st.pop();
		reverseStack(st);
		insert(st, val);
	}

	public static void insert(Stack<Integer> st, int ele) {
		if(st.size()==0){
			st.push(ele);
			return;
		}
		int temp = st.pop();
		insert(st, ele);
		st.push(temp);
	}

}
