package CYK;

public class Test51 {

	public void findLongest(String A, int n, String B, int m) {
        // write code here
		char[] chsA = A.toCharArray();
		char[] chsB = B.toCharArray();
		
		int[][] dp = new int[n][m];
		
		if(chsA[0] == chsB[0]) {
			dp[0][0] = 1;
		}else {
			dp[0][0] = 0;
		}
		
		for(int i = 1;i <n;i++) {
			for(int j = 1;j < m;j++) {
				if(chsA[i] == chsB[j]) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = 0;
				}
					
			}
		}
		
    }
}
