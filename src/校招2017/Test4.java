package 校招2017;
/**
 * 牛牛和 15 个朋友来玩打土豪分田地的游戏，牛牛决定让你来分田地，地主的田地可以看成是一个矩形，每个位置有一个价值。
 * 分割田地的方法是横竖各切三刀，分成 16 份，作为领导干部，牛牛总是会选择其中总价值最小的一份田地， 
 * 作为牛牛最好的朋友，你希望牛牛取得的田地的价值和尽可能大，你知道这个值最大可以是多少吗？
 * @author supercomputer
 *
 */
public class Test4 {
    static int minVal;
	
    private static void getMaxVal(int[][] matrix, int m, int n, int[] minpos) {
    	int oldMatrix[][] = matrix;
    	int m0 = minpos[0];
    	int m1 = minpos[1];
    	
    	//得到4 * 4矩阵返回
    	if(m == n && m == 3) {
    		return;
    	}
    	
    	//向上合并
    	if(m0 > 0 && m > 3) {
    		matrix = mergeMatrix(oldMatrix, m, n, m0 - 1, m1, minpos, 1);
    		getMaxVal(oldMatrix, matrix.length - 1, matrix[0].length - 1, minpos);
    	}
    	matrix = oldMatrix;
    	//向下合并
    	if(m0 < m && m0 > 3) {
    		matrix = mergeMatrix(oldMatrix, m, n, m0, m1, minpos, 1);
    		getMaxVal(oldMatrix, matrix.length - 1, matrix[0].length - 1, minpos);
    	}
    	matrix = oldMatrix;
    	//向左合并
    	if(m1 > 0 && m1 > 3) {
    		matrix = mergeMatrix(oldMatrix, m, n, m0, m1 -1, minpos, -1);
    		getMaxVal(oldMatrix, matrix.length - 1, matrix[0].length - 1, minpos);
    	}
    	matrix = oldMatrix;
    	//向右合并
    	if(m1 < n && m1 > 3) {
    		matrix = mergeMatrix(oldMatrix, m, n, m0, m1, minpos, -1);
    		getMaxVal(oldMatrix, matrix.length - 1, matrix[0].length - 1, minpos);
    	}
    	
    }
	
    private static int[][] mergeMatrix(int[][] matrix, int m, int n,int mergem,int mergen, int[] minpos,int flag) {
    	int[][] temp = null;
    	if(flag == 1) {
    		temp = new int[m][n+1];
    		for(int i = 0;i <= m;i++) {
    			for(int j = 0;j <= n;j++) {
    				if(i < mergem) {
    					temp[i][j] = matrix[i][j];
    				}else if (i == mergem) {
						temp[i][j] = matrix[i][j] + matrix[i+1][j];
					}else {
						temp[i-1][j] = matrix[i][j];
					}
    			}
    			if(i == mergem) i++;
    		}
    	}else {
    		temp = new int[m + 1][n];
    		for(int i = 0;i <= m;i++) {
    			for(int j = 0;j <= n;j++) {
    				if(j < mergen) {
    					temp[i][j] = matrix[i][j];
    				}else if (j == mergen) {
						temp[i][j]=matrix[i][j]+matrix[i][j+1];
	                    j++;
					}else {
						temp[i][j - 1] =matrix[i][j]; 
					}
    				
    			}
    		}
		}
    	
    	getMinpos(temp, temp.length - 1, temp[0].length-1, minpos);
    	return temp;
    }
    
	private static void getMinpos(int[][] matrix,int m,int n,int[] minpos) {
		int min = Integer.MAX_VALUE;
		for(int i = 0;i <= m;i++) {
			for(int j = 0;j <= n;j++) {
				if(matrix[i][j] < min) {
					min = matrix[i][j];
					minpos[0] = i;
					minpos[1] = j;
				}
			}
		}
		
		if(minVal < min) {
			minVal = min;
		}
	}
}
