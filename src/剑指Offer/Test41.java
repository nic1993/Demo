package ��ָOffer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
 * @author supercomputer
 *
 */
public class Test41 {
	
	public static void main(String[] args) {
		int[] num = {2,3,4,2,6,2,5,1};
		new Test41().maxInWindows(num, 3);
	}

	public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(size > num.length || size <= 0) return list;
        
        LinkedList<Integer> indexDeque = new LinkedList<>();
        for(int i = 0;i < size - 1;i++) {
        	while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]) {
				indexDeque.removeLast();
			}
        	indexDeque.add(i);
        }
        for(int i = size - 1;i < num.length;i++) {
        	while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]) {
				indexDeque.removeLast();
			}
        	indexDeque.addLast(i);
        	if(i - indexDeque.getFirst() + 1 > size) {
        		indexDeque.removeFirst();
        	}
        	list.add(num[indexDeque.getFirst()]);
        }
        
        return list;
    }
}
