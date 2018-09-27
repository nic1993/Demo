package У��2017;

import java.util.Scanner;

/**
 * �� n ��ѧ��վ��һ�ţ�ÿ��ѧ����һ������ֵ��ţţ����� n ��ѧ���а���˳��ѡȡ k ��ѧ����
 * Ҫ����������ѧ����λ�ñ�ŵĲ���� d��ʹ���� k ��ѧ��������ֵ�ĳ˻�������ܷ������ĳ˻���
 * @author supercomputer
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int values[] = new int[n + 1];
		for(int i = 1;i <= n;i++) {
			values[i] = scanner.nextInt();
		}
		
		int k = scanner.nextInt();
		int d = scanner.nextInt();
		
		long[][] fmax = new long[k + 1][n + 1];
		long[][] fmin = new long[k + 1][n + 1];
		
		for(int i = 1;i < n;i++) {
			fmax[1][i] = values[i];
			fmin[1][i] = values[i];
			for(int j = 2;j <= k;j++) {
				for(int one = j;one <= n;one++) {
					long tempMax = Long.MIN_VALUE;
					long tempMin = Long.MAX_VALUE;
					
					for(int left = Math.max(j-1, one - d);left <= one - 1;left++) {
						if(tempMax < Math.max(fmax[left][k-1] * values[one], fmin[left][k-1] * values[one])) {
							tempMax = Math.max(fmax[left][k-1] * values[one], fmin[left][k-1] * values[one]);
						}
						
						if(tempMin > Math.min(fmax[left][k-1] * values[one], fmin[left][k-1] * values[one])) {
							tempMin = Math.min(fmax[left][k-1] * values[one], fmin[left][k-1] * values[one]);
						}
					}
					
					fmax[one][k] = tempMax;
					fmin[one][k] = tempMin;
				}
			}
		}
		
		
	}
}
