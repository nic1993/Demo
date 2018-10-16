package LeetCode;

public class Le28 {
	public static void main(String[] args) {
		System.out.println(strStr("mississippi","pi"));
		
	}

    public static int strStr(String haystack, String needle) {
        
    	if(needle.equals("")) return 0;
    	
        int loc = 0;
        while (loc < haystack.length()) {
        	int i = loc;
			int j = 0;
			
			int pre = i;
			
            boolean flag = false;
			
			for(;j < needle.length() && i < haystack.length();j++) {
				if(haystack.charAt(i) == needle.charAt(j)) {
					if(haystack.charAt(i) == needle.charAt(0) && i != loc && pre == loc) {
						pre = i;
					}
					i++;
				}else {
					break;
				}
			}
			
			
			
			if(j == needle.length()) {
				return loc;
			}
			
			if(i >= haystack.length()) return -1;
			
			if(pre != loc) {
				loc = pre;
			}else {
				if(i == loc) ++i;
				loc = i;
			}
			
		}
        
        return -1;
    }
}
