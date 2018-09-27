package 剑指Offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
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
