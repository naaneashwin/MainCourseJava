package com.java.syntax;

import java.util.Scanner;

public class RootFinder {
	public static void main(String[] args) {
	     Scanner s =new Scanner(System.in);
	     System.out.println("Enter the number: ");
	     int x = s.nextInt();
	     System.out.println("Enter the root to find: ");
	     int p = s.nextInt();
	     s.close();
	     System.out.println(rooter(x,p));
	    }
	public static int rooter (int x, int p) {
		int pow =1;
	     int ind =0;
	     while(x>=pow*p) {
	    	 pow = pow*p;
	    	 ind ++;
	     }
	    	
	     return ind;
	}
}
