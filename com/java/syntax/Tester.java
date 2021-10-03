package com.java.syntax;

import java.util.Scanner;

public class Tester {
public static void main(String[] args) {
	 Scanner s =new Scanner(System.in);
     System.out.println("Enter the number: ");
     double x = s.nextDouble();
     System.out.println("Enter the root to find: ");
     int p = s.nextInt();
     s.close();
     
     double temp = x;
     double pow =0;
     double ind =0;
     while(x>0) {
    	 if(x==1) {
    		 break;
    		 
    	 }
    	 if(x>=p) {
    		 ind ++; 
    	 }
    	 else {
    		for(double i =0.0000000001; i<=temp;i+=0.0000000001) {
    			pow = pow + (i);
    			if(Math.pow((ind+pow),p)>=temp) {
    				break;
    			}
    		}
    		break;
    	 }
    	 x/=p;
     }
     System.out.println(ind+pow);
}
    	
}
