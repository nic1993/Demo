package CYK;

public class Test21 {

	public int getDis(int[] A, int n) {
        // write code here
		int min = A[0];
		int max = 0;
		for(int i = 1;i < A.length;i++){
			if(A[i] < min){
				min = A[i];
			}
			if(A[i] - min > max){
				max = A[i] -min;
			}
		}
		return max;
    }
}
