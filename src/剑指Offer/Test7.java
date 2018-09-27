package 剑指Offer;
/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author supercomputer
 *
 */
public class Test7 {
	public static void main(String[] args) {
		int [] array = {1,2,8,4,5,6,7};
		reOrderArray(array);
		for(int i = 0;i < array.length;i++) {
			System.out.print(array[i] + "  ");
		}
	}
    public static void reOrderArray(int [] array) {
        
        for(int i = 0;i < array.length;i++) {
        	for(int j = i+1;j < array.length;j++) {
        		if(array[i] % 2 == 0 && array[j] % 2 != 0) {
        			move(array, i, j);
        		}
        	}
        }
    }
    
    public static void move(int[] array,int start,int end) {
    	
    	int temp = array[start];
    	array[start] = array[end];
    	
        if(end - start == 1) {
    		array[end] = temp;
    		return;
    	}
    	for(int i = start+1;i <= end;i++) {
    		int t = array[i];
    		array[i] = temp;
    		temp = t;
    	}
    }
}
