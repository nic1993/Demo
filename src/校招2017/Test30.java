package 校招2017;

import java.util.Scanner;
/**
 * 给定一个有n个正整数的数组A和一个整数sum,求选择数组A中部分数字和为sum的方案数。
 * 当两种选取方案有一个数字的下标不一样,我们就认为是不同的组成方案。
 * @author supercomputer
 *
 */
public class Test30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int m = scanner.nextInt();
		
		int[] nums = new int[n + 1];
		
		for(int i = 1;i <= n;i++)
			nums[i] = scanner.nextInt();
		
		long[][] dp = new long[n + 1][m+1];
		
		for(int i = 0;i <= n;i++) {
			dp[i][0] = 1;
		}
		
		for(int i = 1;i < m;i++) {
			dp[0][i] = 0;
		}
		
		for(int i = 1;i <= n;i++) {
			for(int j = 0;j <= m;j++) {
				if(nums[i] <= j) dp[i][j] = dp[i-1][j] + dp[i-1][j - nums[i]];
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		System.out.println(dp[n][m]);
	}
}
   