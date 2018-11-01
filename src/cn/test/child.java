package cn.test;
import java.util.Scanner;
public class child{

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in 

	);
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
 
			int tmax=0;
			int max=0;
			
			int[] dp = new int[n];
			int[] loc = new int[n];
			dp[0] = 1;
			loc[0] = 0;
			for(int i=1; i<a.length; i++) {
				
				dp[i] = 1;
				loc[i] = i;
				for(int j = 0;j < i;j++) {
					if(a[i] > a[j] && dp[j] + 1 > dp[i]) {
						dp[i] = dp[j] + 1; 
						loc[i] = loc[j];

						if(max < dp[i]) {
							max = dp[i];
							tmax = loc[j];
							
						}
					}
				}
			}
			
			
			
			System.out.println((tmax+1)+" "+(max));	
		}
	}

