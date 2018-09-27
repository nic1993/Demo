package CYK;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class CoinCounts {
	
	public static void main(String[] args) {  
		
		System.out.println(Math.log(627672) / Math.log(2));
        Scanner scanner = new Scanner(System.in 

);  
        
        int t,n,k;
        int[] v;
        
        t=scanner.nextInt();
        
        for(int i=0;i<t;i++){
            n=scanner.nextInt();
            k=scanner.nextInt();
            v=new int[n];
            for(int j=0;j<n;j++){
            	v[j]=scanner.nextInt();
            }
            System.out.println(Count(v,k));
        }
  
    }  
  
	public static long Count(int[] v, int k) {
		
		long[] dp = new long[k+1];  
        dp[0] = 1;  
        for (int i = 0; i < v.length; i++) {  
            for (int j = v[i]; j <= k; j++) {  
                dp[j] = (dp[j] + dp[j - v[i]])%100000007;  
            }  
        } 
		
		return dp[k]%100000007;
	}
}