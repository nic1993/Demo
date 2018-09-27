package cn.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 阿里测评
 * @author supercomputer
 *
 */
public class test9 {
	
	/** 请完成下面这个函数，实现题目要求的功能 **/
	 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
	    static int calculate(String[] locations) {
	    	int node = locations.length;
	    	int[] data = new int[node];
	    	for(int i=0;i<node;i++){
	    		data[i]=i;
	    	}
	    	ArrayList<String>res = new ArrayList<>();

	    	permutationHelper(data, 0, res);
	    	
	    	int min = caculate(res, locations);
	    	
	    	return min;
	    	
	    }

	    public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);
	        int num = Integer.parseInt(scanner.nextLine().trim());
	        int index = 0;
	        String[] locations = new String[num];
	        while(num-- > 0){
	            locations[index++] = scanner.nextLine();
	        }

	        System.out.println(calculate(locations));  
	    }
	    
	    
	    private static void permutationHelper(int[] charArray, int i, ArrayList<String> result) {
			if(i==charArray.length-1){
				StringBuilder sb = new StringBuilder();
				for(int j=0;j<charArray.length;j++){
					sb.append(charArray[j]);
				}
				String string = sb.toString();
				if(!result.contains(string)){
					result.add(string);
				}
			}
				else{
					for(int j=i;j<charArray.length;j++){
						swap(charArray,i,j);
						permutationHelper(charArray, i+1, result);
						//回溯
						swap(charArray, i, j);
					}
				}
			
		}
	    
		private static void swap(int[] charArray, int i, int j) {
			int tem = charArray[i];
			charArray[i]=charArray[j];
			charArray[j]=tem;
		}
		
		private static int caculate(ArrayList<String> res,String[] locations){
			int min = Integer.MAX_VALUE;
			int[][] loc = getLocations(locations);
			for(String str : res) {
				char[] chs = str.toCharArray();
				int preX = 0;
				int preY = 0;
				int sum = 0;
				for(char c : chs) {
					int index = c -'0';
					
					int curX = loc[index][0];
					int curY = loc[index][1];
					sum += getDistance(preX, preY, curX, curY);
					preX = curX;
					preY = curY;
				}
				if(sum < min) min = sum;
			}
			
			return min;
		}
		
		private static int[][] getLocations(String[] locations){
			int[][] loc = new int[locations.length+1][2];
			for(int i = 0;i < locations.length;i++) {
				String[] str = locations[i].split(",");
				loc[i][0] = Integer.valueOf(str[0]);
				loc[i][1] = Integer.valueOf(str[1]);
			}
			loc[locations.length][0] = 0;
			loc[locations.length][1] = 0;
			return loc;
		}
		
		private static int getDistance(int preX,int preY,int curX,int curY) {
			int x = (curX - preX) * (curX - preX);
			int y = (curY - preY) * (curY - preY);
			
			return (int) Math.sqrt(x + y);
		}

}