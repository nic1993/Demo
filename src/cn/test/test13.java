package cn.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 拼多多 复制可乐 
 * @author supercomputer
 *
 */
public class test13 {

	public static void main(String[] args) {
		String[] name = {"Alice","Bob","Cathy","Dave"};
	
		Scanner scanner = new Scanner(System.in);
		
		long N = scanner.nextLong();
		
		long x = 1;
		int index = 0;
		while (true) {
			if(x*1 >= N) {
				System.out.println(name[0]);
				break;
			}
			
			if(x*2 >= N) {
				System.out.println(name[1]);
				break;
			}
			
			if(x*3 >= N) {
				System.out.println(name[2]);
				break;
			}
			
			if(x*4 >= N) {
				System.out.println(name[3]);
				break;
			}
			
			N -= x * 4;
			x = x << 1; 
			
		}
		
		
		
		
//		
//		for(long i = 1;i <= N;i++) {
//			if(i == N) {
//				System.out.println(queue.remove());
//			}else {
//				String name = queue.remove();
//				queue.offer(name);
//				queue.offer(name);
//			}
//		}
		
	}
}
