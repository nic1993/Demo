package 校招2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 小易来到了一条石板路前，每块石板上从1挨着编号为：1、2、3.......
这条石板路要根据特殊的规则才能前进：对于小易当前所在的编号为K的 石板，小易单次只能往前跳K的一个约数(不含1和K)步，即跳到K+X(X为K的一个非1和本身的约数)的位置。
 小易当前处在编号为N的石板，他想跳到编号恰好为M的石板去，小易想知道最少需要跳跃几次可以到达。
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
