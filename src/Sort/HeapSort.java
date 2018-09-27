package Sort;

import java.util.Scanner;

public class HeapSort {

	public static void sort(int[] arr) {
		//1.构建大顶堆
		for(int i = arr.length/2-1;i >= 0;i--) {
			//从第一个非叶子结点从下至上，从右至左调整结构
			adjustHeap(arr, i, arr.length);
		}
		
		for(int j = arr.length - 1;j > 0;j--) {
			swap(arr, 0, j);
			adjustHeap(arr, 0, j);
		}
	}
	
	public static void adjustHeap(int []arr,int i,int length){
		int temp = arr[i];
		for(int k = 2*i+1;k < length;k= 2*k+1) {
			if(k+1 < length && arr[k+1] > arr[k]) {
				k++;
			}
			
			if(arr[k] > temp) {
				arr[i] = arr[k];
				i = k;
			}else {
				break;
			}	
		}
		arr[i] = temp;
	}
	
	/**
     * 交换元素
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
    	int[] arr = {6,3,7,4,2,8,1};
		sort(arr);
		
		for(int i : arr) {
			System.out.print(i + "  ");
		}
	}
//    public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		int t,n,k;
//		int[] v;
//		
//		t = scanner.nextInt();
//		for(int i = 0;i < t;i++) {
//			n = scanner.nextInt();
//			k = scanner.nextInt();
//			v = new int[n];
//			for(int j = 0;j < n;j++) {
//				v[j] = scanner.nextInt();
//			}
//			System.out.println(Count(v, k));
//		}
//	}
//    
//    public static long Count(int[] v,int k) {
//    	long[] dp = new long[k+1];
//    	dp[0] = 1;
//    	for(int i = 0;i < v.length;i++) {
//    		for(int j = v[i];j <= k;j++) {
//    			dp[j] = (dp[j] + dp[j - v[i]]) % 100000007;
//    		}
//    	}
//    	
//    	return dp[k] % 100000007;
//    }
}
