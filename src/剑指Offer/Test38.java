package 剑指Offer;
/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * @author supercomputer
 *
 */
public class Test38 {
	public static void main(String[] args) {
		new Test38().Deserialize("1,2,4,#,#,5,#,#,3,#,#");
	}

	String Serialize(TreeNode root) {
		StringBuffer sb = new StringBuffer();
        if(root == null) {
        	sb.append("#,");
        	return sb.toString();
        }else {
			sb.append(root.val + ",");
			sb.append(Serialize(root.left));
			sb.append(Serialize(root.right));
		}
        return sb.toString();
	}
	int index = 0;
	TreeNode Deserialize(String str) {
	   if(str == "" || str == null) return null;
	   String[] strs = str.split(",");
	   if(strs == null || strs[index].equals("#")) return null;
		TreeNode root = new TreeNode(Integer.valueOf(strs[index]));
		index++;
		root.left = Deserialize(str);
		index++;
		root.right = Deserialize(str);
		return root;
	}
	
}
