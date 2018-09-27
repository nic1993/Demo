package Sort;

public class InsertSort {

	public static void insertSort(int[] A) {
		for(int i = 1;i < A.length;i++) {
			int tmp = A[i];
			int t;
			for(t = i;t > 0;t--) {
				if(A[t] < A[t-1]) {
					A[t] = A[t-1];
				}
			}
		}
	}
}
