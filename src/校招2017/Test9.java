package У��2017;

import java.util.Scanner;

/**
 * ����С����һ��W*H��������ӣ�������б��Ϊ0~H-1��������б��Ϊ0~W-1��ÿ������������Է�һ�鵰�⣬�������鵰���ŷ����þ��벻�ܵ���2
 * @author supercomputer
 *
 */
public class Test9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int W = scanner.nextInt();
		
		int H = scanner.nextInt();
		
		int count = 0;
		
		if(W % 4 == 0 || H % 4 == 0) {
			
			count = W * H / 2;
			
		}else if (W % 2 == 0 && H % 2 == 0) {
			
			count = (W * H / 4 + 1) * 2;
			
		}else {
			
			count = W * H / 2 + 1;
			
		}
		
		System.out.println(count);
	}
}
