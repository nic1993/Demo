package 剑指Offer;
/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 * @author supercomputer
 *
 */
public class Test43 {
	static int[][] Loc = {{0,1},{0,-1},{1,0},{-1,0}};
	
	public static void main(String[] args) {
		System.out.println(new Test43().movingCount(10,1,100));
	}
	
	 public int movingCount(int threshold, int rows, int cols)
	 {
	        int[] vis = new int[rows * cols];

			count(threshold, rows, cols, 0, 0, vis);		
		
	       int count = 0;
	        for(int i = 0;i < vis.length;i++) {
	        	if(vis[i] == 1) count++;
	        }
	        return count;
	 }
	 public void count(int threshold, int rows, int cols,int x,int y,int[] vis) {
		 int index = x * cols + y;
		 if(x < 0 || x >= rows || y < 0 || y >= cols || vis[index] == 1 || getNum(x) + getNum(y) > threshold) {
			 return;
		 }
		 vis[index] = 1;
		 
		 for(int i = 0;i < Loc.length;i++) {
			 count(threshold, rows,  cols, x + Loc[i][0], y + Loc[i][1],vis);
		  }
		 return;
	 }
	 
	 public int getNum(int num) {
		 int sum = 0;
		 while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		 return sum;
	 }
}
