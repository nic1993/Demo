package cn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test23 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,6,8,9};
		System.out.println(threeSum(nums, 15));
		
	}
	
	public static boolean threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1, k = nums.length-1; j < k;) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == target) {
                    return true;
                } else if(sum < target) {
                    j++;
                    
                } else {
                    k--;
                }
            }
        }
        return false;
    }
}
