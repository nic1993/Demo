package пёуп2017;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int[] F = new int[1000000];
		F[0] = 0;
		F[1] = 1;
		F[2] = 1;
		
		int cur = 2;
		while (F[cur] < N) {
			F[++cur] = F[cur - 1] + F[cur - 2];
		}
		int pre = cur - 1;
		
		int prePath = N - F[pre];
		
		int curPath = F[cur] - N;
		
		System.out.println(prePath > curPath?curPath : prePath);
		
	}
	
	
}
