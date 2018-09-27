package CYK;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * ��������˾������ص����ܣ�������һƬ����ء������кܶ�յأ�������ֱͨ��������������һ��յ��У���������������һ��ľ�ģ������Խ�ľ�����������յ�֮���������ϡ�
 * ��Ϊ������֪������ֱͨ����������һ��յ��У����Ա���Ҫ��֤����һ��յض���������˵�ǿ��Եִ�ġ� ����ô�������㣡û�취��������Щ�յز���ֱ�ӵ����ˡ��� 
 * ������Ȼû�н�񱣬���������ʵ��̫���ˣ�������������ѭ������ľ�ġ�����ľ�Ĳ���ƴ����һ��ʹ�ã�������������Ҫ֪���ںķ�ľ�����ٵ�����£�����Ǹ�ľ��������Ҫ�೤
 */
public class Test40 {

	//���鼯ʵ����С������
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
