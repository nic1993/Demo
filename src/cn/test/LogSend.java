package cn.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LogSend {

	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] prices = new int[n];
		for(int i = 0;i < n;i++) {
			prices[i] = scanner.nextInt();
		}
		
		int result = 0;
        int tmp = 0;
        for (int i = 1; i < prices.length; i++) {
            tmp = prices[i] - prices[i - 1];
            if (tmp > 0)
                result += tmp;
        }
        
        System.out.println(result);
	}
}

