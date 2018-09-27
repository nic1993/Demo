package 校招2017;

import java.util.Scanner;

/**
 * 如果一个数字序列逆置之后跟原序列是一样的就称这样的数字序列为回文序列。例如：
{1, 2, 1}, {15, 78, 78, 15} , {112} 是回文序列, 
{1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} 不是回文序列。
现在给出一个数字序列，允许使用一种转换操作：
选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。
 * @author supercomputer
 *
 */
public class Test18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0;i < n;i++) {
			nums[i] = scanner.nextInt();
		}
		int count = 0;
		while (judge(nums) != -1) {
			int i = judge(nums);
			int j = nums.length - 1 - i;
			int[] newNums = new int[nums.length - 1];
			if(nums[i] < nums[j]) {
				int num = nums[i] + nums[i+1];
				newNums = merge(nums, num, i);
				count++;
			}else {
				int num = nums[j] + nums[j - 1];
				newNums = merge(nums, num, j-1);
				count++;
			}
			nums = newNums;
		}
		System.out.println(count);
	}
	
	public static int judge(int[] nums) {
		if(nums.length == 1) return -1;
		
		for(int i = 0,j = nums.length - 1;i < j;i++,j--) {
			if(nums[i] != nums[j]) return i;
		}
		
		return -1;
	}
	
	public static int[] merge(int[] nums,int num,int loc) {
		int[] newNums = new int[nums.length - 1];
		for(int i = 0,j = 0;i < nums.length && j < nums.length - 1;i++,j++) {
			if(i == loc) {
				newNums[j] = num;
				i++;
			}
			else {
				newNums[j] = nums[i];
			}
		}
		
		return newNums;
	}
}
