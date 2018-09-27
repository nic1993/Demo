package CYK;

import java.util.ArrayList;
import java.util.List;
/*
 * ���������ַ���B��C�����Ƕ���BCΪ��C����B�ĺ����γɵ��´���һ���ַ���P�Ǵ�A��ǰ׺�����ҽ�������Bʹ��A��PB����ȻB����Ϊ�մ���
 * ��P!=A,�����ǳ�PΪA����ǰ׺�����ڶ����ظ��ʡ���Q�Ǵ�A���ظ��ʵ��ҽ���Q��A����ǰ׺����A��QQ��ǰ׺����A����ظ�������A���ظ��������һ����
 * ���߿մ�����Aû���κ��ظ���ʱ������ababab����ظ�����abab;abc����ظ����ǿմ�������һ����s(����ĸ���)�������ĳ���n(1��n��100000)��
 * �뷵��s������ǰ׺����ظ��ʵĳ���֮��(�մ�����Ϊ0)��
 */
public class Test44 {

	
	public long getLongest(int n, String s) {
        // write code here
		List<String> list = new ArrayList<>();
		
		for(int i = 1;i < n;i++) {
			list.add(s.substring(0, i));
		}
		int sum = 0;
		
		for(String str : list) {
			sum += getLen(str);
		}
		
		
		return sum;
    }
	
	public static int getLen(String str) {
		if(str.length() == 1) return 0;
		List<Integer> locs = new ArrayList<>();
		char[] characters = str.toCharArray();
		char fir = characters[0];
		
		
		for(int i = characters.length - 1;i > 0;i--) {
			if(characters[i] == fir) locs.add(i);
		}
		if(locs.size() == 0) return 0;
		
		for(Integer i : locs) {
			Integer loc = i;
			int flag = 1;
			for(int j = 1; j < loc && i < characters.length;j++,i++) {
				if(characters[i] != characters[j]) {
					flag = 0;
					break;
				}
			}
			if(flag == 1) return i+1;
		}
		return 0;
		
	}
}
