package CYK;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String strs = String.valueOf(num);
		char[] chars = strs.toCharArray();
		boolean delete = false;
		for(int i = 0;i < chars.length - 1;i++){
			int value1 = Integer.valueOf(chars[i]);
			int value2 = Integer.valueOf(chars[i+1]);
			if(value1 < value2){
				chars[i] = '\0';
				delete = true;
				break;
			}
		}
		if(delete == false)
		{
			chars[chars.length - 1] = '\0';
		}
		
		for(int i = 0;i < chars.length;i++){
			System.out.print(chars[i]);
		}
	}
}
