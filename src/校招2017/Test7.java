package 校招2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 牛牛的作业薄上有一个长度为 n 的排列 A，这个排列包含了从1到n的n个数，但是因为一些原因，其中有一些位置（不超过 10 个）看不清了，
 * 但是牛牛记得这个数列顺序对的数量是 k，顺序对是指满足 i < j 且 A[i] < A[j] 的对数，请帮助牛牛计算出，符合这个要求的合法排列的数目。
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

			// 统计排列中不存在的数字
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 1; i <= n; i++) {
				if (flag[i] == false)
					list.add(i);
			}

			List<ArrayList<Integer>> perm = new ArrayList<>();
			// 计算全排列
			calperm(perm, list, 0);

			// 统计已有的排列的顺序对
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
