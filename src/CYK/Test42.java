package CYK;
/*
 * ��N*M�Ĳݵ���,��Ī����K��Ģ��,Ģ����ը����������,��������óȻȥ��,����Ģ�������ε�.ֻ ��һ�ֽ���ɨ��͸������Ʒ����ɨ������ε�Ģ��,
 * ����������һ��ս��ѧԺ,����2��ɨ��͸��,һ�� ɨ��͸������ɨ���(3*3)���������е�Ģ��,Ȼ�������Ϳ��������һЩ���ε�Ģ��. ��:����������������ٸ�Ģ��?
         ע�⣺ÿ������ɨ��һ��ֻ�������һ��Ģ����
 */
import java.util.Scanner;

public class Test42 {
    
	//���Ģ����������
	public static void Scan(int[][] Mushroom,int N,int M,int[] result) {
		
		for(int i = 0;i < N - 2;i++) {
			for(int j = 0;j < M - 2;j++) {
		        int temp = 0;
		        for(int p = i;p < i + 3;p++) {
		        	for(int q = j;q < j + 3;q++) {
		        		if(Mushroom[p][q] > 0) {
		        			++temp;
		        		}
		        	}
		        }
		        
		        if(result[0] < temp) {
		        	result[0] = temp;
		        	result[1] = i;
		        	result[2] = j;
		        }
			}
		}
	}
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);    
		int N = in.nextInt();
		int M = in.nextInt();
		
		int K = in.nextInt();
		
		int[][] Mushroom = new int[N][M];
		
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < M;j++) {
				Mushroom[i][j] = 0;
			}
		}
		
		
		while (K > 0) {
			Mushroom[in.nextInt()][in.nextInt()] += 1;
		}
		
		int[] result = new int[3];
		
		
	}
}
