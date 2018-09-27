package CYK;

import java.util.Arrays;

public class Test50 {

	public static void findLCS(String A, int n, String B, int m) {
        // write code here
		int[][] dp = new int[n][m];
		char[]  chsA = A.toCharArray();
		char[] chsB = B.toCharArray();
		
		char firA = chsA[0];
		char firB = chsB[0];
			for(int j = 0;j < m;j++) {
				if(firA == chsB[j])
				dp[0][j] = 1;
				else {
					dp[0][j] = 0;
				}
			}
			
			for(int j = 0;j < n;j++) {
				if(firB == chsA[j])
				dp[j][0] = 1;
				else {
					dp[j][0] = 0;
				}
			}
		
		for(int i = 1;i < n;i++) {
			for(int j = 1;j < m;j++) {
				if(chsA[i] == chsB[j]) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		System.out.println();
    }
	
	
	public static void main(String[] args) {
		findLCS("1A2C3D4B56", 10, "B1D23CA45B6A", 12);
	}
}
