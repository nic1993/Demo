package Ð¯³Ì;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test2 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		int num = scanner.nextInt();
		
		long[][] dates = new long[num][num];
		
		long A = scanner.nextLong();
		
		for(int i = 0;i < num;i++) {
			int t = scanner.nextInt();
			
			long start = scanner.nextLong();
			
			long end = scanner.nextLong();
			
			dates[i][0] = start;
			
			dates[i][1] = end;
			
			if(start <= A && end >= A) {
				list.add(t);
			}
			
		}
		
		if(list.size() == 0) System.out.println("null");
		
		Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		
		for(int i : list) {
			System.out.println(i);
		}

	}
}
