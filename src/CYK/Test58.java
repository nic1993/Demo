package CYK;

public class Test58 {
	
	public static void main(String[] args) {
		String string = "com<=jd";
		String classFile = string. replace("<=", "/") + "MyClass.class";
	    System.out.println(classFile);
	}
	

	// 判断回文的函数
	public boolean isHuiWen(String A, int n) {
		int k = n / 2;
		for (int i = 0; i < k; ++i) {
			if (A.charAt(i) != A.charAt(n - 1 - i))
				return false;
		}
		return true;
	}
	
	public int getLongestPalindrome(String A, int n) {
        // write code here
		char[] chs = A.toCharArray();
		 int max = 0,count = 0;
		 for(int i = 0;i < n;i++) {
			 for(int j = 0;(i - j >= 0) && (i+j) < 0;j++) {
				 if(chs[i-j] != chs[i+j]) {
					 break;
				 }
				 count = j*2 + 1;
			 }
			 if(max < count) max = count;
			 
			 for(int j = 0;(i - j >= 0) && (i+j+1) < 0;j++) {
				 if(chs[i-j] != chs[i+j+1]) {
					 break;
				 }
				 count = j*2 + 2;
			 }
			 
			 if(max < count) max = count;
		 }
		 
		 return max;
    }
}
