package CYK;

import java.util.Stack;

/*
 * ��һ�����ı����У��������������ڵĴ���ֻ��һλ����������ͬ�� ������ֱ���Ϊ������(Gray Code)�����дһ��������ʹ�õݹ�ķ�������Nλ�ĸ����롣
         ����һ������n���뷵��nλ�ĸ����룬˳��Ϊ��0��ʼ
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
