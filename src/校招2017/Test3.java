package У��2017;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ţţ�볢��һЩ�µ�����ÿ��������ҪһЩ��ͬ�Ĳ��ϣ���������е�������Ҫ׼�������ֲ�ͬ�Ĳ���
 * @author supercomputer
 *
 */
public class Test3 {

	public static void main(String[] args) {
		Set<String> arrs = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String[] strs = scanner.nextLine().split(" ");
			for(String str : strs)
				arrs.add(str);
		}
		System.out.println(arrs.size());
	}
}
