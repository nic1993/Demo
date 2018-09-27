package cn.test;

public class test21 {
	public static void main(String[] args) {
		int[] A = {3,2,1,1,2,3};
		System.out.println(countArea(A, 6));
	}

	public static int countArea(int[] A, int n) {
        // write code here
       int [][] dp=new int[n][n];
       for(int i=0;i<n;i++)
       {
           dp[i][i]=A[i];
       }
       for(int i=1;i<=n;i++)
       {
           for(int j=0;j+i<n;j++)
           {
               int min=A[j];
               for(int k=j+1;k<=i+j;k++)
               {
                   min=Math.min(min, A[k]);
               }
               dp[j][j+i]=Math.max(dp[j][j+i-1], dp[j+1][j+i]);
               dp[j][j+i]=Math.max(min*(i+1), dp[j][j+i]);
           }
       }
       return dp[0][n-1];
    }
}
