package CYK;
/*
 * 世界上有10种人，一种懂二进制，一种不懂。那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？
 */
public class Test12 {

	public static void main(String[] args) {
		System.out.println(new Test12().countBitDiff(1999, 2299));
	}
	public int countBitDiff(int m, int n) {
			 int dif=m^n;
			 System.out.println(dif);
			 int cnt=0;
			 //统计一个整数二进制中有多少个1
			 while(dif!=0){
				 dif=dif&(dif-1);
				 cnt++;
				 }
			 return cnt;
    }
}
