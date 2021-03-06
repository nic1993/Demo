package 剑指Offer;
/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * @author supercomputer
 *
 */
public class Test24 {
	public static void main(String[] args) {
		int [] array = {7,5,4,6};
		new Test24().InversePairs(array);
	}

    public int InversePairs(int [] array) {
    	if(array == null || array.length == 0) return 0;
    	int [] copy = new int[array.length];
    	int count = InversePairsCore(array, copy, 0, array.length - 1);
    	return count;
    }
    
    private int InversePairsCore(int[] array,int[] copy,int low,int high)
    {
    	if(low == high) return 0;
    	int mid = (high + low) / 2;
    	int left = InversePairsCore(array, copy, low, mid) % 1000000007;
    	int right = InversePairsCore(array, copy, mid+1, high) % 1000000007;
    	int count = 0;
    	int i = mid; // 左边末尾位置
    	int j = high; //右边起始位置
    	
    	int locCopy = high;
    	
    	while (i>=low && j > mid) {
			if(array[i] > array[j]) {
				count += j - mid;
				copy[locCopy--] = array[i--];
				if(count > 1000000007) count = count % 1000000007;
			}else {
				copy[locCopy--] = array[j--];
			}
		}
    	for(;i>=low;i--) {
    		copy[locCopy--] = array[i];
    	}
    	for(;j>mid;j--) {
    		copy[locCopy--] = array[j];
    	}
    	for(int s = low;s <= high;s++) {
    		array[s] = copy[s];
    	}
    	return (left + right + count) % 1000000007;
    }
}
