package CYK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] prices = new int[1000];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		while (in.hasNext()) {
			int start = in.nextInt();
			int end = in.nextInt();
			int price = in.nextInt();
			
			for(int i = start;i <= end;i++){
				prices[i] = price;
			}
			if(start < min)
				min = start;
			if(end > max)
				max = end;
		}
		
		System.out.print("[" + min + ", ");
		for(int i = min + 1,pre = prices[min]; i < max;i++)
		{
			int cur = prices[i];
			
			if(cur != pre){
				if(pre != 0){
					System.out.print(i - 1 + ", " + pre + "],");
				}
				if(cur != 0){
					System.out.print("[" + i + ", ");
				}
				
			}
			pre = cur;
		}
		System.out.println(max + "," + prices[max] + "]");
	}
}
