package ½£Ö¸Offer;

public class test44 {

	public static void main(String[] args) {
		int[] sequence = {1,2,3,4,5,6};
		
		System.out.println(VerifySquenceOfBST(sequence));
	}
	
	
	 public static boolean judge(int[] sequence,int start,int end) {
		 if(start >= end) return true;
		 int root = sequence[end];
		 int i;
		 for(i = start;i < end;i++) {
			 if(sequence[i] > root) break; 
		 }
		 
		 for(int j = i;j < end;j++) {
			 if(sequence[j] < root) return false;
		 }
		 
		 
		 return judge(sequence, start, i - 1) && judge(sequence, i, end - 1);
	 }
	
	 public static boolean VerifySquenceOfBST(int [] sequence) {
	        if(sequence.length == 0) return false;
		   
		 return judge(sequence, 0, sequence.length - 1);
	 }
}
