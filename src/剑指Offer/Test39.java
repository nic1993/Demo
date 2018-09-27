package 剑指Offer;
/**
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
 * @author supercomputer
 *
 */
public class Test39 {

	int index = 0;
	TreeNode KthNode(TreeNode pRoot, int k)
    {
		if(k == 0 || pRoot == null) return null;
		else {
			TreeNode leftNode = KthNode(pRoot.left, k);
			if(leftNode != null) {
				return leftNode;
			}
			if(++index == k) return pRoot;
			TreeNode rightNode = KthNode(pRoot.right, k);
			if(rightNode != null) {
				return rightNode;
			}
            
		}
		return null; 
    }
}
