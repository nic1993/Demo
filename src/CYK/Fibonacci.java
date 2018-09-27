package CYK;

public class Fibonacci {
    public static int[][] mul(int[][] x, int[][] y) {
        int[][] res = new int[2][2];//res���ڴ洢x�����y����ĳ˻�
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    res[i][j] += x[i][k] * y[k][j];
                    res[i][j] %= 1000007;//��ɾ���x��y�����
                }
        return res;
    }

    public static int pow(int n) {
        int[][] c = new int[2][2];
        int[][] res = new int[2][2];
        c[0][0] = 1;//�����ʼ��
        c[0][1] = 1;
        c[1][0] = 1;
        c[1][1] = 0;
        for (int i = 0; i < 2; i++)
            res[i][i] = 1;// ��λ����
        while (n != 0) {
            if ((n & 1) != 0)
                res = mul(res, c);//�������
            c = mul(c, c);
            n = n >> 1;
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println(); 

        }
        return res[0][0];
    }	

    public static void main(String[] args) {
//        pow(3);
        //System.out.println(pow(3));
        System.out.println(hash("11"));
        
    }

    
    static int hash(Object key) {
        int h;
        h = key.hashCode();
        System.out.println(h + "   " + Integer.toBinaryString(h >>> 16));
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}