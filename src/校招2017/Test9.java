package 校招2017;

import java.util.Scanner;

/**
 * 二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2
 * @author supercomputer
 *
 */
public class Test9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int W = scanner.nextInt();
		
		int H = scanner.nextInt();
		
		int count = 0;
		
		if(W % 4 == 0 || H % 4 == 0) {
			
			count = W * H / 2;
			
		}else if (W % 2 == 0 && H % 2 == 0) {
			
			count = (W * H / 4 + 1) * 2;
			
		}else {
			
			count = W * H / 2 + 1;
			
		}
		
		System.out.println(count);
	}
}
