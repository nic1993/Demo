package 剑指Offer;
/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。 
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
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
