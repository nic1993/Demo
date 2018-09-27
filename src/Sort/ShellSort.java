package Sort;

public class ShellSort {

	public static void sort(int[] arr) {
		for(int gap = arr.length/2;gap > 0;gap /= 2) {
			for(int i = gap;i < arr.length;i++) {
				int j = gap;
				while (j - gap >= 0 && arr[j] < arr[j - gap]) {
					int temp = arr[j - gap];
					arr[j - gap] = arr[j];
					arr[j] = temp;	
				}
			}
		}
	}
}
