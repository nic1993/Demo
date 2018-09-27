package CYK;

import java.util.Stack;

/*
 * 在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 则称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。
         给定一个整数n，请返回n位的格雷码，顺序为从0开始
 */
public class Test33 {

	public String[] getGray(int n) {
        // write code here
		String[] str = new String[(int) Math.pow(2, n )]; 
		if(n == 1) {
			str[0] = "0";
			str[0] = "1";
			return str;
		}
		String[] strs = getGray(n - 1);
		String[] strings = new String[(int) Math.pow(2, n)];
		int tem = 0;
		for(int i = 0;i < strs.length;i++) {
			strings[tem] = "0" + strs[i];
			tem++;
		}
		for(int i = strs.length - 1;i >= 0;i--) {
			strings[tem] = strs[i] + "1";
			tem++;
		}
		return strings;
    }
}
