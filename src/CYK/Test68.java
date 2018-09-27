package CYK;

public class Test68 {
    public static void main(String[] args) {
		rotateString("ABCDEFGH",8,4);
	}
	
	public static String rotateString(String A, int n, int p) {
        // write code here
		
		String B = "";
		
		B += A.substring(p+1, n);
		B += A.substring(0, p);
		B += A.charAt(p);
		
		return B;
    }
}
