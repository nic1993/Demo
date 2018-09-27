package CYK;

public class Test70 {
	public static void main(String[] args) {
		int[][] array = {{}};
		System.out.println(Find(16, array));
	}

	public static boolean Find(int target, int [][] array) {
		
       int n = array.length;
       int m = array[0].length;
       if(n==0 || m == 0) return false;
       
       int i = n - 1;
       int j = 0;
	   int fir = array[i][j];  //×óÏÂ½Ç
	   while (i > 1 && j < m - 1) {
		if(fir < target) {
			j++;
			fir = array[i][j];
			if(fir == target) return true;
		}else if (fir > target) {
			i--;
			System.out.println(i);
			fir = array[i][j];
			if(fir == target) return true;
		}else {
			return true;
		}
	}
	   return false;
    }
}
