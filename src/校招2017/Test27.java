package пёуп2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test27 {

	static int max = Integer.MIN_VALUE;
	static List<String> list = new ArrayList<>();
	static List<String> lastList = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
	    int P = scanner.nextInt();
		
		int[][] route = new int[n][m];
		boolean[][] visit = new boolean[n][m];
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				route[i][j] = scanner.nextInt();
			}
		}
		visit[0][0] = true;
		dfs(n, m, 0, 0, P, route,visit);
	
		if(lastList.size() == 0) System.out.println("Can not escape!");
		else {
			for(String str : lastList) {
				System.out.print(str + ",");
			}
			System.out.print("[0," + (m - 1) + "]");
		}
		
	}
	
	private static void dfs(int n,int m,int i,int j,int P,int[][] route,boolean[][] visit) {
		if(i == 0 && j == m - 1) {
			if(max < P) {
				max = P;
				lastList.clear();
				for(String str : list) {
					lastList.add(str);
				}
			}
		}else {
			list.add("[" + i + "," + j + "]");
			
			if(IsContinue(n, m, i+1, j, P,route,visit)) {
				visit[i+1][j] = true;
				dfs(n, m, i+1, j, P, route,visit);
				visit[i+1][j] = false;
			}
			
			if(IsContinue(n, m, i-1, j, P-3,route, visit)) {
				visit[i-1][j] = true;
				dfs(n, m, i-1, j, P-3,route,visit);
				visit[i-1][j] = false;
			}
			
			if(IsContinue(n, m, i, j+1, P-1, route,visit)) {
				visit[i][j+1] = true;
				dfs(n, m, i, j+1, P-1,route,visit);
				visit[i][j+1] = false;
			}
			
			if(IsContinue(n, m, i, j-1, P-1,route, visit)) {
				visit[i][j-1] = true;
				dfs(n, m, i, j-1, P-1,route,visit);
				visit[i][j-1] = false;
			}
			
			list.remove(list.size() - 1);
		}
	}
	
	private static boolean IsContinue(int n,int m,int i,int j,int P,int[][] route,boolean[][] visit) {
		if(i < 0 || i >= n || j < 0 || j >= m || P < 0 || visit[i][j] == true || route[i][j] == 0) return false;
		return true;
	}
	
	static class Node{
		int x;
		int y;
		public Node(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
	
}
