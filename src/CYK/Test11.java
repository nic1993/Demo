package CYK;

import java.util.Stack;

public class Test11 {

    /**
     * ����git�������������ָ��
     * 
     * @param matrix ���ھ��󣬱�ʾgit����matrix[i][j] == '1' ���ҽ���git���е�i���͵�j���ڵ������ӣ��ڵ�0Ϊgit���ĸ��ڵ�
     * @param indexA �ڵ�A��index
     * @param indexB �ڵ�B��index
     * @return ����
     */
    public int getSplitNode(String[] matrix, int indexA, int indexB) {
    	int n = matrix[0].length();
        String[][] matrixs = new String[n][n];
    	for(int i = 0;i < matrix.length;i++){
    		char[] chs = matrix[i].toCharArray();
    		for(int j = 0;j < matrix[i].length();j++){
    			matrixs[i][j] = String.valueOf(chs[j]);
    		}
    	}
    	
    	return 0;
    }
    boolean dfs(String[][] matrixs,Stack<Integer> path,int n,int x,int index,int length){
    	if(matrixs[x][index] == "1"){
    		path.push(index);
    		return true;
    	}else {
		   for(int i = 0;i < length;i++){
			   if(i == n) continue;
			   if(matrixs[x][i] == "1"){
				   if(dfs(matrixs, path, x, i, index, length))
					   path.push(x);
				   }
			   }
		   }
    	return false;
		}
    
}
