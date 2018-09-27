package пёуп2017;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int fir = (int) Math.pow(25, 3) + (int) Math.pow(25, 2) + 25 + 1;
		
		int sec = (int) Math.pow(25, 2) + 25 + 1;
		
		int thr = 25 + 1;
		
		map.put(1, fir);
		map.put(2, sec);
		map.put(3, thr);
		map.put(4, 1);
		
		char[] chs = str.toCharArray();
		
		int result = 0;
		for(int i = 0;i < chs.length;i++) {
			int index = chs[i] - 'a';
			if((i+1) == 1) {
				result += index * map.get(i + 1);
			}else {
				result += index * map.get(i + 1) + 1;
			}
		}
		
		System.out.println(result);
	}
}
