package CYK;

import java.math.BigInteger;
import java.util.Stack;

/**
 * 请设计一个算法能够完成两个用字符串存储的整数进行相加操作，对非法的输入则返回error
 * @author supercomputer
 *
 */
public class Test {

	public static void main(String[] args) {
		getSum("123", "123");
	}
	
	public static void getSum(String n,String m)
	{
		Stack<String> stack = new Stack<String>();	

		char[] str1 = n.toCharArray();
		char[] str2 = m.toCharArray();
		
		int i = 0,j = 0;
		int value = 0;
		for(;i < str1.length && j < str2.length;i++,j++)
		{
			int digit1 = Integer.valueOf(String.valueOf(str1[i])); 
			int digit2 = Integer.valueOf(String.valueOf(str1[j]));
			
			System.out.println("digit1 " + digit1 + "  digit2 " + digit2);
			
			int sum = digit1 + digit2 + value;
			System.out.println("sum " + sum);
			if(sum > 10)
			{
				stack.add(String.valueOf(sum % 10));
				value = 1;
			}else {
				stack.add(String.valueOf(sum));
				value = 0;
			}
			System.out.println("==: " + stack.peek());
		}
 		
		if(i != str1.length)
		{
			for(;i < str1.length;i++)
			{
				stack.add(String.valueOf(str1[i]));
			}
		}else if (j != str2.length) {
			for(;j < str2.length;j++)
			{
				stack.add(String.valueOf(str2[j]));
			}
		}
		
		StringBuilder str = new StringBuilder("");
	    while (stack.size() != 0) {
	    	str.append(stack.pop());
		}
	    System.out.println(str);
	}
	
	
}
