package Sort;

public class DichotomySort {

	public static void dichotomySort(int[] array) {
		for(int i = 0;i < array.length;i++) {
			int start = 0;
			int end = i-1;
			int temp = array[i],mid;
			while (start <= end) {
				mid = (end + start) / 2;
				if(array[mid] > temp) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}				
				for(int j = i - 1;j > end;j--) {
					array[j+1] = array[j];
				}				
				array[end + 1] = temp;
			}
			
		}
	}
}
