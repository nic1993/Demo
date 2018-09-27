	package Ð£ÕÐ2017;
	
	import java.util.Collection;
	import java.util.Collections;
	import java.util.Scanner;
	
	public class Test11 {
	
		public static void main(String[] args) {
			
			 Scanner scanner = new Scanner(System.in);
			 
			 while (scanner.hasNext()) {
				 int n = scanner.nextInt();
				 String[] strs = new String[n];
				 
				 for(int i = 0;i < n;i++) {
					 strs[i] = scanner.next();
				 }
				 
				 //ÅÐ¶Ï³¤¶È
				 boolean flagOfLength = true;
				 for(int i = 1;i < n;i++) {
					 if(strs[i].length() < strs[i - 1].length()) {
						 flagOfLength = false;
					 }
				 }
				 
				 boolean flagOfLexicographic = true;
				 boolean flagOfch = false;
				 //×ÖµäÐò
				 for(int i = 1;i < n;i++) {
					 char[] chs0 = strs[i - 1].toCharArray();
					 char[] chs1 = strs[i].toCharArray();
					 
					 for(int l = 0,m = 0;l < chs0.length && m < chs1.length;l++,m++) {
						 if(chs0[l] < chs1[m]) {
							 flagOfch = true;
							 break;
						 }
						 else if(chs0[l] > chs1[m]) {
							 flagOfLexicographic = false;
							 break;
						 }
					 }
					 if (chs0.length > chs1.length && !flagOfch) {
							flagOfLexicographic = false;
						}
					 if(!flagOfLexicographic) break;
				 }
				 
				 if(flagOfLength && flagOfLexicographic) {
					 System.out.println("both");
				 }else if (flagOfLength) {
					System.out.println("lengths");
				}else if(flagOfLexicographic){
					System.out.println("lexicographically");
				}else {
					System.out.println("none");
				}
			}
			 
		}
	}
