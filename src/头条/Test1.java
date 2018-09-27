package Í·Ìõ;

import java.util.Scanner;
import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] param = in.nextLine().split(",");
		int m = Integer.parseInt(param[0]);
		int n = Integer.parseInt(param[1]);
		int[][] map = new int[m][n];
		for (int i = 0; i < m; i++) {
			String[] chs = in.nextLine().split(",");
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(chs[j]);
			}
		}

		int[] res = maxAreaOfIsland(map);
		int p = res[0];
		int q = res[1];
		System.out.println(p + "," + q);
		in.close();

	}

	//bfs
	public static int[] maxAreaOfIsland(int[][] grid) {
		boolean[][] seen = new boolean[grid.length][grid[0].length];
		int[] dr = new int[] { 1, -1, 0, 0, -1, 1, -1, 1 };
		int[] dc = new int[] { 0, 0, 1, -1, -1, 1, 1, -1 };
		int[] res = new int[2];

		int ans = 0;
		int count = 0;
		for (int r0 = 0; r0 < grid.length; r0++) {
			for (int c0 = 0; c0 < grid[0].length; c0++) {
				if (grid[r0][c0] == 1 && !seen[r0][c0]) {
					int shape = 0;
					Stack<int[]> stack = new Stack();
					stack.push(new int[] { r0, c0 });
					seen[r0][c0] = true;
					while (!stack.empty()) {
						int[] node = stack.pop();
						int r = node[0], c = node[1];
						shape++;
						for (int k = 0; k < 8; k++) {
							int nr = r + dr[k];
							int nc = c + dc[k];
							if (0 <= nr && nr < grid.length && 0 <= nc && nc < grid[0].length && grid[nr][nc] == 1
									&& !seen[nr][nc]) {
								stack.push(new int[] { nr, nc });
								seen[nr][nc] = true;
							}
						}
					}
					count++;
					ans = Math.max(ans, shape);
				}
			}
		}
		res[0] = count;
		res[1] = ans;
		return res;
	}

}