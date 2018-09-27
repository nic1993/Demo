package ��ָOffer;

import java.util.ArrayList;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author supercomputer
 *
 */
public class Test13 {

	public ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
	    int n = matrix[0].length;
		int m = matrix.length;
		int start = 0;
		while (n > start*2 && m > start*2) {
		     output(matrix, n, m, start, list);	
		     start++;
		}
		return list;
    }
	
	private static void output(int [][] matrix,int n,int m, int start,ArrayList<Integer> list) {
		int endX = n - 1 - start;
		int endY = m - 1 - start;
		
		//��������
		for(int i = start; i <= endX;i++) {
			list.add(matrix[start][i]);
		}
		
		//��������
		if(start < endY) {
			for(int i = start + 1;i <= endY;i++) {
				list.add(matrix[i][endX]);
			}
		}
		
		//��������
		if(start < endX && start < endY) {
			for(int i = endX - 1;i >= start;i--) {
				list.add(matrix[endY][i]);
			}
		}
		
		//��������
		if(start < endX && start < endY - 1) {
			for(int i = endY - 1;i >= start + 1;i--) {
       		list.add(matrix[i][start]);
       	 }
		}
	}
	
}
