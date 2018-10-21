package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Le15 {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		List<List<Integer>> list = threeSum(nums,10);
		for(List<Integer> result : list){
			for(Integer integer : result){
				System.out.print(integer + " ");
			}
			System.out.println();
		}
	}

	 public static List<List<Integer>> threeSum(int[] nums,int target) {
		 List<List<Integer>> list = new ArrayList<>();
		 
		 List<Integer> result;
		 
		 Arrays.sort(nums);
		 
		 int cur = 0;
		 
		 List<Integer> preList = new ArrayList<>();
		 for(int i = 0;i < nums.length;i++){
		     cur = nums[i];

		     if(cur > 0) break;
		     
		     if(i > 0 && nums[i - 1] == nums[i]) continue;
		     
		     int pre = i + 1;
		     
		     int last = nums.length - 1;
		     
		     int num = target - cur;
		     
		     int curSum = 0;
		    
		     while (pre < last) {

				if(pre == i){
					pre++;
					continue;
				}
				
				curSum = nums[pre] + nums[last];
				
				if(curSum == num){

					result = new ArrayList<>();
					result.add(cur);
					result.add(nums[pre]);
					result.add(nums[last]);
					
					list.add(result);
					preList.add(cur);
					
					while (pre < last && nums[pre + 1] == nums[pre]) pre++;
					while (pre < last && nums[last - 1] == nums[last]) last--;
					pre++;
					last--;
					
					continue;
				}
				
				if(curSum > num){
					if(num > 0 && nums[pre] > num) break;
					last--;
				}
				
				if(curSum < num){
					if(num < 0 && nums[last] < num) break;
					pre++;
				}
			}
		 }

		 return list;
	 }
}
