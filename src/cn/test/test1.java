package cn.test;

import java.util.Stack;

public class test1 {

	static String[] months = {"January","February","March"};
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for(int i = 0;i < months.length;i++) {
			stack.push(months[i] + " ");
		}
		stack.addElement("The last line");
		System.out.println(stack.elementAt(1));
	}
}
