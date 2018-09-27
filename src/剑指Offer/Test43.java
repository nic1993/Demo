package ��ָOffer;
/**
 * ������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ�񣬵��ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ�
 * ���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18�����ǣ������ܽ��뷽��35,38������Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
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
