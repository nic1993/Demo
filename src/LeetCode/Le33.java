package LeetCode;

public class Le33 {
	public static void main(String[] args) {
		Le33 le33 = new Le33();
		int[] nums = {1,3};
		System.out.println(le33.search(nums, 3));
	}

    public int search(int[] nums, int target) {
        int low = 0,high = nums.length - 1;
        int mid;
        while (low <= high) {
        	mid = (low + high) / 2;
        	if(nums[mid] == target) return mid;
        	if(nums[mid] > target) {
        		if(nums[mid] > nums[high]) {
        			if(nums[low] > target) {
        				low = mid + 1;
        			}else{
						high = mid - 1;
					}
        		}else {
					high = mid - 1;
				}
        	}else {
				if(nums[mid] > nums[high]) {
					low = mid + 1;
				}else {
					if(nums[high] < target) {
						high = mid - 1;
					}else {
						low = mid + 1;
					}
				}
			}
		}
        
        return -1;
    }
}
