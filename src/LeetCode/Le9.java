package LeetCode;

public class Le9 {
     public static void main(String[] args) {
		
	}
	
	 public static  boolean isPalindrome(int x) {
	      char[] chs = String.valueOf(x).toCharArray();
	      int len = chs.length;
	      
	      for(int i = 0,j = len-1;i <= j;i++,j--) {
	    	  if(chs[i] == chs[j]) {
	    		  continue;
	    	  }else {
				return false;
			}
	      }
	      return true;
	 }
}
