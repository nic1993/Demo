package LeetCode;

public class Le31 {
	public static void main(String[] args) {
		Le31 le31 = new Le31();
		
		int[] nums = {1,2,3};
		le31.nextPermutation(nums);
	}

    public void nextPermutation(int[] nums) {
        int i,j,len = nums.length;
        
        for(i = len - 2;i >= 0;i--) {
        	if(nums[i + 1] > nums[i]) {
        		for(j = len - 1;j > i - 1;j--) {
        			if(nums[j] > nums[i]) break;
        		}
        		
        		swap(nums, i, j);
        		reverse(nums, i + 1, nums.length - 1);
        		return;
        	}
        }
        
        reverse(nums, 0, nums.length - 1);
        return;
    }
    
    public void swap(int[] nums,int i,int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    
    public void reverse(int[] num, int begin, int end) {
        int l = begin, r = end;
        while (l < r) {
            int tmp = num[l];
            num[l] = num[r];
            num[r] = tmp;
            l++;
            r--;
        }
    }
}
