package ½£Ö¸Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test15 {
	
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	ArrayList<Integer> list = new ArrayList<>();
    	if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
			TreeNode node = queue.poll();
			list.add(node.val);
			
			if(node.left != null) queue.add(node.left);
			if(node.right != null) queue.add(node.right);
		}
        
        return list;
    }

	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
}
