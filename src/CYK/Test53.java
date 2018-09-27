package CYK;
/*
 * 有一个整型数组A，代表数值不同的纸牌排成一条线。玩家a和玩家b依次拿走每张纸牌，规定玩家a先拿，玩家B后拿，但是每个玩家每次只能拿走最左或最右的纸牌，玩家a和玩家b都绝顶聪明，他们总会采用最优策略。请返回最后获胜者的分数。
给定纸牌序列A及序列的大小n，请返回最后分数较高者得分数(相同则返回任意一个分数)。保证A中的元素均小于等于1000。且A的大小小于等于300。
 */
public class Test53 {
	public static void main(String[] args) {
		
		
		
		int[] A = {1,2,100,4};
		cardGame(A, 4);
	}

	public static int cardGame(int[] A, int n) {
        // write code here
		int scoreA = getMax(A, 0, n-1);
		int scoreB = getMin(A, 0, n-1);
		System.out.println("scoreA: " + scoreA + "  scoreB: " + scoreB);
		return 0;
    }
	public static int getMax(int[] A,int l,int r) {
		if(l == r)
		{
			return A[l];
		}else {
			return Math.max(getMin(A, l+1, r)+A[l], getMin(A, l, r-1)+A[r]);
		}
	}
	
	public static int getMin(int[] A,int l,int r) {
		if(l == r) {
			return 0;
		}else {
			return Math.min(getMax(A, l+1, r),getMax(A, l, r-1));
		}
	}
}
