package ��ָOffer;
/**
 * ����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣���磬 5 / \ 3 7 /\ /\ 2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4��
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
