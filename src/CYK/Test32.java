package CYK;

import java.util.Stack;

public class Test32 {

	public boolean chkLegal(String A) {
        // write code here
		char[] chs = A.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(int i = 0;i < chs.length;i++) {
			if(chs[i] == '(') {
				stack.push(chs[i]);
			}else if (chs[i] == ')') {
				if(stack.size() == 0) return false;
				stack.pop();
			}
		}
		
		return false;
    }
}
