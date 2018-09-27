package CYK;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test14 {
	public static void main(String[] args) {
		Test14 test14 = new Test14();
		List<String> list = test14.getSubstring("aabcd");
		for(String string : list){
			System.out.println(string);
		}
	}

	public List getSubstring(String str){
		List<String> list = new ArrayList<String>();
		for(int i = 0;i < str.length();i++){
			for(int j = i + 1;j <= str.length();j++){
				String substr = str.substring(i, j);
				int num = getDifNum(substr);
//				System.out.println(num);
				if(judge(num, 1, 1)) list.add(substr);
			}
		}
		return list;
	}
	
	public int getDifNum(String str){
		char[] chs = str.toCharArray();
		HashSet<Character> fib = new HashSet<>();
		for(int i = 0;i < chs.length;i++){
			char ch = chs[i];
			fib.add(ch);
		}
		return fib.size();
	}
	
	public boolean judge(int num,int pre,int now){
		System.out.println("pre: " + pre);
		System.out.println("now: " + now);
		if(num == now){
			return true;
		}
		if(now > num){
			return false;
		}else {
			int temp = now;
			now += pre;
			pre = temp;
			return judge(num, pre, now);
		}
	}
}
