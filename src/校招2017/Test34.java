package пёуп2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.InputMap;

public class Test34 {
	
	static ArrayList<List<Integer>> res = new ArrayList<>();
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		getNum(m, n, 1);
		
		for(List<Integer> l : res) {
			int i = 0;
			for(; i < l.size() - 1; i++) {
			System.out.print(l.get(i) + " ");
            }
			System.out.println(l.get(i));
		}
	  	
	}
	
	public static void getNum(int m,int n,int begin) {
		if(m == 0) {
			res.add(new ArrayList<>(list));
		}	
		else {
			for(int i = begin;i <= n && i <= m;i++)
			{
				list.add(i);
		        getNum(m-i, n, begin+i);	
		        list.remove(list.size() - 1);
			}
		}
	}
}
