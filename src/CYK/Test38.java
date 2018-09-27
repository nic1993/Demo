package CYK;

import java.util.List;

public class Test38 {
    
	public void dfs(int[][] route,int cur,int num,int N,int M,int[] girls) {
		if( cur == N) {
			return;
		}
		else {
			for(int i = 1;i < N;i++) {
				if(i == cur) {
					for(int j = cur + 1,count = 1;count < route[cur].length;count++) {
						if(route[cur][j] == 1) {
							num += girls[j];
							dfs(route, cur, num, count, M, girls);
							num -= girls[j];
						}
					}
				}
			}
		}
		
	}
	
	
	/**
	 * 
	 * @param route 到达站点的女孩
	 * @param s 起始点
	 * @param n 终点
	 * @param girl1 起始女孩
	 */
	public void dijkstra(int[][] route,int s,int n,int girl1) {
		int[] dist = new int[n + 1];
		boolean[] isVisited=new boolean[n+1];
		
		for(int i = 2;i <= n;i++) {
			dist[i] = route[s][i]; 
		}
		
		dist[s] = girl1;
		isVisited[s] = true;
		
		for(int i = 2;i < n;i++) {
			int mindist = Integer.MAX_VALUE;
			int v = 1;
			for(int j = 1;j <= n;j++) {
				if(!isVisited[j] && dist[j] < mindist) {
					mindist = dist[j];
					v = j;
				}
			}
			
			isVisited[v]=true;
			 
			for(int j = 1;j <= n;j++) {
				if(!isVisited[j] && route[v][j] < Integer.MAX_VALUE) {
					int temp = dist[v] + route[v][j];
					dist[j] = dist[j] < temp? dist[j] : temp;
				}
			}
		}
	}
	
	public void dijkstra2(int[][] route,List<Range> ranges, int N,int M) {
		int[] dist = new int[N + 1];
		boolean[] isVisited=new boolean[N+1];
		
		dist[1] = 1;
		isVisited[1] = true;
		
		int k = 0;
		for(int i = 2;i < N;i++) {
			int minValue = Integer.MAX_VALUE;
			for(int j = 1;j <= N;j++) {
				if(j!=1 && !isVisited[j] && route[1][j]<minValue){  
                    k=j;  
                    minValue=route[1][j];  
                } 
			}
		}
		
		isVisited[k] = true;
		
		for(int j = 1;j <= N;j++) {
			if(!isVisited[j] && route[k][j] != Integer.MAX_VALUE) {
				int min;
				int fromDay = -1;
				int toDay = -1;
				
				 for(int m=0;m<ranges.size();m++){  
                     if(ranges.get(m).P==k  && ranges.get(m).Q==j){  
                         fromDay=ranges.get(m).X;  
                         toDay=ranges.get(m).Y;  
                         break;  
                     }  
                 }
				 
				 if(fromDay == -1) continue;
				 
				 
				 if((route[1][k] >= fromDay && route[1][k] <= toDay) || (route[1][k] + route[k][j] >= fromDay && route[k][j] <= fromDay)) {
					 min=toDay+route[k][j];
				 }else {
					min = route[1][k] + route[k][j];
				}
				 
				 if(min < route[1][j]) {
					 route[1][j] = min;
				 }
			}
		}
	}
	
	boolean allow(int start1, int end1, int start2, int end2) {
		if(end1 < start2 || end2 < start1) {
			return true;
		}
		else {
			 return false;
		}
	}
	
	class Range{  
	    int P,Q,X,Y;  
	    Range(int p,int q,int x,int y){  
	        this.P=p;  
	        this.Q=q;  
	        this.X=x;  
	        this.Y=y;  
	    }  
	} 
	
}
