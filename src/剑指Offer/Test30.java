package ��ָOffer;

import java.util.LinkedList;

/**
 * ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ������,�и���Ϸ��������:����,��С������Χ��һ����Ȧ��Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
 * ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,��������һ��С���ѿ�ʼ,
 * ����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,���Բ��ñ���,�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)
 * @author supercomputer
 *
 */
public class Test30 {
	public static void main(String[] args) {
		new Test30().LastRemaining_Solution(5, 3);
	}

    public int LastRemaining_Solution(int n, int m) {
    	if(n == 0) return -1;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0;i < n;i++) {
        	list.add(i);
        }
        int loc = 0;
        int index = m - 1;
        int len = list.size();
        int remove = (m - 1) % len;
        while (list.size() != 1) {
			loc = loc + remove >= len ? loc + remove - len : loc + remove;
			list.remove(loc);
			
			len = list.size();
			remove = (m - 1)  % len;
		}
    
        return list.get(0);
    }
}
