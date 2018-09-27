package cn.test;

import java.util.Comparator;
import java.util.TreeMap;

public class test18 implements Inter {

	public static void main(String[] args) {
//		System.arraycopy(src, srcPos, dest, destPos, length);
		
		TreeMap<Integer, Integer> treeMap = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
			
		});
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		Inter.super.test();
	}
	
	public static int LCS(String str1,String str2) {
		int[][] dp = new int[str1.length() + 1][str2.length() + 1];
		for(int i = 0;i <= str1.length();i++) {
			dp[i][0] = 0;
		}
		for(int j = 0;j <= str2.length();j++) {
			dp[0][j] = 0;
		}
		
		for(int i = 1;i <= str1.length();i++) {
			for(int j = 1;j <= str2.length();j++) {
				if(str1.charAt(i - 1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else if (dp[i-1][j] > dp[i][j-1]) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = dp[i][j-1];
				}
			}
		}
		
		return dp[str1.length()][str2.length()];
	}
}
