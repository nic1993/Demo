package ��ָOffer;

import java.util.ArrayList;

/**
 * ����һ����������������һ������S���������в������������ǵ����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 * @author supercomputer
 *
 */
public class Test28 {
	public static void main(String[] args) {
		int [] array = {1,3,5,7,9,11,12,14};
		new Test28().FindNumbersWithSum(array, 10);
	}

    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
    	
    	ArrayList<Integer> list = new ArrayList<>();
    	if(array == null || array.length == 0) return list;
    	
    	int start = 0;
    	int end = array.length - 1;
    	int curSum = array[start] + array[end];
    	int product = Integer.MAX_VALUE;
    	while (start < end) {
			if(curSum == sum) {
				if(array[start] * array[end] < product) {
					list.clear();
					list.add(array[start]);
					list.add(array[end]);
					product = array[start] * array[end];
				}
				end--;
				start++;
				curSum = array[start] + array[end];
				
			}else if (curSum > sum) {
				end--;
				curSum = array[start] + array[end];
			}else if(curSum < sum) {
				start++;
				curSum = array[start] + array[end];
			}
		}
    	
    	return list;
    }
}
