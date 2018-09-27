package пёуп2017;

import java.util.Scanner;

public class Test33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		String rem = scanner.nextLine();
		
		String result = str.replaceAll("[" + rem + "]", "");
		System.out.println(result);
	}
}
