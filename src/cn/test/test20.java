package cn.test;

import CYK.Test43.TreeNode;

public class test20 {

	 static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
	
	public static void main(String[] args) {

		System.out.println(Math.ceil( 3/2));
	}
	
	
	public static void mirror(TreeNode treeNode) {
		
		if(treeNode == null) return;
		
		if(treeNode.getLeft() == null && treeNode.getRight() == null) return;
		
		TreeNode left = treeNode.getLeft();
		treeNode.setLeft(treeNode.getRight());
		treeNode.setRight(left);
		
		mirror(treeNode.getLeft());
		mirror(treeNode.getRight());
		
		
	}
}
