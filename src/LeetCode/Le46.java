package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Le46 {
	public static void main(String[] args) {
		Le46 le46 = new Le46();
		int[] nums = {1,1,2};
		List<List<Integer>> list = le46.permute(nums);
		
		for(List<Integer> res : list) {
			for(Integer num : res) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	

	 public List<List<Integer>> permute(int[] nums) {
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
	     ArrayList<Integer> temp = new ArrayList<Integer>();
	     dfs(res, nums, 0);
	     return res;
	 }
	 
	 private void dfs(List<List<Integer>> res,int[] nums,int j) {
		 if(j == nums.length) {
			 List<Integer> temp = new ArrayList<>();
			 for(int num : nums) {
				 temp.add(num);
			 }
			 res.add(temp);
		 }
		 
		 for(int i = j;i < nums.length;i++) {
			 swap(nums, i, j);
			 dfs(res, nums, j + 1);
			 swap(nums, i, j);
		 }
	 }
	 
	 private void swap(int[] nums,int m,int n) {
		 int temp = nums[m];
		 nums[m] = nums[n];
		 nums[n] = temp;
	 }
}
