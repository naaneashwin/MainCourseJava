package com.java.syntax;

public class FindTheNum {
	public static void main(String []args) {
		int x[]= {1,2,5,9,6,7,842,65,45};
		boolean flag=false;
		int num = 842;
		for (int i =0; i<x.length; i++) {
			if (x[i]== num) {
				flag = true;
				System.out.println(i);
				break;
			}
			
		}
		if (flag==true) {
		System.out.println("yes");
	}
		else System.out.println("No");
	
	}
}
