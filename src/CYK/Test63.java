package CYK;

public class Test63 {

	 public int findMaxDivision(int[] A, int n) {
	        // write code here
		 int max = A[0];
		 int min = A[0];
		 
		 for(int i = 1;i < n;i++) {
			 if(A[i] > max) max = A[i];
			 if(A[i] < min) min = A[i];
		 }
		 
		 int[] arrs = new int[max - min - 1];
         for(int i = 0;i  < n;i++) {
        	 arrs[A[i] - min]++; // ÌîÍ°
		 }
		 int count = 0;
		 int maxCount = 0;
		 for(int i = 0;i  < n;i++) {
			 if(arrs[i] == 0) {
				 count++;
			 }else {
				if(maxCount < count){
					maxCount = count;
				}
				count = 0;
			}
		 }
		 return maxCount+1;
	 }
}
