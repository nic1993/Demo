package CYK;

import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {
		int n,m,k;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();
		int[] x = new int[k];
		int[] y = new int[k];
		double dp[][] = new double[n][m];
		for(int i = 0;i < k;i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				if(i == 0 && j == 0) {
					dp[i][j] = 1;
					continue;
				}
				else if (i == 0) {
					dp[i][j] = dp[i][j - 1] * 0.5;
					continue;
				}
				else if (j == 0) {
					dp[i][j] = dp[i-1][j] * 0.5;
					continue;
				}
				else if (i == n && j == m) {
					dp[i][j] = dp[i - 1][j] * 0.5 + dp[i][j - 1]* 0.5;
					continue;
				}
				else if (i == n) {
					dp[i][j] = dp[i-1][j] + dp[i][j - 1] * 0.5;
					continue;
				}
				else if (j == m) {
					dp[i][j] = dp[i][j-1] + dp[i-1][j] * 0.5;
					continue;
				}
				dp[i][j] = dp[i][j-1]*0.5 + dp[i-1][j]*0.5;
			}
		}
	}
	
	
	public int countPath(int[][] map, int n, int m){
		int startX = 0;
		int startY = 0;
		int endX = map.length - 1;
		int endY = map[0].length;
		
		int[][] plan = new int[map.length][map[0].length];
		
		int dirX = 1;
		int dirY = 1;
		
		for(int x = startX;x != endX + dirX;x += dirX){
			for(int y = startY; y != endY + dirY;y += dirY){
				if(x == startX && y == startY){
					plan[x][y] = 1;
				}else if (x == startX) {
					plan[x][y] = (map[x][y] == -1)? 0 : plan[x][y-dirY];
				}else if (y == startY) {
					plan[x][y] = (map[x][y] == -1)? 0 : plan[x-dirX][y];
				}else {
					plan[x][y] = (map[x][y] == -1)? 0 : plan[x-dirX][y-dirY];
				}
			}
		}
		
		return 0;
	}
}
