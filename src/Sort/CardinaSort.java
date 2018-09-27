package Sort;

import java.util.Arrays;

public class CardinaSort {


public static void main(String args[]) {  
          
        int a [] = {400,31,53,72,6,29};  
        radixSort(a,10,3);  
         for(int m = 0;m < a.length;m++){  
               System.out.print(a[m]+",");  
           }  
    }  
      
      
      
      
    /** 
     * @param array 待排序数组 
     * @param radix 基数（10，盒子个数） 
     * @paramdistanced 待排序中，最大的位数 
     * */  
    private static void radixSort(int[] array,int radix, int distance) {    
        int length = array.length;    
        int[] temp = new int[length];//用于暂存元素    
        int[] count = new int[radix];//用于计数排序  盒子  每一位的个  
        int divide = 1;    
            
        for (int i = 0; i < distance; i++) {    
                
            System.arraycopy(array, 0,temp, 0, length);    
            Arrays.fill(count, 0);//盒子清空    
                
            for (int j = 0; j < length; j++) {//这个循环用来把每个数的个十百千位分开，并且使相对应号数的桶的个数增加1  
                //divide : 1 10 100  
                //radix : 基数 10  
                int tempKey = (temp[j]/divide) % radix;  //temp[j]/divide  每一位的个  
                count[tempKey]++;  //每一位的个  
            }    
              
            //radix : 基数 10    
            for (int j = 1; j < radix; j++) {    
                count [j] = count[j] + count[j-1];    
            }    
                
            //个人觉的运用 数排序实现计数排序的重点在下面这个方法                
            for (int j = length - 1; j >= 0; j--) {    
                int tempKey = (temp[j]/divide)%radix;    
                count[tempKey]--;    
                array[count[tempKey]] = temp[j];    
            }    
                
            divide = divide * radix; // 1 10 100                    
                
        }    
                    
    } 
}
