package CYK;

public class Test52 {

	public int findMinCost(String A, int n, String B, int m, int c0, int c1, int c2) {
        // write code here
		char[] chsA = A.toCharArray();
		char[] chsB = B.toCharArray();
		
		
		int[][] cost = new int[n+1][m+1];
		cost[0][0] = 0;
		for(int i = 1;i <= n;i++) {
			cost[i][0] = cost[i-1][0] + c1;
		}
		
		for(int i = 1;i <= m;i++) {
			cost[0][i] = cost[0][i-1] + c0;
		}
		
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= m;j++) {
				if(chsA[i] == chsB[j]) {
					cost[i][j] = cost[i-1][j-1];
				}else {
					int cost1 = cost[i-1][j] + c0;
					int cost2 = cost[i][j-1] + c1;
					int cost3 = cost[i-1][j-1] + c2;
					cost[i][j] = Math.min(cost1, Math.min(cost2, cost3));
				}
				
			}
		}
		return 0;
    }
}
