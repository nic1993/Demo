package cn.test;

public class test11 {
	
	public static void main(String[] args) {
		int[] A = {2,1,4,3,1,5,6};
		
//		findLongest(A, 7);
		findLCS("1A2C3D4B56", 10, "B1D23CA45B6A", 12);
	}

	
	//最长递增子序列
	public static int findLongest(int[] A, int n) {
        // write code here
		int[] dp = new int[n];
		dp[0] = 1;
		for(int i = 1;i < n;i++) {
			dp[i] = 1;
			for(int j = 0;j < i;j++) {
				if(A[j] < A[i] && dp[j] + 1 > dp[i]) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		int max = 0;
		for(int val : dp) {
			if(val > max) max = val;
		}
		System.out.println(max);
		return max;
    }
	
	//最长递增公共子序列
	public static int findLCS(String A, int n, String B, int m) {
		char[] chsA = A.toCharArray();
		char[] chsB = B.toCharArray();
		
		int[][] table = new int[n + 1][m + 1];
		for(int i = 0;i <= n;i++) table[i][0] = 0;
		for(int i = 0;i <= m;i++) table[0][i] = 0;
		
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= m;j++) {
				if(chsA[i - 1] == chsB[j - 1]) {
					table[i][j] = table[i-1][j-1] + 1;
				}else {
					table[i][j] = Math.max(table[i][j - 1], table[i-1][j]);
				}
			}
		}
		
		System.out.println(table[n][m]);
		return table[n][m];
	}
}
