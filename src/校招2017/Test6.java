package У��2017;

import java.util.Scanner;

/**
 * ţţ�õ���һ���ر�ͼ��˳�Ųر�ͼ��ָʾ��ţţ������һ���ر��У��ر�������һ�����أ�����ÿ�λ���ʾ�����ַ��� s �� t�����ݹ��ϵĴ�˵��ţţ��Ҫÿ�ζ��ش� t �Ƿ��� s �������С�
 * ע�⣬�����в�Ҫ����ԭ�ַ������������ģ����紮 abc�����������о��� {�մ�, a, b, c, ab, ac, bc, abc} 8 ��
 * @author supercomputer
 *
 */
public class Test6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			String str = scanner.next();
			String subStr = scanner.next();
			
			if(judge(str, subStr, 0, 0)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
	
	private static boolean judge(String str,String subStr,int strIndex,int subStrIndex) {
		if(str.length() == strIndex && subStrIndex < subStr.length()) {
			return false;
		}
		if(subStrIndex == subStr.length()) return true;
		
		char[] strChs = str.toCharArray();
		char[] subStrChs = subStr.toCharArray();
		
		for(int i = strIndex;i < str.length();i++) {
			if(strChs[i] == subStrChs[subStrIndex]) {
				 return judge(str, subStr, i+1, subStrIndex+1);
			}
		}
		
		return false;
	}
}
