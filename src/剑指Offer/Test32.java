package ��ָOffer;

import java.math.BigDecimal;

/**
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
 * @author supercomputer
 *
 */
public class Test32 {

	
	// �ݹ�д��
	int add(int num1, int num2){
	    if(num2 == 0)
	        return num1;
	    int sum = num1 ^ num2;
	    int carry = (num1 & num2) << 1;
	    return add(sum, carry);
	}
	
	/*
	* a : ������
	* b : ����
	*/
	int divide(int a, int b){    
	    // ��ȡ�������ͳ����ľ���ֵ    
	    int dividend = a > 0 ? a : add(~a, 1);    
	    int divisor = b > 0 ? a : add(~b, 1);    

	    int quotient = 0;// ��    
	    int remainder = 0;// ����    
	    // �����ó���ȥ����������ֱ��������С�ڱ����������������ˣ�    
	    while(dividend >= divisor){// ֱ����С�ڱ�����        
	        quotient = add(quotient, 1);        
	        dividend =  Math.subtractExact(dividend, divisor);  
	    }    
	    // ȷ���̵ķ���    
	    if((a ^ b) < 0){// ��������ͱ�������ţ�����Ϊ����  
	        quotient = add(~quotient, 1);    
	    }    
	    // ȷ����������    
	    remainder = b > 0 ? dividend : add(~dividend, 1);    
	    return quotient;// ������
	}
}
