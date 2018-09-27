package Sort;

public class QuickSort {

	
	public static void quicksort(int[] a,int low,int high) {
		if(low <= high) {
			return;
		}
		int i = low;
		int j = high;
		
		int key = a[low];
		//���һ��
		while (i < j) {
			//���������ҵ���һ��С��key����
		    while (i < j && a[j] > key) {
				j--;
			}	
		    
		    //���������ҵ���һ������key����
		    while (i < j && a[i] < key) {
				i++;
			}
		    
		    //����
		    if(i < j)
		    swap(a, i, j);
		}
		
		//����key��λ��
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
