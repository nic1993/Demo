package LeetCode;

public class Le35 {

	public static void main(String[] args) {
		Le35 le35 = new Le35();
		int[] nums = {1,3,5,6};
		
		System.out.println(le35.searchInsert(nums, 4));
	}
	
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
			mid = (start + end) / 2;
			if(nums[mid] == target) return mid;
			else if (nums[mid] > target) {
				end = mid - 1;
				
				if(end < 0) return 0;
			}else {
				start = mid + 1;
				
				if(start >= nums.length) return start;
			}
		}
        
        if(nums[end] > target) {
        	return end - 1;
        }else {
			return end + 1;
		}
    }
}
