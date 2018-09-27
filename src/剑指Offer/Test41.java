package 剑指Offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
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
