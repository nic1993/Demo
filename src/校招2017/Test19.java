package 校招2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。小易认为在圆上的点而且横纵坐标都是整数的点是优雅的，小易现在想寻找一个算法计算出优雅的点的个数，请你来帮帮他。
 * @author supercomputer
 *
 */
public class Test19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int val = scanner.nextInt();
		
		int i = (int) Math.sqrt(val);
		
		ArrayList<Integer> list = new ArrayList<>();
		
        int count = 0;
		for(int j = 0;j <= i;j++) {
			for(int t = 0; t < i;t++) {
				if(judge(j, t, val) && !list.contains(j) && !list.contains(t)) {
					if(j != 0 && t != 0 && j != t) {
						count += 8;
					}else {
						count += 4;
					}
					
					list.add(j);
					list.add(t);
				}
			}
		}
		System.out.println(count);
	}
	
	public static boolean judge(int i,int j,int val) {
		if(i*i + j*j == val) return true;
		return false;
	}
}
