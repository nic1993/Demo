package CYK;

import java.util.HashMap;
import java.util.Scanner;

public class Test29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int n = in.nextInt();
		int[] x = new int[n];
		for(int i = 0;i < n;i++) {
			x[i] = in.nextInt();
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int result = -1;
		for(int i = 0;i < n;i++) {
			int m = x[i] % p;
			if(map.get(m) != null) {
				result = i;
			}
		}
	}
}
