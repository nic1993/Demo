package ½£Ö¸Offer;

public class Test29 {

	 public static void main(String[] args) {
		System.out.println(new Test29().LeftRotateString("", 6));
		String string = "";
		System.out.println(string == "");
	}
	
	 public String LeftRotateString(String str,int n) {
		 if(str.equals("")) return str;
		 int len = str.length();
	     char[] chs = str.toCharArray();
	     char[] rev = new char[len];
	     int num = 0;
	     if(n > len) num = n % len;
	     else {
			num = n;
		 }
	     for(int i = 0;i < chs.length;i++) {
	    	 int index = 0;
	    	 if(i < n) {
	    		 index = len + i - n;
	    	 }else {
				index = i - n;
			}
	    	 rev[index] = chs[i];
	     }

	    
	     return String.valueOf(rev);
	 }
}
