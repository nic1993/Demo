package CYK;
/*
 * 求字典序在s1和s2之间的，长度在len1到len2的字符串的个数，结果mod 1000007。
 */
public class Test24 {

	    public static void main(String[] args) {
			process("ab", "bb", 1, 2);
		}
	
		private static int process(String str1, String str2, int len1, int len2) {
		    long res = 0;
		    char[] ch1 = str1.toCharArray();
		    char[] ch2 = str2.toCharArray();
		    for(int i = len1;i <= len2;i++) {
		    	char a = ch1[0];
		    	char b = ch2[0];
		    	res += (long)Math.pow(26, i-1)*(b-a);
		    	long suma = 0;
		    	long sumb = 0;
		    	for(int j = 1;j < ch1.length;j++) {
		    		suma += suma + (ch1[j] -'a')*(long) Math.pow(26, i-1-j);
		    	}
		    	
		    	for(int j = 1;j < ch2.length;j++) {
		    		sumb += sumb + (ch2[j] -'a')*(long) Math.pow(26, i-1-j);
		    	}
		    	
		    	res = res + sumb - suma;
		    }
		    res--;
		    res = res % 100007;
		    System.out.println(res);
		    return (int)res;
			
		}
	
}
