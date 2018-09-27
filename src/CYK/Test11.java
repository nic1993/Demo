package CYK;

import java.util.Stack;

public class Test11 {

    /**
     * 返回git树上两点的最近分割点
     * 
     * @param matrix 接邻矩阵，表示git树，matrix[i][j] == '1' 当且仅当git树中第i个和第j个节点有连接，节点0为git树的跟节点
     * @param indexA 节点A的index
     * @param indexB 节点B的index
     * @return 整型
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
