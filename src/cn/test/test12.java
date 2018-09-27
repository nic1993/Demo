package cn.test;

public class test12 {

	private static final int  _1MB = 1024 * 1024;
	
	public static void main(String[] args) {
		testAlllocation();
	}
	
	public static void testAlllocation() {
        byte[] allocation1,allocation2,allocation3,allocation4;
       
		allocation1 = new byte[_1MB / 4];
		allocation2 = new byte[3 * _1MB];
		allocation2 = null;
		allocation4 = new byte[4 * _1MB];
//		allocation3 = new byte[4 * _1MB];
		
		
	}
}
