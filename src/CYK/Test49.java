package CYK;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test49 {

	public int findLongest(int[] A, int n) {
        // write code here
		int[] nums = new int[n];
		Arrays.fill(A, 1);
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < i;j++) {
				if(A[j] < A[i] && nums[j] + 1 > nums[i]) {
					nums[i] = nums[j] + 1;
				}
			}
		}
		
		return 0;
    }
	
	//二分法最长子序列
	public int findLongest2(int[] A, int n) {
        // write code here
		int[] nums = new int[n];
		nums[0] = A[0];
		int len = 0;
		for(int i = 1;i < n;i++) {
			if(A[i] > nums[len]) {
				nums[++len] = A[i];
			}else {
				findLoc(nums, A[i]);
			}
		}
		
		return 0;
    } 
	
	private void findLoc(int[] nums,int a) {
		int end = nums.length;
		int start = 0;
		while (start != end) {
			int mid = (end + start) / 2;
			if(mid == a) return;
			else if (nums[mid] > a) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		nums[start] = a;
	}
}
