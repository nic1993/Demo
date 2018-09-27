package CYK;

import java.util.Arrays;

public class Test22 {

	final int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
	
	static int n;
	static int m;
	public static void main(String[] args) {
		int[][] map = {{0,1,0},{2,0,0}};
		n = 1;
		m = 2;
		int[][] vis = new int[n+1][m+1];
		for(int i = 0;i < 2;i++){
			for(int j = 0;j < 3;j++){
				vis[i][j] = 0;
			}
		}
		Test22 test22 = new Test22();
		System.out.println(test22.countPath(map, 2, 3,vis));
	}
	public int countPath(int[][] map, int n, int m,int[][] vis) {
        // write code here
		int plan = 0;
		dfs(map,0,1,plan,vis);
		return plan;
    }
	public void dfs(int[][] map,int x,int y,int plan,int[][] vis){
//		System.out.println("x: " + x);
//		System.out.println("y: " + y);
		System.out.println("x£º " + x + " y " + y + " map[x][y]: " + map[x][y]);
		if(map[x][y] == 2){
			plan++;
			return;
		}
		for(int i = 0;i < dir.length;i++){
			int nextX = x + dir[i][0];
			int nextY = y + dir[i][1];
			if(nextX > n || nextY > m || nextX < 0 || nextY < 0){
				continue;
			}else if (vis[nextX][nextY] == 1) {
				continue;
			}
			else {
				vis[nextX][nextY] = 1;
				dfs(map, nextX, nextY, plan,vis);
				vis[nextX][nextY] = 0; 
			}
		}
	}
	
	public int countPath(int[][] map, int n, int m){
		int startX = 0;
		int startY = 0;
		int endX = 0;
		int endY = 0;
		int[][] plan = new int[n][m];
		
		for(int i = 0;i < n;i++){
			for(int j = 0;j < m;j++){
				if(map[i][j] == 1){
					startX = i;
					startY = j;
				}
				if(map[i][j] == 1){
					endX = i;
					endY = j;
				}
			}
		}
		
		int dirX = startX > endX? -1 : 1;
		int dirY = startY > endY? -1 : 1;
		plan[startX][startY] = 1;
		for (int i = startX + dirX;i != endX + dirX;i++) {
			map[i][startY] = map[i][startY] == -1?0 : map[i-dirX][startY];
		}
		for (int i = startY + dirY;i != endY + dirY;i++) {
			map[startX][i] = map[startX][i] == -1?0 : map[startX][i - dirY];
		}
		
		for (int i = startX + dirX;i != endX + dirX;i++) {
			for(int j = startY + dirY;j != endY + dirY;j++) {
				map[i][j] = map[i][j] == -1?0:map[i - dirX][j] + map[i][j-dirY];
			}
		}	
		return 0;
	}
}
