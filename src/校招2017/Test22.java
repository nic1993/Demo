package пёуп2017;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int count = rev(n) + rev(m);
		System.out.println(rev(count));
	}
	
	public static int rev(int x) {
		return Integer.valueOf(new StringBuilder(String.valueOf(x)).reverse().toString());
	}

	
}
