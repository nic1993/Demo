package пёуп2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long loc = scanner.nextLong();
		
		if(loc % 1000000007 == 0) System.out.println(0);
		int i = 1;
		int count = -1;
		
		HashMap<Long, Integer> map = new HashMap<>();
		
		Queue<Long> queue = new LinkedList<>();
		queue.add(loc);
		map.put(loc, 0);
		
		while (!queue.isEmpty()) {
			long cur = queue.poll();
			if(cur == 0) {
				count = map.get(cur);
			} 
			
			if(map.get(cur) <= 100000) {
				long val1 = (4 * cur + 3) % 1000000007l;
				if(map.get(val1) == null) {
					map.put(val1, map.get(cur) + 1);
					queue.add(val1);
				}
				long val2 = (8 * cur + 7) % 1000000007l;
				if(map.get(val2) == null) {
					map.put(val2, map.get(cur) + 1);
					queue.add(val2);
				}
			}else {
				break;
			}
		}
		
		System.out.println(count);
	}
}
