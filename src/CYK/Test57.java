package CYK;

public class Test57 {
	
	public static void main(String[] args) {
		int[] A = {1,2,194606,303029,303030};
		System.out.println(findShortest(A, 5));
	}

	public static int findShortest(int[] A, int n) {
        // write code here
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for(int i = 1;i <= n;i++) {
			if(i - 1 == 0) dp[1] = 1;
			else {
				if(A[i-1] < A[i - 2]) {
					int t = M(A,i-1);
					if(t == -1 || t == i-2) {
						dp[i] = dp[i-1] + 1;
					}else {
                        dp[i] = dp[t] + i - t - 1;
					}
					
				}
				else if (A[i-1] > A[i - 2]) {
					if(T(A,i-1)) dp[i] = dp[i-1];
					else {
						dp[i] = dp[i-1] + 1;
					}
				}
			}
		}
		if(dp[n] == 1) return 0;
		return dp[n];
    }
	
	private static boolean T(int[] A,int end) {
		for(int i = 0;i < end;i++) {
			if(A[i] > A[end]) return false; 
		}
		return true;
	}
	
	private static int M(int[] A,int end) {
		for(int i = 0;i < end;i++) {
			if(A[i] > A[end]) return i; 
		}
		return -1;
	}
}
