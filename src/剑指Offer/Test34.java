package 剑指Offer;

public class Test34 {

    public boolean isNumeric(char[] str) {
        boolean hasE = false,decimal = false,sign = false;
        for(int i = 0;i < str.length;i++) {
        	if(str[i] == 'e' || str[i] == 'E') {
        		if(hasE) return false;
        		if(i == str.length - 1) return false;
        		hasE = true;
        	}else if (str[i] == '+' || str[i] == '-') {
        		// 第二次出现+-符号，则必须紧接在e之后
				if(sign && str[i-1] != 'e' && str[i-1] != 'E') return false;
				// 第一次出现+-符号，且不是在字符串开头，则也必须紧接在e之后
				if(!sign && i > 0 && str[i - 1] != 'e' && str[i-1] != 'E') return false;
				sign = true;
			}else if (str[i] == '.') {
				// e后面不能接小数点，小数点不能出现两次
				if(hasE || decimal) return false;
				decimal = true;
			}else if (str[i] < '0' || str[i] > '9') {
				return false;
			}
        }
    	return true;
    }
}
