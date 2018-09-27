package 剑指Offer;

import 剑指Offer.Test11.TreeNode;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * @author supercomputer
 *
 */
public class Test12 {
	
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(0);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		
		root1.left = node1;
		root1.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		Mirror(root1);
	}

    public static void Mirror(TreeNode root) {
    	if(root == null) return;
        exchange(root);
    }
    
    public static void exchange(TreeNode root) {
    	
    	if(root.left != null) exchange(root.left);
    	
    	if(root.right != null) exchange(root.right);
    	
    	TreeNode left = root.left;
    	TreeNode right = root.right;
    	
    	root.left = right;
    	root.right = left;
    }
	
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
}
