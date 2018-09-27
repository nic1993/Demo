package ½£Ö¸Offer;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test20 {

	public ArrayList<String> Permutation(String str) {
		
	       TreeSet<String> treeSet = new TreeSet<>();
	       
	       ArrayList<String> list = new ArrayList<>();
	       
	       if(str == null || str.length() == 0) return list;
	       
	       sort(str.toCharArray(), 0, str.length() - 1, treeSet);
	       
	       list.addAll(treeSet);
	       
	       return list;
    }
	
	public void sort(char[] chs,int start,int end,TreeSet<String> treeSet) {
		if(start == end) treeSet.add(String.valueOf(chs));
		else {
			for(int i = start;i <= end;i++) {
				swap(chs, start, i);
				sort(chs, start+1, end, treeSet);
				swap(chs, start, i);
			}
		}
	}
	
	
	public void swap(char[] chs,int a,int b) {
		if(a == b) return;
		
		char temp = chs[a];
		chs[a] = chs[b];
		chs[b] = temp;
	}
}
