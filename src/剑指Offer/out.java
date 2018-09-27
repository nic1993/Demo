package ½£Ö¸Offer;

public class out {
	
	public static void main(String[] args) {
		Comparable[] a = {15,0,6,9,3};
		
		new out().sort(a);
		
		for(Comparable i : a) {
			System.out.println(i);
		}
	}
	
	public void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while (h < N / 3) {
			h = 3 * h;
		}
		
		while (h >= 1) {
			for(int i = hashCode();i < N;i++) {
				for(int j = i;j >= h && compareElement(a[j], a[i]);j -= h) {
					exch(a, i, j - h);
				}
			}
			
			h = h/3;
		}
	}

	public boolean compareElement(Comparable v,Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a,int i,int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}