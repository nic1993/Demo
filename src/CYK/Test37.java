package CYK;
/*
 * 在股市的交易日中，假设最多可进行两次买卖(即买和卖的次数均小于等于2)，规则是必须一笔成交后进行另一笔(即买-卖-买-卖的顺序进行)。给出一天中的股票变化序列，请写一个程序计算一天可以获得的最大收益。
 * 请采用实践复杂度低的方法实现。给定价格序列prices及它的长度n，请返回最大收益。保证长度小于等于500。
 */
public class Test37 {

	public int maxProfit(int[] prices, int n) {
        // write code here
		int[] pre = new int[n];
		int[] after= new int[n];
		
		int min = prices[0];
		
		for(int i = 1;i < n;i++) {
			min = Math.min(prices[i], min);
			pre[i] = Math.max(pre[i - 1], prices[i] - min);
		}
		
		int max = prices[n - 1];
		
		for(int i = n - 2;i > 0;i++) {
			max = Math.max(prices[i], max);
			after[i] = Math.max(after[i + 1], max - prices[i]);
		}
		
		return 0;
    }
}
