package cn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 拼多多 货物运输问题
 * @author supercomputer
 *
 */
public class test14 {

	public static void main(String[] args) {
		int weight = 300;
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		int index =  0;
		while (scanner.hasNext()) {
			int val = scanner.nextInt();
			if(val == 100) {
				index++;
			}
			list.add(val);
		}
		
		Collections.sort(list);
		
		int curNum = 0;

		curNum += index / 3;
		
		int front = curNum * 3;
		
		int last = list.size() - 1;
		
		while (front <= last ) {
			if(list.get(front) + list.get(last) > weight) {
				curNum++;
				last--;
			}else if (list.get(front) + list.get(last) <= weight) {
				curNum++;
				front++;
				last--;
			}
		}
		
		System.out.println(curNum);
		
		
		
		
	}
}
