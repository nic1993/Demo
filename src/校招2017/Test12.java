package пёуп2017;

import java.util.Scanner;

public class Test12 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		
		boolean flag1 = str.matches("[A-Z]+");
		
		boolean flag2 = !str.matches(".*(.)(\\1).*");
		
		boolean flag3 = !str.matches(".*(.).*(.)(.*\\1)(.*\\2).*");
		
		if(flag1 && flag2 && flag3) {
			System.out.println("Likes");
		}else {
			System.out.println("Dislikes");
		}
	}
}
