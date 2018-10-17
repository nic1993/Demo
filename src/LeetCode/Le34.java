package LeetCode;

public class Le34 {
	   public int[] searchRange(int[] nums, int target) {
	        int  start = 0,end = nums.length - 1;
	        int mid;
	        while (start <= end) {
				if(nums[start] == target){
					return result(nums, start, target);
				}else if(nums[end] == target){
					return  result(nums, end, target);
				}else {
					mid = (start + end) / 2;
					if(nums[mid] == target){
						return  result(nums, mid, target);
					}else if(nums[mid] < target){
						int i = mid;
						while (i < nums.length ) {
							if(nums[i] == nums[mid]) i++;
							else {
								break;
							}
						}
						start = i;
					}else {
						int i = mid;
						while (i >= 0) {
							if(nums[i] == nums[mid]) i--;
							else {
								break;
							}
						}
						end = i;
					}
				}
			}
	        int[] vals = new int[2];
			vals[0] = -1;
			vals[1] = -1;
	        return vals;
	    }
	   
	    public int[] result(int[] nums,int mid,int target){
	    	int i = mid;
			while (i >= 0 && nums[i] == target) {
				i--;
			}
			i++;
			int j = mid;
			while (j <= nums.length - 1 &&nums[j] == target) {
				j++;
			}
			j--;
			int[] vals = new int[2];
			vals[0] = i;
			vals[1] = j;
			return vals;
	    }
}
