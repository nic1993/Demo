package CYK;

import java.util.Stack;

import javax.naming.ldap.SortControl;

public class Test5 {

	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = "aaa";
		System.out.println("==: " + str1.equals(str2));
		
//		Test5 test5 = new Test5();
//		test5.sort("21+3*");
	}
	public void sort(String str) {
		Stack<Character> stack = new Stack<Character>();
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= '0' && chars[i] <= '9') {
				stack.push(chars[i]);
			} else if (chars[i] == '+' || chars[i] == '-' || chars[i] == '*' || chars[i] == '/') {
				int fir = Integer.valueOf(stack.pop().toString());
				int sec = Integer.valueOf(stack.pop().toString());
				int res = count(fir, sec, chars[i]);
				String string = String.valueOf(res);
				char result = string.toCharArray()[0];
				stack.push(result);
			}else if (chars[i] == '/') {
				int fir = Integer.valueOf(stack.pop().toString());
				int sec = Integer.valueOf(stack.pop().toString());
				if(fir == 0){
					System.out.println("输入数据有误");
					break;
				}else {
					int res = count(fir, sec, chars[i]);
					String string = String.valueOf(res);
					char result = string.toCharArray()[0];
					stack.push(result);
				}
			}
		}
	}

	public int count(int fir, int sec, char Arithmetic) {
		switch (Arithmetic) {
		case '+':
            return fir + sec;
		case '-':
			return sec - fir;
		case '*':
            return sec * fir;
		case '/':
            return sec / fir;
		default:
			break;
		}
		return 0;
	}
}
