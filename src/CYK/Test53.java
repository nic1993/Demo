package CYK;
/*
 * ��һ����������A��������ֵ��ͬ��ֽ���ų�һ���ߡ����a�����b��������ÿ��ֽ�ƣ��涨���a���ã����B���ã�����ÿ�����ÿ��ֻ��������������ҵ�ֽ�ƣ����a�����b�����������������ܻ�������Ų��ԡ��뷵������ʤ�ߵķ�����
����ֽ������A�����еĴ�Сn���뷵���������ϸ��ߵ÷���(��ͬ�򷵻�����һ������)����֤A�е�Ԫ�ؾ�С�ڵ���1000����A�Ĵ�СС�ڵ���300��
 */
public class Test53 {
	public static void main(String[] args) {
		
		
		
		int[] A = {1,2,100,4};
		cardGame(A, 4);
	}

	public static int cardGame(int[] A, int n) {
        // write code here
		int scoreA = getMax(A, 0, n-1);
		int scoreB = getMin(A, 0, n-1);
		System.out.println("scoreA: " + scoreA + "  scoreB: " + scoreB);
		return 0;
    }
	public static int getMax(int[] A,int l,int r) {
		if(l == r)
		{
			return A[l];
		}else {
			return Math.max(getMin(A, l+1, r)+A[l], getMin(A, l, r-1)+A[r]);
		}
	}
	
	public static int getMin(int[] A,int l,int r) {
		if(l == r) {
			return 0;
		}else {
			return Math.min(getMax(A, l+1, r),getMax(A, l, r-1));
		}
	}
}
