package CYK;
/*
 * ��������10���ˣ�һ�ֶ������ƣ�һ�ֲ�������ô��֪������int32����m��n�Ķ����Ʊ��ж��ٸ�λ(bit)��ͬô��
 */
public class Test12 {

	public static void main(String[] args) {
		System.out.println(new Test12().countBitDiff(1999, 2299));
	}
	public int countBitDiff(int m, int n) {
			 int dif=m^n;
			 System.out.println(dif);
			 int cnt=0;
			 //ͳ��һ���������������ж��ٸ�1
			 while(dif!=0){
				 dif=dif&(dif-1);
				 cnt++;
				 }
			 return cnt;
    }
}
