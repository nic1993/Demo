package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Le47 {
	
	public static void main(String[] args) {
		Le47 le47 = new Le47();
		int[] nums = {1,1,2};
		le47.permuteUnique(nums);
		
	}

    public List<List<Integer>> permuteUnique(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> res = new ArrayList<>();
    	List<Integer> cur = new ArrayList<>();
    	int[] pos = new int[nums.length];
    	getResult(res, cur, nums, pos, 0);
    	return res;
    }
    
    public void getResult(List<List<Integer>> res,List<Integer> cur,int[] nums,int[] pos,int num) {
    	if(cur.size() == nums.length) {
    		res.add(new ArrayList<>(cur));
    		return;
    	}
    	
    	for(int i = 0;i < nums.length;i++) {
    		if(pos[i] == 0) {
    			cur.add(nums[i]);
    			pos[i] = 1;
    			getResult(res, cur, nums, pos, num + 1);
    			pos[i] = 0;
    			cur.remove(num);
    			while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
					i++;
				}
    			
    		}
    	}
    }
}
