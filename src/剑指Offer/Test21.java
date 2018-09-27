package 剑指Offer;

import java.util.HashSet;

/**
 * 在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8
 * @author supercomputer
 *
 */
public class Test21 {
	
	public static void main(String[] args) {
		int[] array = {-2,-8,-1,-5,-9};
		new Test21().FindGreatestSumOfSubArray(array);
		
		
	}

	public int FindGreatestSumOfSubArray(int[] array) {
        int n = array.length;
        int[] dp = new int[n];
        
        dp[0] = array[0];
        
        for(int i = 1;i < n;i++) {
        	if(array[i] > 0 && array[i] + dp[i-1] >= array[i] || array[i] < 0 && dp[i - 1] > 0) {
        		dp[i] = array[i] + dp[i-1];
        	}else {
				dp[i] = array[i];
			}
        }
        int max = dp[0];
		for(int i = 1;i < n;i++) {
			if(max < dp[i]) max = dp[i];
		}
		
		return max;
    }
}
