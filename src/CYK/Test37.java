package CYK;
/*
 * �ڹ��еĽ������У��������ɽ�����������(��������Ĵ�����С�ڵ���2)�������Ǳ���һ�ʳɽ��������һ��(����-��-��-����˳�����)������һ���еĹ�Ʊ�仯���У���дһ���������һ����Ի�õ�������档
 * �����ʵ�����Ӷȵ͵ķ���ʵ�֡������۸�����prices�����ĳ���n���뷵��������档��֤����С�ڵ���500��
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
