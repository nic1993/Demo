package ��ָOffer;

import java.util.Stack;

/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint����
 * @author supercomputer
 *
 */
public class Test3 {

	Stack<Integer> stack1 = new Stack<Integer>();  //��ջ
    Stack<Integer> stack2 = new Stack<Integer>(); //��ջ
    
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
