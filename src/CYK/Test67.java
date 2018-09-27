package CYK;

public class Test67 {
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] roate = rotateMatrix(mat, 3);
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				System.out.print(roate[i][j] + " ");
			}
		}
	}

	public static int[][] rotateMatrix(int[][] mat, int n) {
        // write code here
		int[][] roate = new int[n][n];
		
		for(int i = 0;i < n;i++) {
			for(int j = n - 1;j >= 0;j--) {
				System.out.print(mat[j][i] + " ");
				roate[i][n-j-1] = mat[j][i];
				
			}
			System.out.println();
		}
		
		return roate;
    }
}
