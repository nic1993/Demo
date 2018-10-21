package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.security.auth.kerberos.KerberosKey;

public class Le18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> list = new ArrayList<>();
		 
		 List<Integer> result;
		 
		 Arrays.sort(nums);
		 
		 int cur1 = 0;
		 
		 int cur2 = 0;
		 
		 for(int i = 0;i < nums.length - 3;i++){
			 
			 if(i > 0 && nums[i - 1] == nums[i]) continue;
			 
			 for(int j = i + 1;j < nums.length - 2;j++){
				 cur1 = nums[i];
				 
				 cur2 = nums[j];
				 
				 if(j > i + 1 && nums[j] == nums[j - 1]) continue;
				 
				 int pre = j + 1;
				 
				 int last = nums.length - 1;
				 
				 while (pre < last) {
					 
					int sum = cur1 + cur2 + nums[pre] + nums[last];
					
					if(sum == target){
						
						result = new ArrayList<>();
						
						result.add(cur1);
						
						result.add(cur2);
						
						result.add(nums[pre]);
						
						result.add(nums[last]);
						
						list.add(result);
						
						while (pre < last && nums[pre + 1] == nums[pre]) pre++;
						
						while (pre < last && nums[last - 1] == nums[last]) last--;
						
						pre++;
						
						last--;
						
						continue;
					}
					
					if(sum > target) last--;
					
					if(sum < target) pre++;	
				}
			 }
		 }
		 
		 return list;
    }
}
