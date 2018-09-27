package пёуп2017;

import java.util.Scanner;

public class Test28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int count = 0;
		while ( n != 0) {
			count += n/5;
			n/=5;
		}		
		System.out.println(count);
	}
}
