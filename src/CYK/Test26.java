package CYK;
/*
 * ss��cc��������㣬�����ɻ���Ϊn��m�ĸ��ӣ�ÿ�������в�ͬ�ĸ��ʵ����㣬ccһֱ������(x,y)�ĸ��ӵ��㣬��ssÿ���������һ�����ӡ���t���Ӻ�����˭���ٵ���һ����ĸ��ʴ�Ϊ���٣�
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
