package CYK;

import java.util.Arrays;
import java.util.Scanner;

public class Test55 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int T = scanner.nextInt();
	while (T-- > 0) {
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[] getIn = new int[n + 1];
		int[] getOut = new int[n + 1];
		
		Arrays.fill(getIn, 0);
		Arrays.fill(getOut, 0);
		
		for(int i = 0;i < m;i++) {
			getOut[scanner.nextInt()] = 1;
			getIn[scanner.nextInt()] += 1;
		}
		
		boolean flag = false;
		for(int i = 1;i <= n;i++) {
			if(getOut[i] == 0 && getIn[i] == n - 1) {
				System.out.println(i);
				flag = true;
			}
		}
		if(flag == false) System.out.println(0);
		System.out.println();
	}
}
}
