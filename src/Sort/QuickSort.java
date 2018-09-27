package Sort;

public class QuickSort {

	
	public static void quicksort(int[] a,int low,int high) {
		if(low <= high) {
			return;
		}
		int i = low;
		int j = high;
		
		int key = a[low];
		//完成一趟
		while (i < j) {
			//从右向左找到第一个小于key的数
		    while (i < j && a[j] > key) {
				j--;
			}	
		    
		    //从左向右找到第一个大于key的数
		    while (i < j && a[i] < key) {
				i++;
			}
		    
		    //交换
		    if(i < j)
		    swap(a, i, j);
		}
		
		//调整key的位置
		if(a[i] < a[low]) {
			swap(a, i, low);
		}
		
		quicksort(a, low, i-1);
		quicksort(a, i+1, high);
	}
	
	public static void swap(int[] a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
