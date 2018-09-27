package пёуп2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0;i < n;i++) {
			list.add(scanner.nextInt());
		}
		Collections.sort(list);
		
		int miss = 0;
		for(int i = 0;i < n;i++) {
			if(list.get(i) > miss + 1) break;
			miss += list.get(i);
		}
		
		System.out.println(miss + 1);
	}
}
