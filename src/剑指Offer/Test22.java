package ½£Ö¸Offer;

public class Test22 {
	long max;
	
	
	
	public String PrintMinNumber(int [] numbers) {
		String str = "";
		if(numbers == null || numbers.length == 0) return str;
		
		for(int val : numbers) {
			str += String.valueOf(val);
		}
		max = Long.valueOf(str);
		getMax(numbers, 0, numbers.length - 1);
		return String.valueOf(max);
    }
	public void getMax(int [] numbers,int start,int end) {
		if(start == end) {
			String str = "";
			for(int val : numbers) {
				str += String.valueOf(val);
			}
			max = max < Long.valueOf(str) ? max : Long.valueOf(str);		
		}else {
			for(int i = start;i <= end;i++) {
				swap(numbers, start, i);
				getMax(numbers, start + 1, end);
				swap(numbers, start, i);
			}
		}
	}
	
	public void swap(int [] numbers,int x,int y) {
		if(x == y) return;
		int temp = numbers[x];
		numbers[x] = numbers[y];
		numbers[y] = temp;
	}
	
	public static void main(String[] args) {
		int [] numbers = {3334,3,3333332};
		System.out.println(new Test22().PrintMinNumber(numbers));
	}
}
