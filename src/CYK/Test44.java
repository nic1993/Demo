package CYK;

import java.util.ArrayList;
import java.util.List;
/*
 * 对于两个字符串B和C，我们定义BC为将C接在B的后面形成的新串。一个字符串P是串A的前缀，当且仅当存在B使得A＝PB，当然B可以为空串。
 * 若P!=A,则我们称P为A的真前缀。现在定义重复词。串Q是串A的重复词当且仅当Q是A的真前缀，且A是QQ的前缀。而A的最长重复词则是A的重复词中最长的一个，
 * 或者空串（当A没有任何重复串时）。如ababab的最长重复词是abab;abc的最长重复词是空串。给定一个串s(由字母组成)，及它的长度n(1≤n≤100000)，
 * 请返回s的所有前缀的最长重复词的长度之和(空串长度为0)。
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
