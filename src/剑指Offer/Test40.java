package ��ָOffer;

import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * ��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
 * ������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ������ʹ��Insert()������ȡ��������ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����
 * @author supercomputer
 *
 */
public class Test40 {

	PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11,new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
	});
	
	int count = 0;
	public void Insert(Integer num) {
		count++;
		if((count & (0x1)) == 0) {
			if(!maxHeap.isEmpty() && num < maxHeap.peek()) {
				maxHeap.offer(num);
				num = maxHeap.poll();
			}
		    minHeap.offer(num);
		}
		else {
			if(!minHeap.isEmpty() && num > minHeap.peek()) {
				minHeap.offer(num);
				num = minHeap.poll();
			}
			maxHeap.offer(num);
		}
	}
	
	public Double GetMedian() {  
		if(count == 0) throw new RuntimeException("error");
		
		double result;
		if((count & (0x1)) == 1) {
			result = maxHeap.peek();
		}else {
			result = (maxHeap.peek() + minHeap.peek()) / 2.0;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Test40 test40 = new Test40();
		test40.Insert(5);
		test40.Insert(3);
		test40.Insert(7);
		test40.Insert(9);
		test40.Insert(11);
		test40.Insert(4);
		test40.Insert(2);
		test40.Insert(8);
	}
}
