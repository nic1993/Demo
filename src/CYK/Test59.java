package CYK;
/*
 * ����һ������ΪN(N>1)����������A�����Խ�A���ֳ������������֣��󲿷�A[0..K]���Ҳ���A[K+1..N-1]��K����ȡֵ�ķ�Χ��[0,N-2]��
 * ����ô�໮�ַ����У��󲿷��е����ֵ��ȥ�Ҳ������ֵ�ľ���ֵ������Ƕ��٣�
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
