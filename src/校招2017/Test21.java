package пёуп2017;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			int n = scanner.nextInt();
			long[] dp = new long[n+1];
			dp[1] = 3;
			dp[2] = 9;
			for(int i = 3;i <= n;i++) {
				dp[i] = 2*dp[i - 1] + dp[i-2];
			}
			
			System.out.println(dp[n]);
		}
	}

