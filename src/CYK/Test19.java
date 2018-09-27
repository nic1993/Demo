package CYK;

public class Test19 {

	public static void main(String[] args) {
		int[] A = {1,3,5,7,9};
		System.out.println(getPos(A, 5, 1));
	}
	
	public static int getPos(int[] A, int n, int val) {
        // write code here
		int start = 0;
		int end = n;
		while (start < end) {
			if(A[(start + end) / 2] == val){
				return (start + end) / 2;
			}
			else if (A[(start + end) / 2] > val) {
				end = (start + end) / 2;
			}else {
				start = (start + end) / 2;
			}
		}
		if(A[start] == val) return start;
		return -1;
    }
}
