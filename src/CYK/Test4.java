package CYK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 现在有一棵合法的二叉树，树的节点都是用数字表示，现在给定这棵树上所有的父子关系，求这棵树的高度
 * @author supercomputer
 *
 */
public class Test4 {

	static int height = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[][] pairs = new int[1000][1000];
		List<Integer> lists = new ArrayList<Integer>();
		for(int i = 0;i < 1000;i++)
			for(int j = 0;j < 1000;j++){
				pairs[i][j] = 0;
			}
		for(int i = 0;i < num;i++){
			int father = scanner.nextInt();
			int son = scanner.nextInt();
			pairs[father][son] = 1;
			lists.add(father);
		}
		
		//获取根节点
		int father = 0;
		for(Integer value : lists){
			boolean isRoot = true;
			for(int i = 0;i < 1000;i++){
				if(pairs[i][father] == 1){
					isRoot = false;
				}
			}
			if(isRoot == true){
				father = value;
				break;
			}
		}
		
		getDep(father, pairs, 2);
		System.out.println(height);
	}
	
	public static void getDep(int root,int[][] pairs,int depth){
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i < pairs.length;i++){
			if(pairs[root][i] == 1){
				list.add(i);
			}
		}
		if(list.size() == 0){
			height = height > depth?height:depth;
			return;
		}
		for(int son : list){
			depth++;
			getDep(son, pairs, depth);
			depth--;
		}
	}
}
