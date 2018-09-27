package 剑指Offer;

import 剑指Offer.Test11.TreeNode;

/**
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * @author supercomputer
 *
 */
public class Test26 {

	boolean isBalanced = true;
    public int TreeDepth(TreeNode root) {
         if(root == null) {
        	 return 0;
         }
         else {
			int left = TreeDepth(root.left) + 1;
			int right = TreeDepth(root.right) + 1;
			if(Math.abs(left - right) > 1) isBalanced = false;
			return left > right? left : right;
		}
    }
    
    public boolean IsBalanced_Solution(TreeNode root) {
        TreeDepth(root);
        return isBalanced;
    }
}
