package пёуп2017;

import java.util.Scanner;

public class Test31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		char[] chs = str.toCharArray();
		
		int len = 0;
		int max = Integer.MIN_VALUE;
		int[] num = new int[chs.length];
		int pos = 0;
		
		for(int i = 0;i < chs.length;i++) {
			if('0' <= chs[i] && chs[i] <= '9') {
				if(len == 0) pos = i;
				len++;
				if(i == chs.length - 1) {
					if(len > max) {
						max = len;
					}
					num[pos] = len;
				}
			}else {
				if(len > max) {
					max = len;
				}
				if(num[pos] == 0) num[pos] = len;
				len = 0;
			}
		}
		
		
		for(int i = 0;i < num.length;i++) {
			if(num[i] == max) {
		         pos = i;	
			}
		}
		System.out.println(str.substring(pos, pos + max));
	}
}
