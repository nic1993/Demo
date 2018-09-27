package пёуп2017;

import java.util.Scanner;


public class Test23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long num = scanner.nextLong();
		long sum = 0;
		for(long i = num;i > 0;i /= 2) {
			long temp = (i+1) / 2;
			sum += temp * temp;
		}
		
		System.out.println(sum);
	}
}
