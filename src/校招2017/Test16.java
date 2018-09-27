package пёуп2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test16 {

	public static void main(String[] args) {
		int[] poker = {1,2,3,4,5,6};
		clean(poker);
	}
	
	private static void clean(int[] poker) {
		List<Integer> list = new ArrayList<>();
		
		int n = poker.length / 2;
		
		for(int i = n - 1,j = poker.length - 1;i >= 0 && j >= n;i--,j--) {
			list.add(poker[j]);
			list.add(poker[i]);
		}
		
		Collections.reverse(list);
		
		Integer[] pokers = list.toArray(new Integer[n * 2]);
		
	}
}
