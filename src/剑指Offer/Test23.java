package ½£Ö¸Offer;

public class Test23 {
	
	public static void main(String[] args) {
		System.out.println(new Test23().GetUglyNumber_Solution(3));
	}

	public int GetUglyNumber_Solution(int index) {
		if(index == 0) return 0;
		int[] array = new int[index];
		array[0] = 1;
		int t1 = 0,t2 = 0,t3 = 0;
		for(int i = 1;i < index;i++) {
			array[i] = Math.min(array[t1] * 2, Math.min(array[t2] * 3, array[t3] * 5));
			
			if(array[i] == array[t1] * 2) t1++;
			if(array[i] == array[t2] * 3) t2++;
			if(array[i] == array[t3] * 5) t3++;
		}
		
        return array[index - 1];
    }
	
	public boolean judge(int val) {
		if(val == 1) return true;
		else if(val % 2 == 0) {
			val = val/2;
			return judge(val);
		}else if (val % 3 == 0) {
			val = val/3;
			return judge(val);
		}else if (val % 5 == 0) {
			val = val/5;
			return judge(val);
		}else {
			return false;
		}
	}
}
