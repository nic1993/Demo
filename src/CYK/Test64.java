package CYK;

import java.util.Stack;

public class Test64 {
	int i = 0;

	public int[] reverseStackRecursively(int[] stack, int top) {
        // write code here
        if(top > 0) {
			int value1 = stack[top-1];
			i++;
			reverseStackRecursively(stack, top - 1);
			i--;
			stack[i] = value1;
		}
        
        String string = "qqq";
       
		return stack;
    }
}
