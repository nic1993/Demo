package ½£Ö¸Offer;

import java.util.ArrayList;

public class Test14 {
	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,5,3,1,2};
//		System.out.println(IsPopOrder(pushA, popA));
	}

	public  boolean IsPopOrder(int [] pushA,int [] popA) {
		ArrayList<Integer> list = new ArrayList<>();
	      int pre = remove(pushA, popA[0]);
	      if(pre == -1) return false;
	      list.add(pre);
	      for(int i = 1;i < popA.length;i++) {
	    	  int next = remove(pushA, popA[i]);
	    	  if(next < pre && (pre - next) > 1) {
	    		for(int j = pre - 1;j > next;j--) {
	    			if(!list.contains(j)) return false;
	    		}  
	    	  } 
	    	  pre = next;
	    	  list.add(pre);
	      }
		return true;
    }
	
	public  int remove(int [] pushA,int A) {
		for(int i = 0;i < pushA.length;i++) {
			if(pushA[i] == A) {
				return i;
			}
		}
		
		return -1;
	}
}
