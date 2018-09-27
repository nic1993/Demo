package CYK;

public class Test48 {

	public int countWays(int[] changes, int n, int x) {
        // write code here
		int[] dp = new int[x + 1];
		dp[0] = 1;
		for(int i = 0;i < n;i++) {
			for(int j = changes[i];j <= x;j++) {
				dp[j] = dp[j] + dp[j - changes[i]];
			}
		}
		
		return dp[x];
    }
}
