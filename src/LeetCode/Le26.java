package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Le26 {

	public static void main(String[] args) {
		int[] nums = {0,1,2,2,2};
		
		int len = new Le26().removeDuplicates(nums);
		
		for(int i = 0;i < len;i++) {
			System.out.println(nums[i]);
		}
	}

	 public int removeDuplicates(int[] nums) {
	        
		 int length = nums.length;
	        
	        if(length == 0)
	            return 0;
	        
	        int i;
	        int targetIndex = 1;
	        int original = nums[0];
	        
	        for(i = 1; i < length; i++){
	            
	            if(nums[i] != original){
	                
	                original = nums[i];
	                nums[targetIndex] = nums[i];
	                targetIndex++;
	            }
	        }
	        
	        return targetIndex;
	 }
}
