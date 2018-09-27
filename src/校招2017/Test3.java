package 校招2017;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 牛牛想尝试一些新的料理，每个料理需要一些不同的材料，问完成所有的料理需要准备多少种不同的材料
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
