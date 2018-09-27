package CYK;

import java.util.Scanner;

/*
 *C市现在要转移一批罪犯到D市，C市有n名罪犯，按照入狱时间有顺序，另外每个罪犯有一个罪行值，值越大罪越重。现在为了方便管理，市长决定转移入狱时间连续的c名犯人，同时要求转移犯人的罪行值之和不超过t，问有多少种选择的方式？
 */
public class Test25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt(); //n个人
			int t = in.nextInt(); //罪犯值为t
			int c = in.nextInt(); //连续c值
			int[] a = new int[n]; 
			for(int i = 0;i < n;i++) {
				a[i] = in.nextInt();
			}
			int count = 0;
			int tempt = 0;
			for(int i = 0;i < c;i++) {
				tempt += a[i];
			}
			if(tempt < t) {
				count++;
			}
			for(int i = c;i <n;i++) {
				tempt += a[i] - a[i - c];
				if(tempt < t)
					count++;
			}
			System.out.println(count);
		}
	}
}
