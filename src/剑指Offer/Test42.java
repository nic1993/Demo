package ��ָOffer;
/**
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
 * ·�����ԴӾ����е�����һ�����ӿ�ʼ��ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ�
 * ���һ��·�������˾����е�ĳһ�����ӣ����·�������ٽ���ø��ӡ�
 * @author supercomputer
 *
 */
public class Test42 {
	public static void main(String[] args) {
		char[] matrix = "ABCESFCSADEE".toCharArray();
		char[] str = "ABCCED".toCharArray();
		new Test42().hasPath(matrix, 3, 4, str);
	}

	static int[][] Loc = {{0,1},{0,-1},{1,0},{-1,0}};
	int[] vis;
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
		vis = new int[matrix.length];
		for(int x = 0;x < rows;x++) {
			for(int y = 0;y < cols;y++) {
				if(find(matrix, rows, cols, x, y, str, 0)) {
					return true;
				}
			}
		}
        return false;
    }
	
	public boolean find(char[] matrix, int rows, int cols, int x,int y, char[] str,int k) {
		int index = x * cols + y;
		if(x < 0 || x >= rows || y < 0 || y >= cols || matrix[index] != str[k] || vis[index] == 1) {
			return false;
		}
		
		if(k == str.length - 1) return true;
		 
		vis[index] = 1;
		for(int i = 0;i < Loc.length;i++) {
			if(find(matrix, rows, cols, x + Loc[i][0], Loc[i][1], str, k+1)) {
				return true;
			}
		}
		vis[index] = 0;
		return false;
	}
}
