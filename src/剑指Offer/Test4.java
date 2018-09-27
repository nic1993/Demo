package ��ָOffer;
/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * @author supercomputer
 *
 */
public class Test4 {

	public int minNumberInRotateArray(int [] array) {
	    if(array.length == 0) return 0;
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if(array[low] < array[high]) {
				return array[low];
			}
			
			if(high - low == 1) return array[high];
			
			if(array[low] == array[mid] && array[mid] == array[high]) {
				int min = array[low];
				for(int i = low;i < high;i++) {
					if(min > array[i]){  
				          min = array[i];  
				        } 
				}
				return min;
			}
			
			if(array[mid] >= array[low]) {
				low = mid;
			}
			if(array[mid] <= array[high]) {
				high = mid;
			}
		}
		return array[low];
    }
}
