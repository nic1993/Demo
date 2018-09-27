package CYK;
/*
 * 给定两个有序数组arr1和arr2，两个数组长度都为N，求两个数组中所有数的上中位数。
 */
public class Test46 {
	
	
	public static int getUpMedian(int [] arr1,int[] arr2)  
    {
		if(arr1 == null || arr1.length == 0 || arr2.length == 0 || arr2 == null) {
			return -1;
		}
		int left1 = 0,right1 = arr1.length - 1;
		int left2 = 0,right2 = arr2.length - 1;
		while (left1 != right1) {
			int offset = 0;
			if((right1 - left1 + 1) % 2 == 0) {
				offset = 1;
			}
			int mid1 = (left1 + right1)/2;
			int mid2 = (left2 + right2)/2;
			
			if(arr1[mid1] > arr2[mid2]) {
				right1 = mid1;
				left2 = mid2 + offset;
			}else if (arr1[mid1] < arr2[mid2]) {
				left1 = mid1 + offset;
				right2 = mid2;
			}else {
				return arr1[mid1];
			}
		}
		
		return Math.min(arr1[left1], arr2[left2]);
    }
	
	public static int getUpMedian(int[] arr1,int start1,int end1,int[] arr2,int start2,int end2)  
    {  
        if(start1==end1)  
            return Math.min(arr1[start1], arr2[start2]);  
        int offset=0;  
        if((end1-start1+1)%2==0)  
            offset=1;  
        int mid1 = (start1+end1)/2;  
        int mid2 = (start2+end2)/2;  
        if(arr1[mid1]>arr2[mid2])  
        {  
            return getUpMedian(arr1,start1,mid1,arr2, mid2+offset,end2);  
        }else if(arr1[mid1]<arr2[mid2]){  
            return getUpMedian(arr1,mid1+offset,end1,arr2, start2,mid2);  
        }else{  
            return arr1[mid1];  
        }  
    }
	
	public static int getKNumber(int arr1[],int arr2[],int k) {
		 if(arr1==null || arr1.length==0 ||arr2.length==0||arr2==null)  
	            throw new RuntimeException("输入错误");  
	        if(k<=0||k>(arr1.length+arr2.length))  
	            throw new RuntimeException("输入错误"); 
	        
	        int [] longarr = arr1.length>arr2.length ? arr1 :arr2;  
	        int [] shortarr = arr1.length>arr2.length ?arr2 :arr1; 
	        if(k <= shortarr.length) return getUpMedian(arr1,0,k - 1, arr2,0,k-1);
	        if(k > longarr.length) {
	        	if(shortarr[k - longarr.length - 1] >= longarr[longarr.length - 1]) {
	        		return shortarr[k - longarr.length - 1];
	        	}
	        	
	        	if(longarr[k - shortarr.length - 1] >= shortarr[shortarr.length - 1]) {
	        		return longarr[k - shortarr.length - 1];
	        	}
	        	
	        	return getUpMedian(shortarr, k - longarr.length, shortarr.length - 1, longarr, k - shortarr.length, longarr.length - 1);
	        }
	        
	        if(longarr[k - shortarr.length - 1] >= shortarr[shortarr.length - 1]) return longarr[k - shortarr.length - 1];
	        
	        return getUpMedian(shortarr, 0, shortarr.length - 1, longarr, k - shortarr.length , k - 1);
	}
}
