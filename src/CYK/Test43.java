package CYK;

public class Test43 {
	
	public class TreeNode {
		       int val = 0;
		        TreeNode left = null;
		        TreeNode right = null;
		 
		        public TreeNode(int val) {
		            this.val = val;
		        }

				public TreeNode getLeft() {
					return left;
				}

				public void setLeft(TreeNode left) {
					this.left = left;
				}

				public TreeNode getRight() {
					return right;
				}

				public void setRight(TreeNode right) {
					this.right = right;
				}
		        
	}
	
	public boolean check(TreeNode A,TreeNode B) {
		StringBuffer bufferA = new StringBuffer();
		un(A, bufferA);
		
		StringBuffer bufferB = new StringBuffer();
		un(B, bufferB);
		
		return bufferA.toString().contains(bufferB.toString());
	}
	
	public void un(TreeNode root,StringBuffer buffer) {
		buffer.append(root.val);
		if(root.left != null) {
			un(root, buffer);
		}else {
			buffer.append("-");
		}
		if(root.right != null) {
			un(root, buffer);
		}else {
			buffer.append("+");
		}
	}
}
