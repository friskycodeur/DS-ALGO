import java.util.* ;
import java.io.*; 
public class Solution {
	public static void deleteMiddle(Stack<Integer> inputStack, int N) {
		deleteMid(inputStack, 0, N);
	}

	public static void deleteMid(Stack<Integer> st, int current, int N) {
		if(current == (N-1)/2){
			st.pop();
			return;
		}

		int val = st.pop();
		deleteMid(st, ++current, N);
		st.push(val);
	}
}
