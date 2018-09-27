package У��2017;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * ����һ�� n �� m �еĵ��Σ����� '.' ��ʾ����ͨ�е�λ�ã�'X' ��ʾ����ͨ�е��ϰ���ţţ�� (x0 , y0 ) λ�ó�����
 * ����������Σ���һ�����Ϸ����ͬ���ǣ���ÿһ��ֻ�ܰ���һЩָ���Ĳ����������Σ�Ҫ��ÿһ���������Գ������εı߽磬
 * Ҳ���ܵ����ϰ��ϡ����εĳ��ڿ���������ĳ������ͨ�е�λ���ϡ�ţţ��֪�������£�����Ҫ���ٲ��ſ����뿪�������
 * 
 * @author supercomputer
 *
 */
public class Test2 {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {//ע��while������case
			
			int n = scanner.nextInt();
			int m = scanner.nextInt();

			char path[][] = new char[n][m];
			for (int i = 0; i < n; i++) {
				path[i] = scanner.next().toCharArray();
			}

			int startX = scanner.nextInt();
			int startY = scanner.nextInt();
			int[][] tar = new int[n][m];
			tar[startX][startY] = 1;

			int k = scanner.nextInt();

			int[][] step = new int[k][2];

			for (int i = 0; i < k; i++) {
				step[i][0] = scanner.nextInt();
				step[i][1] = scanner.nextInt();
			}

			Queue<Integer> xQueue = new LinkedList<>();
			Queue<Integer> yQueue = new LinkedList<>();

			xQueue.add(startX);
			yQueue.add(startY);
			while (!xQueue.isEmpty() && !yQueue.isEmpty()) {
	              startX = xQueue.remove();
	              startY = yQueue.remove();
	              
	              for(int i = 0;i < k;i++) {
	            	  if(startX + step[i][0] < n && startX + step[i][0] >= 0 && startY + step[i][1] >= 0 && startY + step[i][1] < m) {
	            		  if(tar[startX + step[i][0]][startY + step[i][1]] == 0) {
	            			  if(path[startX + step[i][0]][startY + step[i][1]] == '.') {
	            				  tar[startX + step[i][0]][startY + step[i][1]] = tar[startX][startY] + 1;
	                			  xQueue.add(startX + step[i][0]);
	                			  yQueue.add(startY + step[i][1]); 
	            			  }else {
	                			  tar[startX + step[i][0]][startY + step[i][1]] = -1;
	      					  }
	            		  }
	            	  }
	              }
			}
			
			int max = 0;
			int getRoad = 1;
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < m;j++) {
					if(path[i][j] == '.' && tar[i][j] == 0) {
						getRoad = 0;
					}
					max = Math.max(max, tar[i][j]);
				}
			}
	        if(getRoad == 0) System.out.println(-1);
	        else {
				System.out.println(max - 1);
			}
		}
		
	}
}
