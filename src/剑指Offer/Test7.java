package ��ָOffer;
/**
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
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
