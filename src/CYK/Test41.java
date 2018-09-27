package CYK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * �Ѻ�Ա��С��������ü�����������Σ���ĳ��С������һ����Ϸ�ű��ݣ����ʵı��ݽ��������ų����ʹ��������ǰ�������ۣ�С�����������˽⵽�� 
 * ��Ϸ���������һ���½�Ŀ������޺�����������Ϸ��Ա���޺����ݡ����ǵ���ȫ���أ�Ҫ����޺������У�վ��ĳ���˼��ϵ���Ӧ�üȱ��Լ����ֱ��Լ��ݣ�
 * ����ȡ� �ų���Ҫ���ν�Ŀ�е��޺���������ߣ����������ڶ࣬����ͷ����ΰ�����Ա�����⡣С�������������ܼ򵥣�����ͳ���˲�������޺������ݵ�������Ա��������أ�
 * ���Һܿ��ҵ�������޺�������Ա���С� ����������Ҳ�õ�������һ��������ر����ҳ����Ե���������޺����ĸ߶ȣ���ݱ�����Ϸ��Ա���α��Ϊ1��N
 * 
 * �������
 */
public class Test41 {
	static class Person {
	  int height;
	  int weight;
	public Person(int height, int weight) {

		this.height = height;
		this.weight = weight;
	}
	  
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		Person[] persons = new Person[N];
		for(int i = 0;i < N;i++ ) {
			persons[i] = new Person(in.nextInt(), in.nextInt());
		}
		
		Arrays.sort(persons,new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				int result = o1.weight - o2.weight;
				if(result != 0) return result;
				else {
					return Integer.compare(o1.height, o2.height);
				}
			}
		});
		
		int[] dp = new int[N];
		for(int i = 0;i < N;i++) dp[i] = 1;
		
		for(int i = 1;i < N;i++) {
			for(int j = 0;j < i;j++) {
				if(persons[i].height > persons[j].height || (persons[i].weight == persons[j].weight &&
						persons[i].height == persons[j].height)) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
	}
}
