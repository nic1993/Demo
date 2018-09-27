package У��2017;

import java.util.Scanner;

import javax.sound.sampled.Mixer;

/**
 * n ֻ��ţ����һ�ţ�ÿ����ţӵ�� ai ��ƻ����������Ҫ������֮��ת��ƻ����ʹ�����������ţӵ�е�ƻ��������ͬ��
 * ÿһ�Σ���ֻ�ܴ�һֻ��ţ��������ǡ������ƻ������һ����ţ�ϣ���������Ҫ�ƶ����ٴο���ƽ��ƻ�������������������� -1
 * @author supercomputer
 *
 */
public class Test5 {

	static int[] pos = new int[2];
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int nums[] = new int[n];
		for(int i = 0;i < n;i++) {
			nums[i] = scanner.nextInt();
		}
		int min = getMin(nums);
		int max = getMax(nums);
		boolean flag = judge(max, min);
		if(!flag) {
			System.out.println(-1);
			return;
		}
		int count = 0;
		while (min != max) {
			nums[pos[0]] += 2;
			nums[pos[1]] -= 2;
			
			count++;
			min = getMin(nums);
			max = getMax(nums);
			
			flag = judge(max, min);
			if(!flag) break;
		}
		if(!flag) {
			System.out.println(-1);
		}
		else {
			System.out.println(count);
		}
	}
	
	private static int getMin(int[] nums) {
		int min = Integer.MAX_VALUE;
		for(int i = 0;i < nums.length;i++) {
			if(min > nums[i]) {
				min = nums[i];
				pos[0] = i;
			}
		}
		return min;
	}
	
	private static int getMax(int[] nums) {
		int max = Integer.MIN_VALUE;
		for(int i = 0;i < nums.length;i++) {
			if(max < nums[i]) {
				max = nums[i];
				pos[1] = i;
			}
		}
		return max;
	}
	
	private static boolean judge(int max,int min) {
		if((max - min) % 2 != 0 || max - min == 2) return false;
		return true;
	}
}
