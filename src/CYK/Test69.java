package CYK;

public class Test69 {
	public static void main(String[] args){
        Object o=new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }

	private static void getNum(int n) {
		int[] A = new int[n];
		A[0] = 0;
		for(int i = 1;i < n;i++) {
			if(String.valueOf(i).contains("1")) {
				A[i] = A[i-1] + 1;
			}else {
				A[i] = A[i-1];
			}
		}
	}
}
