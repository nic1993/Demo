package CYK;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * ��������һ���������˵�ͼ����ͼ��д��(X:12,Y:?)��������������˳����ʺŴ�����ʲô��˼�أ� �����ʾ���֭Ҳ�벻��ʲô˼·��
 * ��Ȼ���ڵ�ͼ���淢����һ�����֣���������д��һ�λ�����ֻ��һ��1~n�Ļ������У����������i��ֵ����
 * ������ǰһ������������������е�i��һ����Y��ֵ�������ǣ�������ʼ�ָ�����������С�
 * @author supercomputer
 *
 */
public class Test39 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String s = in.nextLine();
		
		int carryLen = String.valueOf(n).length();
		System.out.println(s);
	}
	
	
	public static void dfs(int n,int start,boolean[] find,int carryLen,String s,ArrayList<Integer> list) {
		if(start == s.length() - 1) {
			return;
		}
		else {
			for(int i = 1;i < carryLen;i++) {
				if(start + i <= s.length()) {
					int num = Integer.parseInt(s.substring(start, start + i));
					if(num <= n && !find[num]) {
						find[num] = true;
						list.add(num);
						dfs(num, start+i, find,carryLen, s, list);
						list.remove(list.size() - 1);
						find[num] = false;
					}
				}
			}
		}
	}
}
