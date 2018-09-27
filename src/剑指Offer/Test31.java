package ½£Ö¸Offer;

public class Test31 {
	public static void main(String[] args) {
		new Test31().StrToInt("-2147483648");
	}
	
    public int StrToInt(String str) {
        boolean flag = false;
        
        if(str == null || str.trim().equals("")) {
        	flag = true;
        	return 0;
        }
        
        int symbol = 0;
        int start = 0;
        char[] ch = str.toCharArray();
        if(ch[0] == '+') {
        	symbol = 0;
        	start = 1;
        }
        if(ch[0] == '-') {
        	symbol = 1;
        	start = 1;
        }
        int result = 0;
        for(int i = start;i < str.length();i++) {
        	if (ch[i] > '9' || ch[i] < '0') {
        		
        		return 0;
        	}
        	int sum = result * 10 + ch[i] - 48;
        	
        	result = result * 10 + (int)(ch[i] - '0');
        }
        result = symbol == 0? result : result * -1;
        System.out.println(result);
        return result;
    }
    
    public int StrToInt2(String str) {
        if(str == null || str.length() <= 0) {
            return 0;
        }
        int result = 0;
        Boolean  flag = true; 
        if(str.charAt(0) == '-') {
            flag = false;
        }
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '-') {
                continue;
            }
            else if(str.charAt(i) == '+') {
                continue;
            }
            else if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return 0;
            }
            else {
                result = result * 10 + str.charAt(i) - '0';
            }
        }
        return flag == true ? result : result * -1;
    }
}
