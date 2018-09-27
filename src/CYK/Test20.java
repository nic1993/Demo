package CYK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test20 {

	public char findFirstRepeat(String A, int n) {
        // write code here
		char[] chs = A.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0;i < chs.length;i++){
			if(map.get(chs[i])  != null){
				return chs[i];
			}
		}
		return ' ';
    }
}
