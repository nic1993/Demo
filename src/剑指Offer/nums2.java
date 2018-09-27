package ½£Ö¸Offer;

/**
 * Ð¯³Ì
 * @author supercomputer
 *
 */

 public class nums2 extends nums1{
	public int a = 1;
	
	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		nums1 aBout = new nums2();
		System.out.println(aBout.a);
		aBout.fun();
	}
}
 
 class nums1 {

	public int a = 0;
	
	public void fun() {
		System.out.println("A");
	}
	
}

