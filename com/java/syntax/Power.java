package com.java.syntax;

public class Power {
	public static void main(String[] args) {
		int x= power(5,2);
		System.out.println(x);
	}
	public static int power(int base, int pow){
        int result=base;
        
        if (base>0) {
        	if (pow==0) {
        		result =1;
        	}
        	else if (pow >0) {
        		for (int i=2; i<=pow;i++) {
        			result = result*base;
        		}
        	}
        	else {
        		pow=pow*(-1);
        		for (int i=1; i<=pow;i++) {
        			result = 1/(result*base);
        		}
        	}
        }
        else if (base==0) {
        	result = 0;
        }
        else {
        	if (pow==0) {
        		result =1;
        	}
        	else if (pow >0) {
        		for (int i=2; i<=pow;i++) {
        			result = result*base;
        		}
        	}
        	else {
        		pow=pow*(-1);
        		for (int i=2; i<=pow;i++) {
        			result = 1/(result*base);
        		}
        	}
        	result = result*(-1);
        }
	
        
        return result;
	}
}
