package CYK;

public class Test66 {
	static int index = 0;
	
	public static void main(String[] args) {
		int[][] mat = {{57,50,59,18,31,13},{67,86,93,86,4,9},{38,98,83,56,82,90},{66,50,67,11,7,69},{20,58,55,24,66,10},{43,26,65,0,64,28},{62,86,38,19,37,98}};
		int n = 7;
		int m = 6;
		clockwisePrint(mat, n, m);
		
		
	}

	public static int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
		int[] out = new int[n*m];
		int start = 0;
		while (mat[0].length > start * 2 && mat.length > start * 2) {
			printOneCircle(mat, n, m, start, out);
			start++;
		}
		for(int i = 0;i < out.length;i++)
			System.out.println(out[i]);
		return out;
    }
	
	private static void printOneCircle(int[][] mat,int n,int m,int start,int[] out) {
		int endX = m - 1 - start;  
        int endY = n - 1 - start; 
        
        //从左往右打印
        for(int i = start;i <= endX;i++) {
        	out[index++] = mat[start][i];
        }
        
        //从上往下打印
        if(start < endY) {
        	for(int i = start + 1;i <= endY;i++) {
            	out[index++] = mat[i][endX];
            }
        }
        
        
        //下方从右往左打印
        if(start < endX && start < endY) {
        	 for(int i = endX - 1;i >= start;i--) {
             	out[index++] = mat[endY][i];
             }
        }
       
        
        //从下往上打印s
        if(start < endX && start < endY - 1) {
        	 for(int i = endY - 1;i >= start + 1;i--) {
        		 out[index++] = mat[i][start];
        	 }
        }
       
	}
	
}
