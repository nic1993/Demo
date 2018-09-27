package CYK;

import java.util.Vector;

/*
 * ���֮�£����ܷɡ������й�����ţ�У����ν����������ꡱ�� ����һ���ع���ʷ�Ļ��ᣬ
 * ��֪һ֧��Ʊ����n��ļ۸����ƣ��Գ���Ϊn�����������ʾ�������е�i��Ԫ�أ�prices[i]������ù�Ʊ��i��Ĺɼۡ�
 *  ������һ��ʼû�й�Ʊ������������������1�ɶ�������1�ɵĻ��ᣬ��������ǰһ��Ҫ�ȱ�֤����û�й�Ʊ��
 *  �����ν��׻��ᶼ����������Ϊ0�� ����㷨���������ܻ�õ�������档 ������ֵ��Χ��2<=n<=100,0<=prices[i]<=100
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
     * �ܻ�õ��������
     * 
     * @param prices Prices[i]����i��Ĺɼ�
     * @return ����
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
