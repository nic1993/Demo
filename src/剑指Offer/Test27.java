package ��ָOffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100�����������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
 * û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
 * @author supercomputer
 *
 */
public class Test27 {

	public static void main(String[] args) {
		FindContinuousSequence(100);
	}
	 
	public  static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		   ArrayList<ArrayList<Integer>> sumList = new ArrayList<>();
		   ArrayList<Integer> list = new ArrayList<>();
	       int begin = 1;
	       int end = 2;
	       int curSum = begin + end;
	       list.add(begin);
	       list.add(end);
	       while (begin < (sum+1)/2) {
			if(curSum == sum) {
				list = new ArrayList<>();
				for(int i = begin;i <= end;i++) {
					list.add(i);
				}
				sumList.add(list);
				end++;
				curSum += end;
			}else if (curSum > sum) {
				curSum -= begin;
				begin++;
			}else {
				end++;
				curSum += end;
			}
		}
	       return sumList;
    }
}
