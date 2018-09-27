package CYK;

import java.util.Scanner;

public class Test3 {

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int N = scanner.nextInt();
//		int dp[] = new int[N];
//		int step[] = new int[N];
//		for(int i = 0;i < N;i++) step[i] = scanner.nextInt();
//		for(int i = 0;i < N;i++) dp[i] = 9999;
//		dp[0] = 0;
//		for(int i = 1;i < N;i++){
//			for(int j = 0;j < i;j++){
//				if(step[j] + j > i){
//					dp[i] = Math.min(dp[i], dp[j] + 1);
//				}
//			}
//		}
//		
//	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int step[] = new int[N];
		for(int i = 0;i < N;i++) step[i] = scanner.nextInt();
		System.out.println(minStep(step));
		
	}
	
	private static int minStep(int[] step) {
		int sum = 0;//×Ü²½Êý
		
		for(int i = 0;i < step.length;){
			if(i == step.length - 1 && step[i] != 0){
				sum++;
				break;
			}
			int maxLen = 0,p = 0;
			for(int j = i + 1;j <= i + step[i];j++){
				int l = j - i + step[j];
				if(l >= maxLen){
					maxLen = l;
					p = j;
				}
			}
			
			if (step[i] == 0 || p == 0) {
                return -1;
            }
			
			i = p;
			++sum;
			if(p + step[p] > step.length - 1){
				++sum;
				break;
			}
		}
		return sum;
	}
}
