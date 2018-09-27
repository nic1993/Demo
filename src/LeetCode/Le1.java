package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Le1 {
	
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		
		int[] res = twoSum(nums, 6);
	}

    public static int[] twoSum(int[] nums, int target) {
    	int[] res = new int[2];
    	
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0;i < nums.length;i++) {
        	int next = target - nums[i];
        	
        	if(map.get(next) != null && map.get(next) != i) {
        		res[0] = i;
        		res[1] = map.get(next);
        		
        		return res;
        	}
        	
        	map.put(nums[i], i);
        }
        return res;
    }
}
