package CYK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test34 {

	public void solve(HashMap<Integer, List<Integer>> map) {
		List<Integer> Cheats = new ArrayList<>();
		for(Integer num : map.keySet()) {
			List<Integer> list = map.get(num);
			
			int que = list.get(0);
			for(int i = 1;i < list.size();i++) {
				if(map.get(list.get(i)).contains(que)) {
					if(!Cheats.contains(list.get(i))) {
						Cheats.add(list.get(i));
					}
					if(!Cheats.contains(que)) {
						Cheats.add(que);
					}
				}
			}
		}
	}
}
