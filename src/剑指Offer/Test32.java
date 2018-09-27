package 剑指Offer;

import java.math.BigDecimal;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * @author supercomputer
 *
 */
public class Test32 {

	
	// 递归写法
	int add(int num1, int num2){
	    if(num2 == 0)
	        return num1;
	    int sum = num1 ^ num2;
	    int carry = (num1 & num2) << 1;
	    return add(sum, carry);
	}
	
	/*
	* a : 被除数
	* b : 除数
	*/
	int divide(int a, int b){    
	    // 先取被除数和除数的绝对值    
	    int dividend = a > 0 ? a : add(~a, 1);    
	    int divisor = b > 0 ? a : add(~b, 1);    

	    int quotient = 0;// 商    
	    int remainder = 0;// 余数    
	    // 不断用除数去减被除数，直到被除数小于被除数（即除不尽了）    
	    while(dividend >= divisor){// 直到商小于被除数        
	        quotient = add(quotient, 1);        
	        dividend =  Math.subtractExact(dividend, divisor);  
	    }    
	    // 确定商的符号    
	    if((a ^ b) < 0){// 如果除数和被除数异号，则商为负数  
	        quotient = add(~quotient, 1);    
	    }    
	    // 确定余数符号    
	    remainder = b > 0 ? dividend : add(~dividend, 1);    
	    return quotient;// 返回商
	}
}
