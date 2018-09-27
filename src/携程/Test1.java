package Ð¯³Ì;

import java.util.Scanner;

public class Test1 {

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		long n = scanner.nextLong();
//		
//		int count = 0;
//		
//		long flag = 1;
//		
//		while (flag != 0) {
//			if((n & flag) != 0) {
//				count++;
//			}
//			flag = flag << 1;
//		}
//		
//		System.out.println(count);
//	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long n = scanner.nextLong();
		
		int count = 0;
		while (n != 0) {
			if((n & 1) != 0) {
				count++;
			}
			n = n >> 1;
		}
		
		System.out.println(n);
	}
}
