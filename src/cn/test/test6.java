package cn.test;

import java.util.LinkedList;
import java.util.Queue;

import CYK.Test43.TreeNode;

public class test6 {
    
	boolean IsComplateTree(TreeNode root) {
		if(root == null) return true;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		boolean tag = true;
		while (queue.isEmpty()) {
			TreeNode node = queue.poll();
			if(node.getLeft() != null) {
				if(tag == false) return false;
				queue.offer(node.getLeft());
			}else {
				tag = false;
			}
			
			if(node.getRight() != null) {
				if(tag == false) return false;
				queue.offer(node.getRight());
			}else {
				tag = false;
			}
			
		}
		return true;
	}
}
