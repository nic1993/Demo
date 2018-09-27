package CYK;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 亮亮深吸一口气，打开了地图，地图上写着(X:12,Y:?)，这可让亮亮犯了愁，这个问号代表了什么意思呢？ 亮亮绞尽脑汁也想不出什么思路，
 * 忽然他在地图背面发现了一串数字，数字下面写着一段话“这只是一个1~n的混乱排列，不用在意第i个值”，
 * 亮亮眼前一亮，“这个混乱排列中第i个一定是Y的值！”于是，亮亮开始恢复这个混乱排列。
 * @author supercomputer
 *
 */
public class Test39 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String s = in.nextLine();
		
		int carryLen = String.valueOf(n).length();
		System.out.println(s);
	}
	
	
	public static void dfs(int n,int start,boolean[] find,int carryLen,String s,ArrayList<Integer> list) {
		if(start == s.length() - 1) {
			return;
		}
		else {
			for(int i = 1;i < carryLen;i++) {
				if(start + i <= s.length()) {
					int num = Integer.parseInt(s.substring(start, start + i));
					if(num <= n && !find[num]) {
						find[num] = true;
						list.add(num);
						dfs(num, start+i, find,carryLen, s, list);
						list.remove(list.size() - 1);
						find[num] = false;
					}
				}
			}
		}
	}
}
