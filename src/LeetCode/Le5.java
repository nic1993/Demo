package LeetCode;

public class Le5 {
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("zzzyvvynh"));
		
//		System.out.println(longestPalindrome("cddd"));
	}

    public static String longestPalindrome(String s) {
       if(s == null || s.length() == 0) return s;
    	
    	int left = 0,right = 0;
        
        int[] locs = new int[2];
        
        int gap = 0;
        for(int i = 1;i < s.length();i++) {
        	left = i - 1;
        	
        	while(left >= 0 && s.charAt(i) == s.charAt(left)) {
        		left--;
        	}
        	
        	if(gap < (i-left)) {
        		if(left < 0) {
        			locs[0] = 0;
        		}else {
					locs[0] = left + 1;
				}
        		
        		locs[1] = i;
        		
        		gap = locs[1] - locs[0] + 1;
        	}
        	
        	right = i + 1;
        	while (right < s.length() && s.charAt(i) == s.charAt(right)) {
				right++;
			}
        	
        	while (left >= 0 && right < s.length()) {
				if(s.charAt(left) != s.charAt(right)) {
					if(gap < (--right - ++left)) {
						locs[0] = left;
						locs[1] = right;
						
						gap = right - left + 1;	
					}
					break;
				}else {
					
					if(left == 0 || right == s.length() - 1) {
						if(gap < (right - left)) {
						   locs[0] = left;
						   locs[1] = right;
							
						   gap = right - left + 1;	
						}
						
						break;
					}
					
					left--;
					right++;
				}
			}
        }
        
        return new String(s.toCharArray(),locs[0],locs[1] - locs[0] + 1);
    }
}
