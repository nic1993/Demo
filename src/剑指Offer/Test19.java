package ½£Ö¸Offer;

import java.util.Stack;

public class Test19 {
	
    public TreeNode Convert(TreeNode pRootOfTree) {
        
    	if(pRootOfTree == null) return null;
    	
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode p = pRootOfTree;
    	TreeNode pre = null;
    	boolean first = true;
    	while (p != null || !stack.isEmpty()) {
			while (p != null) {
				stack.push(p);
				p = p.left;
			}
			p = stack.pop();
			if(first) {
				pRootOfTree = p;
				pre = p;
				first = false;
			}else {
				pre.right = p;
				p.left = pre;
				pre = p;
			}
			p = p.right;
		}
    	
    	return pRootOfTree;
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
