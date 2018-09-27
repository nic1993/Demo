package Sort;

public class SelectSort {

	public static void SelectSort(int[] source) {
		for(int i = 0;i < source.length;i++) {
			for(int j = i+1;j < source.length;j++) {
				if(source[i] > source[j]) swap(source, i, j);
			}
		}
	}
	
	public static void swap(int[] source,int x,int y) {
		int temp = source[x];
		source[x] = source[y];
		source[y] = temp;
	}
	
}
