package CYK;

import java.util.Arrays;

public class Test62 {
	
	public int findArrayMex(int[] A, int n) {
        // write code here
		Arrays.sort(A);
		if(A[0] > 1) return 1;
		for(int i = 1;i < n;i++) {
			if(A[i] < 0) A[i] = 0;
			else {
				if(A[i] - A[i-1] > 1) {
					return A[i-1] + 1;
				}
			}
		}
		
		return A[n-1] + 1;
    }
}
