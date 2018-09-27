package 校招2017;

import java.util.Scanner;

/**
 * 牛牛拿到了一个藏宝图，顺着藏宝图的指示，牛牛发现了一个藏宝盒，藏宝盒上有一个机关，机关每次会显示两个字符串 s 和 t，根据古老的传说，牛牛需要每次都回答 t 是否是 s 的子序列。
 * 注意，子序列不要求在原字符串中是连续的，例如串 abc，它的子序列就有 {空串, a, b, c, ab, ac, bc, abc} 8 种
 * @author supercomputer
 *
 */
public class Test6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			String str = scanner.next();
			String subStr = scanner.next();
			
			if(judge(str, subStr, 0, 0)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
	
	private static boolean judge(String str,String subStr,int strIndex,int subStrIndex) {
		if(str.length() == strIndex && subStrIndex < subStr.length()) {
			return false;
		}
		if(subStrIndex == subStr.length()) return true;
		
		char[] strChs = str.toCharArray();
		char[] subStrChs = subStr.toCharArray();
		
		for(int i = strIndex;i < str.length();i++) {
			if(strChs[i] == subStrChs[subStrIndex]) {
				 return judge(str, subStr, i+1, subStrIndex+1);
			}
		}
		
		return false;
	}
}
