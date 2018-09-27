package cn.test;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int M = scanner.nextInt();
		
		String[] strs = new String[N];
		for(int i = 0;i < strs.length;i++) {
			strs[i] = "";
		}
		
		for(int i = 0;i < M;i++) {
			String vote = scanner.next();

			char[] votes = vote.toCharArray();
			
			for(int j = 0;j < N;j++) {
				strs[j] += String.valueOf(votes[j]);
			}
		}
		
		int[] votes = new int[N];
		
		for(int i = 0;i < N;i++) {
			
		}
		
		
	}
	
}
