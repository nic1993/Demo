package 剑指Offer;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
 * @author supercomputer
 *
 */
public class Test3 {

	Stack<Integer> stack1 = new Stack<Integer>();  //入栈
    Stack<Integer> stack2 = new Stack<Integer>(); //出栈
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        if(stack2.size() != 0) {
        	return stack2.pop();
        }else if (stack1.size() != 0) {
			while (stack1.size() != 0) {
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}else {
			return -1;
		}
    }
    
    public static void main(String[] args) {
		Test3 test3 = new Test3();
		test3.push(0);
		test3.push(1);
		test3.push(2);
		test3.push(3);
		test3.push(4);
		test3.push(5);
		while (true) {
			int value = test3.pop();
			if(value == -1) {
				break;
			}
			System.out.println(value);
			
		}
	}
}
