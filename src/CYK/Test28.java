package CYK;
/*
 * 给定一个递增序列，a1 <a2 <...<an 。定义这个序列的最大间隔为d=max{ai+1 - ai }(1≤i<n),现在要从a2 ,a3 ..an-1 中删除一个元素。问剩余序列的最大间隔最小是多少？
 */
import java.util.Scanner;

public class Test28 {

	int x= 1;
	int y;
	public static void main(String[] args) {
		int z = 2;
		Test28 t = new Test28();
		System.out.print(t.y);
		
		
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n;i++) {
			a[i] = in.nextInt();
		}
		int min = 999;
		int max = 0;
		
		for(int i = 1;i < n;i++) {
			max = Math.max(max, a[i] - a[i-1]);
		}
		
		for(int i = 1;i < n - 1;i++) {
			min = Math.min(min, a[i+1] - a[i-1]);
		}
	}
}
