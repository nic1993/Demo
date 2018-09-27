package CYK;

public class Test36 {

	 public int[] arrayPrint(int[][] arr, int n) {
	        // write code here
			for(int j = n - 1;j > 0;j++) {
				int x = 0;
				int y = j;
				System.out.print(arr[x][y]);
				while(y + 1 < n && x < n) {
					x++;
					y++;
					System.out.print(arr[x][y]);
				}
			}
			
			for(int j = 1;j < n;j++) {
				int y = 0;
				int x = j;
				System.out.print(arr[x][y]);
				while (x + 1 < n && y < n) {
					x++;
					y++;
					System.out.print(arr[x][y]);
				}
			}
			return null;

	 }
}
