package CYK;
/*
 * 给定一个长度为N(N>1)的整型数组A，可以将A划分成左右两个部分，左部分A[0..K]，右部分A[K+1..N-1]，K可以取值的范围是[0,N-2]。
 * 求这么多划分方案中，左部分中的最大值减去右部分最大值的绝对值，最大是多少？
 */
public class Test59 {

	public static void main(String[] args) {
		
	}
	
	public static int findMaxGap(int[] A, int n) {
        // write code here
		int max = 0;
		int i = 0;
		for(int j = 0;j < n;j++) {
			if(max < A[j]) {
				max = A[j];
				i = j;
			}
		}
		if(i == 0) return A[i] - A[n-1];
		if(i == n - 1) return A[i] - A[0];
		int left = A[i] - A[0];
		int right = A[i] - A[n-1];
		return left > right ? left : right;
    }
}
