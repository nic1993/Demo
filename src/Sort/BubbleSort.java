package Sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
          int[] num = new int[] {5,8,6,3,9,2,1,7};
          sort(num);
          System.out.println(Arrays.toString(num));
	}

	
	private static void sort(int[] num) {
		int index = num.length - 1;
		int lastChange = 0;
		for(int i = 0;i < num.length;i++) {
			boolean flag = false;
			for(int j = 0;j < index;j++) {
				if(num[j] > num[j + 1]) {
					swap(num, j, j+1);
					flag = true;
					
					lastChange = j;
				}
			}
			index = lastChange;
			if(flag == false) break;
		}
	}
	
	private static void swap(int[] num,int i,int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
}
