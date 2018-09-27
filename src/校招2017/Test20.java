package У��2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * С��������һ��ʯ��·ǰ��ÿ��ʯ���ϴ�1���ű��Ϊ��1��2��3.......
����ʯ��·Ҫ��������Ĺ������ǰ��������С�׵�ǰ���ڵı��ΪK�� ʯ�壬С�׵���ֻ����ǰ��K��һ��Լ��(����1��K)����������K+X(XΪK��һ����1�ͱ����Լ��)��λ�á�
 С�׵�ǰ���ڱ��ΪN��ʯ�壬�����������ǡ��ΪM��ʯ��ȥ��С����֪��������Ҫ��Ծ���ο��Ե��
 * @author supercomputer
 *
 */
public class Test20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int M = scanner.nextInt();
		
		int dp[] = new int[M + 1];
		
		for(int i = N;i <= M;i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		
		dp[N] = 0;
		
		boolean flag = false;
		
		for(int i = N;i < M - 1;i++) {
			if(dp[i] != Integer.MAX_VALUE) {
				ArrayList<Integer> list = allFactor(i);
				for(int c = 0;c < list.size();c++) {
					int temp = i + list.get(c);
					int count = dp[i] + 1;
					if(temp <= M && dp[temp] > count) {
						dp[temp] = count;
					}
				}
			}
			
		}
		
		if(dp[M] == Integer.MAX_VALUE) System.out.println(-1);
		else {
			System.out.println(dp[M]);
		}
	}
	
	public static ArrayList<Integer> allFactor(int nums){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 2;i <= Math.sqrt(nums);i++) {
			if(nums % i == 0) {
				list.add(i);
				if(i != nums/i) list.add(nums /i );
			}
		}
		
		return list;
	}

}
