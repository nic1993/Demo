package CYK;

import java.util.Scanner;

public class Test30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		
		char[] chs = string.toCharArray();
		char[] re = new char[chs.length];
		
		char[] newOne1 = new char[chs.length + 1];
		char[] newOne2 = new char[chs.length + 1];
		
		String res = String.valueOf(re);
		
		for(int i = 0;i < chs.length;i++) {
			re[i] = chs[chs.length - i - 1];
		}
		
		for(int j = 0;j < chs.length;j++) {
			if(chs[j] != re[j]) {
				if(j == 0) {
					res = String.valueOf(chs[j]) + res;
					string += String.valueOf(chs[j]);
				}else {
					newOne1 = insert(chs[j], newOne2, re, j);
					newOne2 = insert(chs[j], newOne2, chs, chs.length - j - 1);
				}
				
			}
		}
	}
	
	private static char[] insert(char insertValue,char[] newone,char[] oldone,int j) {
		for(int i = 0;i < newone.length;i++) {
			if(i < j) {
				newone[i] = oldone[i];
			}
			else if (i == j) {
				newone[i] = insertValue;
			}else {
				newone[i] = oldone[i - 1];
			}
		}
		
		return newone;
	}
}
