package cn.test;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int X = scanner.nextInt();
        int[] prices = new int[n];

        for(int i = 0;i < n;i++){
            prices[i] = scanner.nextInt();
        }
        int minPrice = findMinPrice(prices,X);
        System.out.println(minPrice);
    }

    public static int findMinPrice(int[] prices, int X){
        int minPrice = 0;
        int M = X+100;
        int dp[] = new int[M+1];
        for (int i = 0; i < prices.length; ++i) {
            for (int j = M; j >= prices[i]; --j) {
                int tmp = dp[j - prices[i]] + prices[i];
                if (tmp > dp[j]) {
                    dp[j] = tmp;
                }
            }
        }
        for(int k = X; k < dp.length; k++) {
            if(dp[k]>=X) {
                minPrice = dp[k];
                break;
            }
        }
        return minPrice;
    }
}
