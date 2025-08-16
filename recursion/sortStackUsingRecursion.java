import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> st) {
		if(st.size() == 1) return;

		int temp = st.pop();
		sortStack(st);
		insert(st, temp);
		return;
	}

	public static void insert(Stack<Integer> st, int temp){
		if(st.size() == 0 || st.peek() <= temp){
			st.push(temp);
			return;
		}

		int val = st.pop();
		insert(st, temp);
		st.push(val);
		return;
	}

}
