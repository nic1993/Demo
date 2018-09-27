package LeetCode;

import java.math.BigDecimal;

public class Le8 {

	public static void main(String[] args) {
		System.out.println(myAtoi("-5-"));
		
//		System.out.println(Long.valueOf("+1"));
	}
	
    public static int myAtoi(String str) {
    	if(str.equals("") || str == null) return 0;
    	
        String init = str.trim();
        
        String[] strs = init.split(" ");
        
        String convertStr = strs[0];
        
        StringBuilder builder = new StringBuilder();
        
        boolean flag = false;
    	for(int i = 0;i < convertStr.length();i++) {
    		if(convertStr.charAt(i) == '-' || convertStr.charAt(i) == '+') {
    			if(i != 0) break;
    			
    			if(flag == true) return 0;
    			builder.append(convertStr.charAt(i));
    			flag = true;
				
    		}else if (convertStr.charAt(i) == '.' ) {
    			break;
			}
    		else if ('0' > convertStr.charAt(i) || '9' < convertStr.charAt(i)) {
				break;
			}else {
				builder.append(convertStr.charAt(i));
			}
    	}
    	
    	double res;
    	try {
    		res = Double.valueOf(builder.toString());
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
    	
    	if(res < Integer.MIN_VALUE) {
    		return Integer.MIN_VALUE;
    	}
    	
    	
    	return (int) (res > Integer.MAX_VALUE ? Integer.MAX_VALUE : res);
    }
}
