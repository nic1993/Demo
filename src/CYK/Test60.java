package CYK;

import java.util.Collections;

public class Test60 {
	public static void main(String[] args) {
		System.out.println(addToPalindrome("acbb", 4));
	}

	public static String addToPalindrome(String A, int n) {
        // write code here
		char[] chs = A.toCharArray();
		String s = reverse(A);
		for(int i = 0;i < n;i++) {
			if(A.substring(i, n).equals(s.substring(0, n-i))) {
					return s.substring(n-i, n);
			}		
		}
		return "";
    }
	
	public static String reverse(String s) {  
		  int length = s.length();  
		  if (length <= 1)  
		   return s;  
		  String left = s.substring(0, length / 2);  
		  String right = s.substring(length / 2, length);  
		  return reverse(right) + reverse(left);  //µ÷ÓÃµÝ¹é  
		 } 
}
