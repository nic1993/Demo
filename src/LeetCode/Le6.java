package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Le6 {
	
	public static void main(String[] args) {
		System.out.println(convert1("PAYPALISHIRING", 3));
	}

    public static String convert(String s, int numRows) {
    	if(s.length() <= numRows) return s;
    	StringBuilder builder = new StringBuilder();
    	
        List<char[]> list = new ArrayList<>();
        
        int pre = 0;
        int gap = 1;
        
        char[] chs = s.toCharArray();
        
        char[] newChs = null;;
        
        while (pre < chs.length) {
 			if(pre == 0 || (gap + 1) % numRows == 0) {
				
			   if(chs.length - pre < numRows) {
				   newChs = new String(chs,pre,chs.length - pre).toCharArray();
			   }else {
				   newChs = new String(chs,pre,numRows).toCharArray();
			   }
			  
			   
			   list.add(newChs);
			   
			   pre += numRows;
			   
			   gap = 1;
			   
			   continue;
			}else {
				newChs = new char[numRows];
				
				int locs = numRows - gap - 1;
				for(int i = 0;i < numRows;i++) {
					if(i == locs) {
						newChs[i] = chs[pre];
					}else {
						newChs[i] = ' ';
					}
				}
				
				list.add(newChs);
			}	
			
			pre++;
			gap++;
		}
        
        int size = list.size();
        
        
        for(int i = 0;i < numRows;i++) {
        	for(int j = 0;j < size;j++) {
        		if(list.get(j).length <= i) {
        		   builder.append(" ");	
        		   continue;
        		}
        		builder.append(list.get(j)[i]);
        	}
        }
        
        return builder.toString().replaceAll(" ", "");
    }
    
    public static String convert1(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int len = numRows + (numRows - 2);
        for(int i = 0; i < s.length(); i += len)
            sb.append(s.charAt(i));
        for(int row = 1; row < numRows - 1; row++) {
            for(int i = row; i < s.length(); i += len) {
                sb.append(s.charAt(i));
                if(i + len - 2 * row < s.length())
                    sb.append(s.charAt(i + len - 2 * row));
            }
        }
        for(int i = numRows - 1; i < s.length(); i += len)
            sb.append(s.charAt(i));
        return sb.toString();
    }
}
