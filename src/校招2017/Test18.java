package У��2017;

import java.util.Scanner;

/**
 * ���һ��������������֮���ԭ������һ���ľͳ���������������Ϊ�������С����磺
{1, 2, 1}, {15, 78, 78, 15} , {112} �ǻ�������, 
{1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} ���ǻ������С�
���ڸ���һ���������У�����ʹ��һ��ת��������
ѡ�������������ڵ�����Ȼ��������Ƴ������������������������ֵĺͲ��뵽��������֮ǰ��λ��(ֻ����һ����)��
���ڶ�����������Ҫ���������Ҫ���ٴβ������Խ����ɻ������С�
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
