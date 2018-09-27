package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Le3 {
	
	public static void main(String[] args) {
		
		System.out.println(lengthOfLongestSubstring("dvdf"));
		
	}

	 public static int lengthOfLongestSubstring(String s) {
	       int len = 0,n = s.length();
	       
	       Map<Character, Integer> map = new HashMap<>();
	       
	       
	       for(int i = 0, j = 0;i < n;i++) {
	    	   if(map.containsKey(s.charAt(i))) {
	    		   j = Math.max(map.get(s.charAt(i)), j);
	    	   }
	    	   len = Math.max(len, i - j + 1);
	    	   
			   map.put(s.charAt(i), i + 1);
			}
	       
	       
	       return len;
	 }
}
