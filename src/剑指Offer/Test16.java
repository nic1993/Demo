package ½£Ö¸Offer;

import java.util.Arrays;

public class Test16 {

    public boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence == null || sequence.length == 0) return false;
        int len = sequence.length;
        int root = sequence[len - 1];
        int left = 0;
        for(int i = 0;i < left;i++) {
        	if(sequence[i] > root) {
        		left = i - 1;
        		break;
        	}
        }
        for(int j = left + 1;j < len;j++) {
        	if(sequence[j] < root) return false;
        }
        
        boolean leftFlag = true;
        if(left > 0) 
        	  leftFlag = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, left));
        
        boolean rightFlag = true;
        if(left < len - 1) {
        	rightFlag = VerifySquenceOfBST(Arrays.copyOfRange(sequence, left + 1, len - 1));
        }
        
        return leftFlag && rightFlag;
    }
}
