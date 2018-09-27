package пёуп2017;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		while (m-- > 0) {
			int n = scanner.nextInt();
			
			Deque<Integer> deque = new LinkedList<>();
			
			for(int i = n;i > 0;i--) {
				deque.offerFirst(i);
				int t =  deque.removeLast();
				deque.offerFirst(t);
			}
			
			while (!deque.isEmpty()) {
				if(deque.size() == 1)
			     System.out.print(deque.removeFirst());
				else {
					System.out.print(deque.removeFirst() + " ");
				}
			}
			System.out.println();
		}
		
	}
	
}
