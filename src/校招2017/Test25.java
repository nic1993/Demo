package У��2017;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * һ�������� N ��Ԫ�أ�����������������͡� ���磺[-1,2,1]������������������Ϊ[2,1]�����Ϊ 3
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
