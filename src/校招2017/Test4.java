package У��2017;
/**
 * ţţ�� 15 �������������������ص���Ϸ��ţţ��������������أ���������ؿ��Կ�����һ�����Σ�ÿ��λ����һ����ֵ��
 * �ָ���صķ����Ǻ��������������ֳ� 16 �ݣ���Ϊ�쵼�ɲ���ţţ���ǻ�ѡ�������ܼ�ֵ��С��һ����أ� 
 * ��Ϊţţ��õ����ѣ���ϣ��ţţȡ�õ���صļ�ֵ�;����ܴ���֪�����ֵ�������Ƕ�����
 * @author supercomputer
 *
 */
public class Test4 {
    static int minVal;
	
    private static void getMaxVal(int[][] matrix, int m, int n, int[] minpos) {
    	int oldMatrix[][] = matrix;
    	int m0 = minpos[0];
    	int m1 = minpos[1];
    	
    	//�õ�4 * 4���󷵻�
    	if(m == n && m == 3) {
    		return;
    	}
    	
    	//���Ϻϲ�
    	if(m0 > 0 && m > 3) {
    		matrix = mergeMatrix(oldMatrix, m, n, m0 - 1, m1, minpos, 1);
    		getMaxVal(oldMatrix, matrix.length - 1, matrix[0].length - 1, minpos);
    	}
    	matrix = oldMatrix;
    	//���ºϲ�
    	if(m0 < m && m0 > 3) {
    		matrix = mergeMatrix(oldMatrix, m, n, m0, m1, minpos, 1);
    		getMaxVal(oldMatrix, matrix.length - 1, matrix[0].length - 1, minpos);
    	}
    	matrix = oldMatrix;
    	//����ϲ�
    	if(m1 > 0 && m1 > 3) {
    		matrix = mergeMatrix(oldMatrix, m, n, m0, m1 -1, minpos, -1);
    		getMaxVal(oldMatrix, matrix.length - 1, matrix[0].length - 1, minpos);
    	}
    	matrix = oldMatrix;
    	//���Һϲ�
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
