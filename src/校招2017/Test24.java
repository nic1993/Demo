package пёуп2017;

import java.util.Scanner;

public class Test24 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		if(n < 6) System.out.println(-1);
		else {
		int[] dp = new int[n + 1];
		for(int i = 0;i <= n;i++) {
			dp[i] = Integer.MAX_VALUE;
		}
			dp[6] = 1;
			if(n >= 8) dp[8] = 1;
			
			for(int i = 6;i <= n;i++) {
				if(dp[i] != Integer.MAX_VALUE) {
					int m1 = i + 6;
					int m2 = i + 8;
					
					if(m1 <= n) {
						dp[m1] = Math.min(dp[i] + 1, dp[m1]);
					}
					if(m2 <= n) {
						dp[m2] = Math.min(dp[i] + 1, dp[m2]);
					}
					
				}
			}
			
			if(dp[n] == Integer.MAX_VALUE) System.out.println(-1);
			else {
				System.out.println(dp[n]);
			}
		}
	}
}
