package CYK;

import java.util.Scanner;

/*
 *C������Ҫת��һ���ﷸ��D�У�C����n���ﷸ����������ʱ����˳������ÿ���ﷸ��һ������ֵ��ֵԽ����Խ�ء�����Ϊ�˷�������г�����ת������ʱ��������c�����ˣ�ͬʱҪ��ת�Ʒ��˵�����ֵ֮�Ͳ�����t�����ж�����ѡ��ķ�ʽ��
 */
public class Test25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt(); //n����
			int t = in.nextInt(); //�ﷸֵΪt
			int c = in.nextInt(); //����cֵ
			int[] a = new int[n]; 
			for(int i = 0;i < n;i++) {
				a[i] = in.nextInt();
			}
			int count = 0;
			int tempt = 0;
			for(int i = 0;i < c;i++) {
				tempt += a[i];
			}
			if(tempt < t) {
				count++;
			}
			for(int i = c;i <n;i++) {
				tempt += a[i] - a[i - c];
				if(tempt < t)
					count++;
			}
			System.out.println(count);
		}
	}
}
