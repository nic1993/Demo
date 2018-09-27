package CYK;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for(int t = 0;t < n;t++) {
			int nums = scanner.nextInt();
			int[] x = new int[nums];
			boolean[] flag = new boolean[nums];
			for(int i = 0;i < nums;i++) {
				x[i] = scanner.nextInt();
			}
			System.out.println(Math.max(robBetween(x, 0, nums - 2), 
					                    robBetween(x, 1, nums - 1)));
			
		}
	}
	 
	 public static int robBetween(int[] x,int start,int end) {
		 int prepre = 0;
		 int pre = x[start];
		 for(int i = start + 1;i <= end;i++ ) {
			 int cur = Math.max(prepre + x[i],pre);
			 prepre = pre;
			 pre = cur;
		 }
		 return pre;
	 }
}
