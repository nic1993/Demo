package У��2017;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * ĳ�͹���n�����ӣ�ÿ��������һ��������a �����ɵ���������� ��m�����ˣ�ÿ����������������:b������cԤ�����ѽ� 
 * �ڲ�����ƴ��������£���ʵ��һ���㷨ѡ������һ���ֿ��ˣ�ʹ����Ԥ�����ѽ�����
 * @author supercomputer
 *
 */
public class Test26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		int[] tables = new int[m];
		for(int i = 0;i < m;i++)
			tables[i] = scanner.nextInt();
		
		Arrays.sort(tables);
		
		PriorityQueue<People> queue = new PriorityQueue<>();
		for(int i = 0;i < n;i++) {
			int num = scanner.nextInt();
			int value = scanner.nextInt();
			if(num <= tables[m - 1]) {
				queue.add(new People(num, value));
			}
		}
		
		long sum = 0l;
		int count = 0;
		boolean[] choose = new boolean[m];
		
		while(!queue.isEmpty()) {
			People people = queue.poll();
			for(int j = 0;j < m;j++) {
				if(people.num <= tables[j] && choose[j] == false) {
					sum += people.money;
					count++;
					choose[j] = true; 
					break;
				}
			}
			if(count == m) break;
		}
		System.out.println(sum);
	}
	
	static class People implements Comparable<People>{
		int num;
		int money;
		
		public People(int num, int money) {
			super();
			this.num = num;
			this.money = money;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			this.money = money;
		}
		@Override
		public int compareTo(People o) {
			// TODO Auto-generated method stub
			return o.money - this.money;
		}
	}
}
