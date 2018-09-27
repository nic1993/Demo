package CYK;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test10 {

	// DFS function returns an array including all substrings derived from s.
	List<String> DFS(String s, Set<String> wordDict, HashMap<String, LinkedList<String>>map) {
		if(map.containsKey(s)){
			return map.get(s);
		}
		
		LinkedList<String> res = new LinkedList<String>();
		if(s.length() == 0){
			res.add("");
			return res;
		}
			
		for(String string : wordDict){
			if(s.startsWith(string)){
				List<String> sublist = DFS(s.substring(string.length()), wordDict, map);
				for(String word : sublist){
					res.add(string + (word.isEmpty()?"" : " ") + word);
				}
			}
		}
		map.put(s, res);
		return res;
	}
}
