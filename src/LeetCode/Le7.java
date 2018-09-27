package LeetCode;

public class Le7 {

	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
	
    public static int reverse(int x) {

    	long cur = 0;
        
        while (x != 0) {
			cur = x % 10 + cur * 10;
			x /= 10;
		}
        
        return (int) (cur < Integer.MIN_VALUE || cur > Integer.MAX_VALUE ? 0 : cur);
    }
}
