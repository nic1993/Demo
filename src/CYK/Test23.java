package CYK;

import java.util.ArrayList;
import java.util.List;

public class Test23 {
	public static void main(String[] args) {
		Test23 test23 = new Test23();
		int[] A = {2,7,9,4,1};
		System.out.println(test23.countArea(A, 5));
	}
    public int countArea(int[] A, int n) {
        // write code here
    	int SMax = 0;
    	List<int[]> list = new ArrayList<>();
    	list.add(A);
    	while (list.size() != 0) {
    		int length = list.size() - 1;
    	    int[] args = list.remove(length);
    	    List<Integer> lists = isZero(args);
    	    if(lists.isEmpty()){
    	    	int min = getMin(args);
        	    int area = min * (args.length);
        	    if(SMax < area) SMax = area;
        	    for(int i = 0;i < args.length;i++){
        	    	args[i] -= 1;
        	    }
        	    list.add(args);
    	    }else {
    	    	int fir = lists.get(0);
    	    	if(fir == 0){
    	    		for(int i = 1;i < lists.size();i++){
    	    			int index1 = lists.get(i - 1);
    					int index2 = lists.get(i);
    					int[] split = new int[index2 - index1 - 1];
    					for(int j = index1 + 1;j < index2;j++){
    						split[j] = args[j];
    					}
    					list.add(split);
    				}
    	    	}else {
    	    		int[] firs = new int[fir];
    	    		for(int i = 0;i < fir;i++){
    	    			firs[i] = args[i];
    	    		}
    	    		list.add(firs);
    	    		for(int i = 1;i < lists.size();i++){
    					int index1 = lists.get(i - 1);
    					int index2 = lists.get(i);
    					int[] split = new int[index2 - index1 - 1];
    					for(int j = index1 + 1;j < index2;j++){
    						split[j] = args[j];
    					}
    					list.add(split);
    				}
				}
			}  
		}
    	return SMax;
    }
    public List<Integer> isZero(int[] A){
    	List<Integer> list = new ArrayList<>();
    	for(int i = 0;i < A.length;i++){
    		if(A[i] == 0){
    			list.add(i);
    		}
    	}
    	return list;
    	
    }
    
    public int getMin(int[] A){
    	int min = A[0];
    	for(int i = 1;i < A.length;i++){
    		if(A[i] < min){
    			min = A[i];
    		}
    	}
    	return min;
    }
    
    public int countAreaMax(int[] A, int n) {
    	int left,right;
    	int max = 0;
    	int area = 0;
    	//计算包含A【i】的最大面积
    	for(int i = 0;i < n;i++){
    		left = 0;
    		right = 0;
    		
    		//向右移动
    		for(int j = i;j < n;j++){
    			if(A[i] < A[j]) right++;
    			else {
					break;
				}
    		}
    		
    		//向左移动
    		for(int j = i-1;j > 0;j--){
    			if(A[i] < A[j]) left++;
    			else {
					break;
				}
    		}

    		max = (left + right) * A[i];
    		if(area > max) max = area;
    	}

    	return max;	
    }
}
