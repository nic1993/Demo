package LeetCode;

public class Le29 {
	
	public static void main(String[] args) {
		Le29 le29 = new Le29();

		
		System.out.println(le29.divide(-2147483648, 2));
	}

    public int divide(int dividend, int divisor) {
    	
    	if(divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) return Integer.MAX_VALUE;
    	
    	
    	long m = Math.abs((long) dividend);
    	
    	long n = Math.abs((long) divisor);
    	
    	long res = 0;
    	
    	int sign = 1;
    	if(dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) sign = -1;
    	
    	if(n == 1) {
    		m = sign == 1? m : -m;
    		return (int) m;
    	}
    	
    	if(m == n) {
    		return sign * 1;
    	}
    	
    	while (m >= n) {
			long t = n,p = 1;
			
			while (m > (t << 1)) {
				t <<= 1;
				p <<= 1;
			}
			res += p;
			m -= t;
		}
    	
    	res = sign == 1?res : -res;
        return  (int)res;
    }
    
    
}
