package CYK;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 亮亮解出了卷轴隐藏的秘密，来到了一片沼泽地。这里有很多空地，而面试直通卡可能埋在任意一块空地中，好在亮亮发现了一堆木材，他可以将木材铺在两个空地之间的沼泽地上。
 * 因为亮亮不知道面试直通卡具体在哪一块空地中，所以必须要保证任意一块空地对于亮亮来说是可以抵达的。 “怎么还有鳄鱼！没办法，看来有些空地不能直接到达了。” 
 * 亮亮虽然没有洁癖，但是沼泽地实在太臭了，所以亮亮不会循环利用木材。而且木材不能拼接在一起使用，所以亮亮必须要知道在耗费木材最少的情况下，最长的那根木材至少需要多长
 */
public class Test40 {

	//并查集实现最小生成树
	private static class Edge {
		int x,y;
		int weight;
		
		public Edge(int x,int y,int weight) {
			// TODO Auto-generated constructor stub
			this.x = x;
			this.y = y;
			this.weight = weight;
		}
	}
	
	public static int fagther(int i,int[] a) {
		int k = i;
		while (a[k] != k) {
			k = a[k];
		}
		return k;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int m = in.nextInt();
			
			Edge[] edges = new Edge[m];
			
			for(int i = 0;i < m;i++) {
				edges[i] = new Edge(in.nextInt(), in.nextInt(), in.nextInt());
			}
			
			int a[] = new int[n + 1];
			
			for(int j = 0;j <= n;j++) {
				a[j] = j;
			}
			
			Arrays.sort(edges,new Comparator<Edge>() {

				@Override
				public int compare(Edge o1, Edge o2) {
					// TODO Auto-generated method stub
					return o1.weight - o2.weight;
				}
			});
			
			int res = 0;
			
			for(int i = 0;i < m;i++) {
				int px = fagther(edges[i].x, a);
				int py = fagther(edges[i].y, a);
				
				if(px != py) {
					if(edges[i].weight > res) res = edges[i].weight;
					
					if(px > py) a[px] = py;
					else {
						a[py] = px;
					}
					
				}
			}
		}
	}
}
