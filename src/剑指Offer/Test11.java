package ½£Ö¸Offer;

public class Test11 {
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(8);
		TreeNode node1 = new TreeNode(8);
		TreeNode node2 = new TreeNode(7);
		TreeNode node3 = new TreeNode(9);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(7);
		
		root1.left = node1;
		root1.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node3.left = node5;
		node3.right = node6;
		
		TreeNode root2 = new TreeNode(8);
		root2.left = new TreeNode(9);
		root2.right = new TreeNode(2);
		
		System.out.println(HasSubtree(root1, root2));
	}

	static boolean isSubTree(TreeNode root1,TreeNode root2) {
		if(root2 == null) return true;
		if(root1 == null) return false;
		if(root1.val == root2.val) {
			return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
		}else {
			return false;
		}
	}
	
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	if(root1 == null || root2 == null) return false;
    	
    	boolean bool1 = isSubTree(root1, root2);
    	boolean bool2 = isSubTree(root1.left, root2);
    	boolean bool3 = isSubTree(root1.right, root2);
    	
        return bool1 || bool2 || bool3;
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
