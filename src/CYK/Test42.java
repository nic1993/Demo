package CYK;
/*
 * 在N*M的草地上,提莫种了K个蘑菇,蘑菇爆炸的威力极大,兰博不想贸然去闯,而且蘑菇是隐形的.只 有一种叫做扫描透镜的物品可以扫描出隐形的蘑菇,
 * 于是他回了一趟战争学院,买了2个扫描透镜,一个 扫描透镜可以扫描出(3*3)方格中所有的蘑菇,然后兰博就可以清理掉一些隐形的蘑菇. 问:兰博最多可以清理多少个蘑菇?
         注意：每个方格被扫描一次只能清除掉一个蘑菇。
 */
import java.util.Scanner;

public class Test42 {
    
	//获得蘑菇最多的区域
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
