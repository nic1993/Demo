package CYK;

import java.util.Vector;

/*
 * 风口之下，猪都能飞。当今中国股市牛市，真可谓“错过等七年”。 给你一个回顾历史的机会，
 * 已知一支股票连续n天的价格走势，以长度为n的整数数组表示，数组中第i个元素（prices[i]）代表该股票第i天的股价。
 *  假设你一开始没有股票，但有至多两次买入1股而后卖出1股的机会，并且买入前一定要先保证手上没有股票。
 *  若两次交易机会都放弃，收益为0。 设计算法，计算你能获得的最大收益。 输入数值范围：2<=n<=100,0<=prices[i]<=100
 */
public class Test13 {

	public static int getmax(int[] prices,int start,int end){
		int max = 0;
		int min = prices[start];
		for(int i = start + 1;i <= end;i++){
			if(prices[i] - min > max){
				max = prices[i] - min;
			}
			if(prices[i] < min){
				min = prices[i];
			}
		}
		return 0;
	}
    /**
     * 能获得的最大收益
     * 
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public int calculateMax(int[] prices) {
        int length = prices.length;
    	int[] left = new int[length];
    	int[] right = new int[length];
    	left[0] = 0;
    	int min = prices[0];
    	for(int i = 1;i < length;i++){
    		if(min > prices[i])
    			min = prices[i];
    		left[i] = Math.max(prices[i] - min, left[i-1]);
    	}
    	int high = prices[length-1];
    	for(int i = length - 2;i >= 0;i--){
    		if(high<prices[i])
    			high = prices[i];
    		right[i] = Math.max(high - prices[i], right[i+1]);
    	}
    	
    	return 0;
    }
}
