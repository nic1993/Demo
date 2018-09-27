package У��2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * ţţ����ҵ������һ������Ϊ n ������ A��������а����˴�1��n��n������������ΪһЩԭ��������һЩλ�ã������� 10 �����������ˣ�
 * ����ţţ�ǵ��������˳��Ե������� k��˳�����ָ���� i < j �� A[i] < A[j] �Ķ����������ţţ��������������Ҫ��ĺϷ����е���Ŀ��
 * 
 * @author supercomputer
 *
 */
public class Test7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();

			int[] A = new int[n];
			boolean[] flag = new boolean[n + 1];

			for (int i = 0; i < n; i++) {
				A[i] = scanner.nextInt();
				if (A[i] != 0) {
					flag[A[i]] = true;
				}
			}

			// ͳ�������в����ڵ�����
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 1; i <= n; i++) {
				if (flag[i] == false)
					list.add(i);
			}

			List<ArrayList<Integer>> perm = new ArrayList<>();
			// ����ȫ����
			calperm(perm, list, 0);

			// ͳ�����е����е�˳���
			int cv = 0;
			for (int i = 0; i < n; i++) {
				if (A[i] != 0) {
					for (int j = i + 1; j < n; j++) {
						if (A[j] != 0 && A[i] < A[j]) {
							cv++;
						}
					}
				}
			}

			int total = 0;
			for (ArrayList<Integer> temp : perm) {
				int[] temps = Arrays.copyOf(A, n);
				int count = calvalue(temp, temps);
				if (count + cv == k) {
					total++;
				}
			}

			System.out.println(total);

		}
	}

	public static int calvalue(List<Integer> list, int[] A) {
		int val = 0;
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				A[i] = list.get(j++);
				for (int k = 0; k < i; k++) {
					if (A[k] != 0 && A[k] < A[i])
						val++;
				}
				for (int k = i + 1; k < A.length; k++) {
					if (A[k] != 0 && A[k] > A[i])
						val++;
				}
			}
		}
		return val;
	}

	public static void calperm(List<ArrayList<Integer>> perm, ArrayList<Integer> list, int n) {
		if (n == list.size()) {
			perm.add(new ArrayList<>(list));
		} else {
			for (int i = n; i < list.size(); i++) {
				Collections.swap(list, i, n);
				calperm(perm, list, n + 1);
				Collections.swap(list, i, n);
			}
		}
	}
}
