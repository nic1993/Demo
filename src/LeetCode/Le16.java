package LeetCode;

import java.util.Arrays;

public class Le16 {
	 public static void main(String[] args) {
		int[] nums = {1, 1, -1, -1,3};
		System.out.println(new Le16().threeSumClosest(nums, -1));
	}

	 public int threeSumClosest(int[] nums, int target) {
	        int cloest = Integer.MAX_VALUE;
	        
	        
	        Arrays.sort(nums);
	        
	        int cur = 0;
	        
	        int pre;
	        int last;
	        int curSum = 0;
	        int result = 0;
	        for(int i = 0;i < nums.length;i++){
	           	cur = nums[i];
	           	pre = i + 1;
	           	last = nums.length - 1;
	           	
	           	while (pre < last) {
			
					curSum = cur + nums[pre] + nums[last];
					
					if(Math.abs(curSum - target) <= Math.abs(cloest)){
						
						cloest = curSum - target;
						
						result = curSum;
						
					}
					
					if(curSum < target) pre++;
					else {
						last--;
					}
				}
	        }
	        return result;
	 }
}
