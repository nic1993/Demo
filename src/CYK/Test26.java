package CYK;
/*
 * ss请cc来家里钓鱼，鱼塘可划分为n＊m的格子，每个格子有不同的概率钓上鱼，cc一直在坐标(x,y)的格子钓鱼，而ss每分钟随机钓一个格子。问t分钟后他们谁至少钓到一条鱼的概率大？为多少？
 */
public class Test26 {
	public static void fish(double[][] rectangle, double cc, int t) {
			double ss = 0;
			for(int i = 0;i < rectangle.length;i++) {
				for(int j = 0;j < rectangle[0].length;j++) {
					ss += rectangle[i][j];
				}
			}
		    ss /= (rectangle.length * rectangle[0].length);
		    
		    if(ss < cc) {
		    	System.out.println("ss");
		    	System.out.println(String.format("%.2f", 1 - Math.pow(1-ss, t)));
		    }
		
	}
}
