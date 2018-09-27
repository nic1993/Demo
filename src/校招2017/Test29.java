package пёуп2017;

import java.util.Scanner;

public class Test29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		
		StringBuffer buffer = new StringBuffer();
		
		boolean flag = M > 0?true : false;
		M = Math.abs(M);
		while (M != 0) {
			
			
			buffer.append(getNum(M, N));
			M /= N;
		}
		
		System.out.println(flag == true?buffer.reverse().toString() : "-" + buffer.reverse().toString());
	}
	
	private static String getNum(int M,int N) {
		int val = M % N;
		String reslut = "";
		switch (val) {
		case 15:
			reslut = "F";
			break;
		case 14:
			reslut = "E";
			break;
		case 13:
			reslut = "D";
			break;
		case 12:
			reslut = "C";
			break;
		case 11:
			reslut = "B";
			break;
		case 10:
			reslut = "A";
			break;
		default:
			reslut += val;
			break;
		}
		return reslut;
		
		
		
	}
}
