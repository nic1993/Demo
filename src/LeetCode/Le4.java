package LeetCode;

import java.util.Arrays;

public class Le4 {
	
	public static void main(String[] args) {
		int[] nums1 = {1,6};
		int[] nums2 = {3,4,7,8};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));
		
//		System.out.println(findMedian(nums1, nums2));
		
	}

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) { 
    	int m = nums1.length, n = nums2.length, left = (m + n + 1) / 2, right = (m + n + 2) / 2;
        return (slove(nums1, nums2, left) + slove(nums1, nums2, right)) / 2.0;
          
    }
    
    public static double slove(int[] nums1,int[] nums2,int k) {
    	int m = nums1.length, n = nums2.length;
    	
        if (m > n) return slove(nums2, nums1, k);
        
        if (m == 0) return nums2[k - 1];
        
        if (k == 1) return Math.min(nums1[0], nums2[0]);
        
        int i = Math.min(m, k / 2), j = Math.min(n, k / 2);
        
        if (nums1[i - 1] > nums2[j - 1]) {
            return slove(nums1, Arrays.copyOfRange(nums2, j, n), k - j);
        } else {
            return slove(Arrays.copyOfRange(nums1, i, m), nums2, k - i);
        }
    			
    }
    
    /**
     * 获取中位数
     * @param nums1
     * @param nums2
     * @return
     */
    private static double findMedian(int[] nums1,int[] nums2) {
    	if(nums1 == null  || nums2 == null) return -1;
    	int m = nums1.length;
    	int n = nums2.length;
    	int len = m + n;
    	if(len == 0) return -1;
    	if(n == 0) return findMedian(nums2, nums1);
    	int left = -1,right = -1;
    	int aStart = 0,bStart = 0;
    	for(int i = 0;i <= len / 2;i++) {
    		left = right;
    		if(aStart < m && (bStart >= n || nums1[aStart] < nums2[bStart])) {
    			right = nums1[aStart++];
    		}else {
				right = nums2[bStart++];
			}
    	}
    	
    	if((len&1) == 0) return (right + left) * 1.0  / 2;
    	return right;
    }
}
