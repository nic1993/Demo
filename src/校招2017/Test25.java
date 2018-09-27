package 校招2017;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * 一个数组有 N 个元素，求连续子数组的最大和。 例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3
 * @author supercomputer
 *
 */
public class Test25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] nums = new int[n];
		for(int i = 0;i < n;i++) {
			nums[i] = scanner.nextInt();
		}

		int MAX = nums[0]; 
		int count = nums[0];
		for(int i = 1;i < n;i++) {
			if(count > 0) {
				count += nums[i];
			}else {
				count = nums[i];
			}
			
			if(MAX < count) MAX = count;
		}
		
		System.out.println(MAX);
	}
	
	
}
