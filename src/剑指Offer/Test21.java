package ��ָOffer;

import java.util.HashSet;

/**
 * �ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8
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
