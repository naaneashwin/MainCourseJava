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
		int in=1;
		for(int i=1;i<=x;i++ ) {
			int pow = 1;
			for(int j=1;j<=p;j++) {
				pow = pow*i;
			}
			if(pow>x) {
				in = i-1;
				break;
			}
			else if(pow==x) {
				in = i;
				break;
			}
		}
	    	
	     return in;
	}
}
